public class Homework{
    
    
    public static void main(String[] args) {
        int n = 5;
        int maze[][]=new int[n][n];
        // setMazeto1(maze);
        // maze[1][1]=0;
        // maze[1][2]=0;
        // System.out.println(ratInMazeWays(maze, 0, 0, n));
        // ratinMazeAllWays(maze, 0, 0, n);
        // KnightTour.knightTour(maze, 0, 0, 0);
        // System.out.println( KnightTour.oneSolKnightTour(maze, 0, 0, 0));
        System.out.println(KnightTour.countKnightTourWays(maze, 0, 0, 0));
    }
    
}
class RatInMaze{
    public static void printMaze(int [][] maze) {
        System.out.println("-----------Maze-----------");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setMazeto1(int [][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j]=1;
            }
        }
    }
    public static void ratinMazeAllWays(int maze[][],int row,int col,int n) {
        if( col==n || row==n ){
            return;
        }
        if (row==n-1&&col==n-1) {
            maze[row][col]=5;
            Maze.printMaze(maze);
            return;
        }
        if (maze[row][col]==0) {
            return;
        }
        maze[row][col]=5;
        ratinMazeAllWays(maze, row+1, col, n);
        ratinMazeAllWays(maze, row, col+1, n);
        maze[row][col]=1;
    }
    public static int ratInMazeWays(int maze[][],int row,int column,int n) {
        if(row==n || column==n){
            return 0;
        }
        if (row==n-1&&column==n-1) {
            return 1;
        }
        if (maze[row][column]==0) {
            return 0;
        }
        return ratInMazeWays(maze, row, column+1, n)+ratInMazeWays(maze, row+1, column, n);
    }
}
class KnightTour{
    public static void knightTour(int [][] board,int step,int row,int col) {
        // Base Condition
        if(step==(board.length*board.length)){
            Maze.printMaze(board);
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
            Maze.printMaze(board);
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
            if (oneSolKnightTour(board, step+1, nextRow, nextCol)) {
                return true;
            }
            board[row][col]=0;
        }
        return false;
    }
    public static int countKnightTourWays(int [][] board,int step,int row,int col) {
        if(step==(board.length*board.length)){
            // Maze.printMaze(board);
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
}
class Maze{
    public static void printMaze(int [][] maze) {
        System.out.println("-----------Maze-----------");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setMazeto1(int [][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                maze[i][j]=1;
            }
        }
    }
}