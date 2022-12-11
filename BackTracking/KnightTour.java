public class KnightTour {
    public static void main(String[] args) {
        int n = 8;
        int board[][]=new int[n][n];
        // knightTour(board, 0, 0, 0);
        System.out.println(oneSolKnightTour(board, 0, 0, 0));
        // System.out.println(countKnightTourWays(board, 0, 0, 0));
    }
    public static void knightTour(int [][] board,int step,int row,int col) {
        // Base Condition
        if(step==(board.length*board.length)){
            printMaze(board);
            return;
        }
        if(col>=board.length ||row>=board.length||col<0 || row<0||board[row][col]!=0){
            return;
        }
        board[row][col]=step;
        int[][] Directions={
            {2,1},
            {2,-1},
            {-2,+1},
            {-2,-1},
            {1,2},
            {-1,2},
            {1,-2},
            {-1,-2},
        };
        for (int i = 0; i < Directions.length; i++) {
            knightTour(board, step+1, row+Directions[i][0], col+Directions[i][1]);
        }
        board[row][col]=0;
    }
    public static boolean oneSolKnightTour(int [][] board,int step,int row,int col) {
        if(step==(board.length*board.length)){
            printMaze(board);
            return true;
        }
        if(col>=board.length ||row>=board.length||col<0 || row<0||board[row][col]!=0){
            return false;
        }
        int[][] Directions={
            {2,1},
            {2,-1},
            {-2,+1},
            {-2,-1},
            {1,2},
            {-1,2},
            {1,-2},
            {-1,-2},
        };
        for (int i = 0; i < Directions.length; i++) {
            int nextRow = row+Directions[i][0];
            int nextCol = col+Directions[i][1];
            board[row][col]=step;
            // RatInMaze.printMaze(board);
            if (oneSolKnightTour(board, step+1, nextRow, nextCol)) {
                return true;
            }
            board[row][col]=0;
        }
        return false;
    }
    public static int countKnightTourWays(int [][] board,int step,int row,int col) {
        if(step==(board.length*board.length)){
            // printMaze(board);
            return 1;
        }
        if(col>=board.length ||row>=board.length||col<0 || row<0||board[row][col]!=0){
            return 0;
        }
        // board[row][col]=step;
        int[][] Directions={
            {2,1},
            {2,-1},
            {-2,+1},
            {-2,-1},
            {1,2},
            {-1,2},
            {1,-2},
            {-1,-2},
        };
        int count=0;
        board[row][col]=step;
        for (int i = 0; i < Directions.length; i++) {
            count += countKnightTourWays(board, step+1,row+Directions[i][0], col+Directions[i][1]);
        }
        board[row][col]=0;
        return count;
    }
    public static void printMaze(int [][] maze) {
        System.out.println("-----------Maze-----------");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
