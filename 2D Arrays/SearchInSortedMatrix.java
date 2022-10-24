import java.util.Scanner;
public class SearchInSortedMatrix {
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
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        sc.close();
        stairCaseSearch(arr2,key);
    }
    public static void stairCaseSearch(int[][] matrix, int target) {
        int i=0,j=matrix.length-1,n=j;
        while (i!=n && j!=0) {
            if (matrix[i][j]==target) {
                System.out.println("Found at: ("+i+","+j+")");
                break;
            }
            else if(matrix[i][j]>target){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
