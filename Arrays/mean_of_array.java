package Arrays;
//Find the mean of the array
public class mean_of_array {
    public static float mean(int[] nums, float sum,int index){
        if(index==nums.length){
            return sum/nums.length;
        }
        else{
            return mean(nums, sum+nums[index],index+1);
        }
    }

    public static void main(String[]args){
        int [] nums ={1,2};
        System.out.print(mean(nums, 0, 0));
    }
}
