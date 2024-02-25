package Recursion;

public class last_occurance {
    public static int last(int [] arr, int key, int index){
        if(arr[index]==key){
            return index;
        }
        if(index==0){
            return -1;
        }
        else{
            return last(arr, key, index-1);
        }
    }

    public static void main(String[]args){
        int [] nums = {8,3,6,9,5,10,2,5,3};
        System.out.println(last(nums, 11, nums.length-1));
    }
}
