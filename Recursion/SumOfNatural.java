import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of all natural number from 1 to "+n+" is "+sumOfNatural(n));
    }
    public static int sumOfNatural(int n) {
        if(n==1){
            return 1;
        }
        return n+sumOfNatural(n-1);
    }
}
