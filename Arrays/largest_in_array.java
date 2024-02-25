package Arrays;
public class largest_in_array {
    public static void main(String[]args){
        int[] nums ={1,2,-6,3,5};
        int large = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>=large){
                large=nums[i];
            }
        }
        System.out.println("The largest number in the array is "+large);
    }
}
