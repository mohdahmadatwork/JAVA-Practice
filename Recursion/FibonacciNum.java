import java.util.Scanner;
public class FibonacciNum {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(n+"th fibonacci number is "+fibonacciNum(n));
    }
    public static int fibonacciNum(int n) {
        if (n==1) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        return fibonacciNum(n-1)+fibonacciNum(n-2);
    }
}
