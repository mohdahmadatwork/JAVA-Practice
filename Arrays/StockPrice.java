import java.util.Scanner;
public class StockPrice {
    public static void main(String[] args) {
        System.out.println("Enter how many day's Data do you Want to enter : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int buyingprice = Integer.MAX_VALUE,sellingprice=0;
        int profit = 0;
        for (int i = 0; i < size; i++) {
            if(buyingprice<arr[i]){
                if (arr[i]-buyingprice>profit) {
                    profit =  arr[i]-buyingprice;
                    sellingprice = arr[i];
                }
            }
            else{
                buyingprice = arr[i];
            }
        }
        System.out.println("Buying Price should be : "+buyingprice);
        System.out.println("Selling Price should be : "+sellingprice);
        System.out.println("Max profit should be : "+profit);
    }
}
