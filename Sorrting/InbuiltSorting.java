// Complexity of inbuilt sort is O(n log n)
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSorting {
    public static void main(String[] args) {
        System.out.println("Enter Number of element to be entered : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer [] arr = new Integer[size];
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        // For simple sorting
        Arrays.sort(arr);
        
        // For sub Array 
        Arrays.sort(arr,0,3);

        // For sorting in decending order
        // Collections.reverseOrder() does not work on primitive data type so we need Integer class type array
        Arrays.sort(arr,Collections.reverseOrder());

        // For sorting in decending order in SubArray
        Arrays.sort(arr,0,3,Collections.reverseOrder());

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");            
        }
        System.out.println();
    }
}
