import java.util.Scanner;
public class CountSort {
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
        countSort(arr);
    }
    public static void countSort(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        int [] countarray = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            countarray[arr[i]]++;
        }
        // For Change in Original array
        int j = 0;
        for (int i = 0; i < countarray.length; i++) {
            while (countarray[i]>0) {
                arr[j] = i;
                j++;
                countarray[i]--;
            }
        }
        // Sorted array
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");            
        }
        System.out.println();
        
        // For printing sorted array without any change in original array
        // System.out.print("Sorted array : ");
        // for (int i = 0; i < countarray.length; i++) {
        //     for (int k = 0; k < countarray[i]; k++) {
        //         System.out.print(i +" ");
        //     }
        // }
        // System.out.println();
    }
}
