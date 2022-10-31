public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");
    }
    public static void towerOfHanoi(int n,String scr,String helper,String dest) {
        if(n==1){
            System.out.println("transfered disk "+n+" from "+scr+" "+dest);
            return;
        }
        towerOfHanoi(n-1, scr, dest,helper);
        System.out.println("transfered disk "+ n +" from " +scr+" "+dest);
        
        towerOfHanoi(n-1, helper, scr, dest);
    }
}
