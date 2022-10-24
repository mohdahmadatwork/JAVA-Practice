// import java.util.Scanner;
// public class MaxSubarraySum {
//     public static void main(String[] args) {
//         System.out.println("Enter how many element do you want to enter: ");
//         int numberOfEmlement;
//         Scanner sc = new Scanner(System.in);
//         numberOfEmlement = sc.nextInt();
//         int [] arr = new int[numberOfEmlement];
//         System.out.println("Enter the elements: ");
//         for (int i = 0; i < numberOfEmlement; i++) {
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Max sum of sub arrays is : "+BruteForce(arr));
//         sc.close();
//     }
//     public static int BruteForce(int [] arr) {
//         int maxsum =Integer.MIN_VALUE,currentsum=0;
//         int start,end;
//         for (int i = 0; i < arr.length; i++) {
//             start = i;
//             for (int j = i+1; j < arr.length; j++) {
//                 end = j;
//                 currentsum=0;
//                 for (int k = start; k < end; k++) {
//                     currentsum+=arr[k];
//                 }
//                 if(currentsum>maxsum){
//                     maxsum = currentsum;
//                 }
//             }
//         }
//         return maxsum;
//     }
//     public static int prifixSum(int [] arr) {
//         int prefix_array_of_Sum[] = new int [arr.length];
//         int maxsum =Integer.MIN_VALUE,currentsum=0;
//         for(int i=0;i<arr.length;i++){
//             prefix_array_of_Sum[i]=prefix_array_of_Sum[i-1]+arr[i];
//         }
//         for(int i=0;i<prefix_array_of_Sum.length;i++){
//             for (int j = 0; j < .length; j++) {
//                 currentsum =  
//             }
//         } 
//         return 0;
//     }
// }
