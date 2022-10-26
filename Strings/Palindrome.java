import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        boolean ispalindrome = true;
        int st =0,end=str.length()-1;
        while (st!=end) {
            if(str.charAt(end)!=str.charAt(st)){
                ispalindrome = false;
            }
            st++;
            end--;
        } 
        if (ispalindrome) {
            System.out.println(str+" is palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }

    } 
}
