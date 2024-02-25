package Arrays;
public class max_Subarray_Sum{
    public static void maxSum(int[] nums){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            for(int j=i; j<nums.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum=currSum+nums[k];
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        } 
        System.out.println("Maximum Subarray Sum = "+maxSum);
    }

    public static void maxSum1(int [] nums){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum=currSum+nums[i];
            if(currSum<0){
                currSum=0;
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
        
        System.out.println("Max Subarray Sum = "+maxSum);
    }

    public static void main(String[]args){
        int [] nums ={2,-3,4,-1,-2,1,5,-3};
        maxSum(nums);
        maxSum1(nums);
    }
}