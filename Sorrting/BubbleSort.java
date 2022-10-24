import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter Number of element to be entered : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();        
        bubbleSort(arr);
    }
    public static void bubbleSort(int[]arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}