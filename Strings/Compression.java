import java.util.Scanner;
public class Compression {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(compress(str));
    }
    public static StringBuilder compress(String str) {
        StringBuilder sd = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sd.append(str.charAt(i));
            if (count>1) {
                sd.append(count.toString());
            }
        }
        return sd;
    }
}
