import java.util.Scanner;
public class InsertionSort {
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
        insertionSort(arr);
    }
    public static void insertionSort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = i-1;
            while (temp >=0 && arr[temp]>arr[i]){
                if(arr[i]<arr[temp]){
                    int tempvar = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = tempvar;
                }
                temp--;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
