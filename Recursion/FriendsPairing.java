public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendsPairingProlem(3));
    }
    public static int friendsPairingProlem(int n) {
        if(n==1 || n==2){
            return n;
        }
        return friendsPairingProlem(n-1)+(n-1)*friendsPairingProlem(n-2);
    }
}
