public class BinaryString {
    public static void main(String[] args) {
        printBinaryString(5, 0,"");
    }
    public static void printBinaryString(int n,int last,String str) {
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+"0");
        if (last==0) {
            printBinaryString(n-1, 1, str+"1");
        }
    }
}
