import java.util.Scanner;
public class SelectionSort {
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
        selectionSort(arr);

    }
    public static void selectionSort(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int index = i ;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int tempvar = arr[i];
            arr[i] = min;
            arr[index] = tempvar;
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");            
        }
        System.out.println();
    }
}
