import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Enter Power : ");
        int power = sc.nextInt();
        sc.close();
        System.out.println(pow(number, power));
        // System.out.println(optimizePow(number, power));
    }
    public static int pow(int number,int power) {
        if(power == 0){
            return 1;
        }
        return number*pow(number, power-1);
    }
    public static int optimizePow(int number,int power) {
        if(power==0){
            return 1;
        }
        int halfPower = optimizePow(number, power/2);
        int halfPowerSq = halfPower*halfPower;
        if(power%2!=0){
            halfPowerSq = number * halfPowerSq;
        }
        return halfPowerSq;
    }
}
