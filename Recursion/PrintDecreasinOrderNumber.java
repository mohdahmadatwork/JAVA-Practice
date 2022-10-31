import java.util.Scanner;
public class PrintDecreasinOrderNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.err.print("Number in decreasing order: ");
        printDec(n);
        System.out.println();
        System.err.print("Number in increasing order: ");
        printInc(n);
    }
    public static void printDec(int n) {
        System.out.print(n+" ");
        if (n<1) {
            return;
        }
        printDec(--n);
    }
    public static void printInc(int n) {
        if (n<0) {
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
}