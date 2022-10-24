import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows do you want : ");
        int row = sc.nextInt();
        System.out.println();
        System.out.print("Enter how many rows do you want : ");
        int col = sc.nextInt();
        System.out.println();
        System.out.println("Enter Elements row wise: ");
        int [][] arr2 = new int[row][col];
        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Sum of the diagonals : "+diagonalSum(arr2));
    }
    public static int diagonalSum(int [][] mat) {
        int pds =0;
        int sds = 0;
        int j=mat.length;
        for (int i = 0; i < mat.length; i++) {
            pds += mat[i][i];
            if (i != j-1-i) {
                sds += mat[i][j-1-i];
            }
            
        }
        return pds+sds;
    }
}
