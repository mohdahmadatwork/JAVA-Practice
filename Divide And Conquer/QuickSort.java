public class QuickSort {
    public static void divide(int [] arr,int p,int r) {
        if(p<r){
            int q = conquer(arr,p,r);
            divide(arr, p, q-1);
            divide(arr, q+1,r);
        }
    }
    public static int conquer(int [] arr,int p,int r) {
        int x = arr[r];//choosing Pivot
        int i = p-1;
        for (int j = p; j <= r-1; j++) {
            if (arr[j]<=x) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
    public static void main(String[] args) {
        int Array [] = {1,4,2,3,6,5,7};  
        MergeSort.printArr(Array);
        divide(Array, 0, Array.length-1);
        MergeSort.printArr(Array);
    }
}
