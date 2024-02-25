package Recursion;

public class first_occurance {
    public static int first(int[] arr, int key, int index){
        if(arr[index]==key){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }
        else{
            return first(arr,key,index+1);
        }
       
    }

    public static void main(String[]args){
        int [] nums = {8,3,6,9,5,10,2,5,3};
        System.out.println(first(nums,11,0));
    }
}
