import java.util.Scanner;
public class FirstOccurence {
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
        System.out.print("Enter the Element to search: ");
        int key = sc.nextInt();
        sc.close();
        System.out.println(firstOccurrence(arr, key, 0));
        System.out.println(lastOccurrence(arr, key, numberOfEmlement-1));
    }
    public static int  firstOccurrence(int [] arr,int key,int i) {
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            System.out.println("Not found");
            return -1;
        }
        return firstOccurrence(arr, key, i+1);
    }
    public static int  lastOccurrence(int [] arr,int key,int i) {
        if(i==-1){
            System.out.println("Not found");
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurrence(arr, key, i-1);
    }
}
