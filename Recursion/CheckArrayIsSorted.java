import java.util.Scanner;
public class CheckArrayIsSorted {
    public static void main(String[] args) {
        System.out.println("Enter how many element do you want to enter: ");
        int numberOfEmlement;
        Scanner sc = new Scanner(System.in);
        numberOfEmlement = sc.nextInt();
        int [] arr = new int[numberOfEmlement];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < numberOfEmlement; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(isSorted(arr, 0));
    }
    public static boolean isSorted(int [] arr,int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
}
