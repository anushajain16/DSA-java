package Sorting;
public class sortedsearch {
    public static int sortsearch(int num, int[] arr, int index){
        if (index >= arr.length) {
            return -1;  
        }
        if(arr[index]==num){
            return index;
        }
        else if(arr[index]>num){
            return -1;
        }
        else{
            int result = sortsearch(num, arr, index+1);
            return result;
        }
    }
    public static void main(String[] args){
        int[] arr = {4,9,11,28, 104, 111, 293, 357, 471};
        System.out.println(sortsearch(28, arr, 0));
    }
}
