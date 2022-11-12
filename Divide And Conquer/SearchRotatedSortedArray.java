
public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        
    }
    public static int search(int[] nums, int target,int si,int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (si-ei)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[si]<=nums[mid]){
            if(nums[si]<=target && nums[mid]>=target)
            return search(nums, target, si, mid-1);
            else return search(nums, target, mid+1, ei);
        }
        else{
            if (nums[mid]<=target && nums[ei]>=target) {
                return search(nums, target, si, mid-1);
            }else return search(nums, target, mid+1, ei);
        }
    }
    
}