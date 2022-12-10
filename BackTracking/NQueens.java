public class NQueens {
    static int count = 0;
    public static void main(String[] args) {
        int n=2;
        char [][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        // nQueens(board, 0);
        // System.out.println("Total number of ways to place n queens: "+count);
        if (nQueens_print_1_sol(board, 0)) {
            System.out.println("Sol is possible : ");
            printBoard(board);
        }else{
            System.out.println("Sol is not possible");
        }
    }
    public static void printBoard(char board[][]) {
        System.out.println("----------Chess board------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void nQueens(char board[][],int row) {
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                nQueens(board, row+1);
                board[row][i] = 'X';
            }
        }
    }
    // Printing only one sol of n queens
    public static boolean nQueens_print_1_sol(char board[][],int row) {
        if(row==board.length){
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                if(nQueens_print_1_sol(board, row+1)){
                    return true;
                }
                board[row][i] = 'X';
            }
        }
        return false;
    }
    public static boolean isSafe(char[][]board,int row,int col) {
        // Vertical up
        for (int i=row-1; i >=0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        // right diagonal
        for (int i=row-1, j = col+1; i >=0 && j <board.length; i--,j++) {
            // for (; ; ) {
            if (board[i][j]=='Q') {
                return false;
            }
        }
        // left Diagonal
        for (int i=row-1,j = col-1; i >=0 && j >= 0; i--,j--) {
            if (board[i][j]=='Q') {
                return false;
            }
        }

        return true;
        
    }
}
