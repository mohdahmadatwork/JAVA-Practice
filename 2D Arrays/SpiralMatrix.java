import java.util.Scanner;
public class SpiralMatrix {
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
        printSpiral(arr2);
    }
    public static void printSpiral(int [][] matrix) {
        int startrow =0,endrow=matrix.length-1;
        int startcol =0,endcol = matrix[0].length-1;
        System.out.println("Spiral : ");
        while (startrow<=endrow && startcol<=endcol) {
            // Top boundary
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startrow][i]+" ");
            }
            // right boundary
            for (int i = startrow+1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom boundary
            for (int i = endcol-1; i >= startcol; i--) {
                if (startrow==endrow) {
                    break;
                }
                System.out.print(matrix[endrow][i]+" ");
            }
            //leftboundary
            for (int i = endrow-1; i > startrow; i--) {
                if (startcol==endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
    
}