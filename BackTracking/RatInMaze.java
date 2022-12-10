public class RatInMaze {
    public static void main(String[] args) {
        // int maze[][]=new int[n][n];
        // setMazeto1(maze);
        // maze[1][1]=0;
        // maze[1][2]=0;
        int maze[][] =  {{ 1, 0, 0, 0 },{ 1, 1, 0, 1 },{ 0, 1, 0, 0 },{ 1, 1, 1, 1 } };
        int [][] sol = new int [maze.length][maze.length];
        // System.out.println(ratInMazeWays(maze, 0, 0, n));
        ratinMazeAllWays(maze, 0, 0, sol);
    }
    public static void ratinMazeAllWays(int maze[][],int row,int col,int[][]sol) {
        if( col==maze.length|| row==maze.length || row<0 || col<0){
            return;
        }
        if (maze[row][col]==0) {
            return;
        }
        if (row==maze.length-1&&col==maze.length-1) {
            maze[row][col]=1;
            sol[row][col]=1;
            // printMaze(maze);
            printMaze(sol);
            return;
        }
        int[][] Directions ={
            {1,0},//down
            {0,1},//right
        };
        maze[row][col]=1;
        sol[row][col]=1;
        for (int i = 0; i < Directions.length; i++) {
            int nextRow = row+Directions[i][0];  
            int nextCol = col+Directions[i][1];  
            ratinMazeAllWays(maze, nextRow, nextCol,sol);
        }
        sol[row][col]=0;
        maze[row][col]=0;
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
