public class Practice {
    public static void main(String[] args) {
        // int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // allIdx(arr, 0, key);
        // System.out.println();
        // String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        // conv(2019, digits);
        // System.out.println(lngth("Ahmad"));
        String str = "abcab";
        int n = str.length();
        System.out.println(contiguous( str, 0, n-1, n));
    }
    public static void allIdx(int arr[],int idx,int key) {
        if(idx == arr.length){
            return;
        }
        if (key == arr[idx]) {
            System.out.print(idx+" ");
        }
        allIdx(arr, idx+1, key);
    }
    public static void conv(int num,String digits[]) {
        if(num==0){
            return;
        }
        int lastdigit = num%10;
        conv(num/10, digits);
        System.out.print(digits[lastdigit]+" ");
    }
    public static int lngth(String str) {
        if(str.length() == 0){ 
            return 0;
        }
        return lngth(str.substring(1))+1;
    }
    public static int  contiguous(String str,int start,int end,int length) {
        if(length==1){
            return 1;
        }
        if(length <=0){
            return 0;
        }
        int res = contiguous(str, start+1, end, length-1)+contiguous(str,start, end-1, length-1)-contiguous(str, start+1, end-1, length-2);
        if(str.charAt(start)==str.charAt(end)){
            res++;
        }
        return res;
    }
}
