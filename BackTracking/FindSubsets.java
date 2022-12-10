public class FindSubsets {
    public static void main(String[] args) {
        findSubsets("abc", 0, "");
    }
    public static void findSubsets(String str,int index,String reqStr) {
        if(index==str.length()){
            System.out.println(reqStr);
            return;
        }
        findSubsets(str, index+1, reqStr);
        findSubsets(str, index+1, reqStr+str.charAt(index));
    }
}
