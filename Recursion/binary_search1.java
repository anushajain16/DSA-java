package Recursion;
public class binary_search1 {
    public static int binarySearch1(int start, int end, int [] nums,int key){
        
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==key){
                return mid;
            }
            if(nums[mid]>key){
                return binarySearch1(start, mid-1, nums, key);
            }
            if(nums[mid]<key){
                return binarySearch1(mid+1, end, nums, key);
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int [] nums = {1,2,3,4,5,6,7,8};
        System.out.println("Element is present at "+binarySearch1(0, nums.length-1, nums, 9));
    }
}
