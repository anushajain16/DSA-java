package Sorting;
// Check if the array is sorted or not

public class array_sorted {
    public static void checkSort(int arr[],int index){
        if(index==arr.length-1){
            System.out.println("Array is strictly increasing");
            return;
        }
        else{
            if(arr[index]<arr[index+1]){
                checkSort(arr, index+1);
            }
            else{
                System.out.println("Array is not increasing");
            }
        }
    }

    public static void checkSort1(int arr[], int index){ // Check if in descending order
        if(index==arr.length-1){
            System.out.println("Array is strictly decreasing");
        }
        else{
            if(arr[index]>arr[index+1]){
                checkSort1(arr, index+1);
            }
            else{
                System.out.println("Array is not decreasing");
            }
        }
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,4,4}; 
        int arr1[] ={5,4,3,2,1};
        checkSort(arr, 0);
        checkSort1(arr1, 0);
    }
}
