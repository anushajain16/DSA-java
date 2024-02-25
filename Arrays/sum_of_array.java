package Arrays;
//Find the sum of the array

public class sum_of_array {
    public static int sum(int[] nums, int sum,int index){
        if(index==nums.length){
            return sum;
        }
        else{
           return sum(nums,sum+nums[index], index+1);
        }
    } 
    
    public static void main(String[]args){
        int[] nums = {1,2,3,4,5};
        System.out.print(sum(nums, 0, 0));
    }
}


