import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of "+n+" is "+fact(n));
    }
    public static int fact(int n) {
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
