package Sorting;
public class linear_search{
    public static int linearSearch(int[] nums,int k){
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                return i;
            }      
        }
        return -1;
    }
    public static void main(String[]args){
        int[] nums = {2,4,6,8,10,12,14,16};
        int answer=linearSearch(nums, 1);
        if(answer==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Element found at "+answer);
        }
    }
}
