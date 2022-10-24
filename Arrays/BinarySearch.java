import java.util.Scanner;

/**
 * BinarySearch
 * Date :- 20/10/2022
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter how many element do you want to enter: ");
        int numberOfEmlement;
        Scanner sc = new Scanner(System.in);
        numberOfEmlement = sc.nextInt();
        int [] arr = new int[numberOfEmlement];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < numberOfEmlement; i++) {
            arr[i]=sc.nextInt();
            int tempIndex =i;
            while (tempIndex>0 && arr[tempIndex]<arr[tempIndex-1]) {
                int tempVar = arr[tempIndex];
                arr[tempIndex] = arr[tempIndex-1];
                arr[tempIndex-1] = tempVar;
                tempIndex = tempIndex-1;
            }
        }
        System.out.println("Your sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        int index = binarySearch(arr, key);
        if (index!=-1) {
            System.out.println(key +" found in index "+index);
        }
        else{
            System.out.println(key +" is not present ");
        }
        sc.close();
    }

    public static int binarySearch(int[]arr,int key) {
        int start=0,end=arr.length - 1;
        while (start <= end ) {
            int index = (start + end )/2;
            if (arr[index]<key) {
                start = index +1;
            }
            else if(arr[index]>key){
                end=index-1;
            }
            else{
                return index;
            }
        }
        return -1;
    }
}