public class FindPermutation {
    public static void main(String[] args) {
        findPermutation("null", "");
    }
    public static void findPermutation(String str,String reqStr) {
        if (str.length()==0) {
            System.out.println(reqStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            findPermutation(newStr, reqStr+curr);
        }
    }
}
