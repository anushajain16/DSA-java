package Arrays;

public class reverse_array {
    public static void reverse(int [] nums,int first,int last){
        if(first>=nums.length/2){
            return;
        }
            
        int temp = nums[first];
        nums[first]=nums[nums.length-1-first];
        nums[nums.length-1-first]=temp;
        reverse(nums, first+1, last-1);
    }

    public static void main(String[]args){
        int [] nums = {1,2,3,4,5};
        reverse(nums, 0, nums.length);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        
    }
}
