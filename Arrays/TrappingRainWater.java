import java.util.Scanner;
public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println("Enter Number of element to be entered : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        trappingRainWater(arr,size);
        
    }
    public static void trappingRainWater(int[] arr,int size) {
        if(size<=2){
            System.out.println("No water will trap");
            return;
        }
        boolean asc = true,dsc=true;
        for (int i = 0; i < size-1; i++) {
            if(arr[i]<arr[i+1]){
                asc=false;
                break;
            }
        }
        if (asc) {
            System.out.println("No water will trap");
            return;
        }
        for (int i = 0; i < size; i++) {
            if(arr[i]>arr[i+1]){
                dsc=false;
                break;
            }
        }
        if (dsc) {
            System.out.println("No water will trap");
            return;
        }
        int [] left_max_boundary = new int [size];
        int [] right_max_boundary = new int [size];
        left_max_boundary[0]=arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i]>left_max_boundary[i-1]){
                left_max_boundary [i] = arr[i];
            }
            else{
                left_max_boundary [i] = left_max_boundary[i-1];
            }
        }
        // System.out.print("Left max array : ");
        // for (int i = 0; i < size; i++) {
        //     System.out.print(left_max_boundary[i]+" ");
        // }
        // System.out.println();
        
        
        right_max_boundary[size-1] = arr[size-1];
        for (int i = size-2; i >= 0; i--) {
            if(arr[i]>right_max_boundary[i+1]){
                right_max_boundary [i] = arr[i];
            }
            else{
                right_max_boundary [i] = right_max_boundary[i+1];
            }
        }
        // System.out.print("right max array : ");
        // for (int i = 0; i < size; i++) {
        //     System.out.print(right_max_boundary[i]+" ");
        // }
        // System.out.println();
        int sum = 0;
        for (int i = 0; i <size; i++) {
            if(left_max_boundary[i]<right_max_boundary[i]){
                if (left_max_boundary[i]-arr[i] < 0) {
                    sum += 0;
                }
                else{
                    sum += left_max_boundary[i]-arr[i];
                }
            }
            else{
                if (right_max_boundary[i]-arr[i] < 0) {
                    sum += 0;
                }
                else{
                    sum += right_max_boundary[i]-arr[i];
                }
            }
            
        }
        System.out.println("Total water trapped : "+sum);
    }
}
