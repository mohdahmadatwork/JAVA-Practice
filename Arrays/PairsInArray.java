import java.util.Scanner;
public class PairsInArray {
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
        pairsInArray(arr);
    }
    public static void pairsInArray(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("("+arr[i]+" "+arr[j]+")");
            }
        }
    }
}
