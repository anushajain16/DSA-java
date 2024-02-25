package Heap;

public class heapsort {
    public static void heapsort(int [] arr){

        // step 1 - make a max heap
        int n=arr.length;
        for(int i = n/2;i>=0;i--){
            heapify(i,arr,n);
        }

        // step 2- swap first and last element
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(0, arr, i);
        }
        
    }

    public static void heapify(int i,int[]arr,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left<size && arr[maxIdx]<arr[left]){
            maxIdx=left;
        }
        if(right<size && arr[maxIdx]<arr[right]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            int temp = arr[maxIdx];
            arr[maxIdx]=arr[i];
            arr[i]=temp;

            heapify(maxIdx, arr,size);
        }
    }

    public static void main(String[] args) {
        int [] arr ={1,2,4,5,3};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
