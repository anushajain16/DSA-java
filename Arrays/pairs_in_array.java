package Arrays;
import java.util.*;
public class pairs_in_array {
    public static void pairs(int[]nums, List<Integer> curr, List<List<Integer>> result, int k,int index){
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        else{
            for(int i=index; i<nums.length;i++){
                if(i>index && nums[i-1]==nums[i]){
                    continue;
                }
                curr.add(nums[i]);
                pairs(nums, curr, result, k,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
    public static List<List<Integer>> pairArray(int[]nums){
        List<List<Integer>> result = new ArrayList<>();
        pairs(nums, new ArrayList<>(), result, 2,0);
        return result;
    }
    public static void main(String[]args){
        
        int [] nums ={2,4,6,8,10};
        Arrays.sort(nums);
        System.out.println(pairArray(nums));
    }

    
}
