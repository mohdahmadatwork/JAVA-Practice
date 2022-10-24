import java.util.Scanner;
public class SubArray {
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
        subArray(arr);
        sc.close();
    }
    public static void subArray(int [] arr) {
        int start,end;
        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = i+1; j < arr.length; j++) {
                end = j;
                System.out.print("( ");
                for (int k = start; k < end; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println(" )");
            }
        }
    }
}
