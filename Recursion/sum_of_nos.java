package Recursion;
// Print sum of first n natural numbers

public class sum_of_nos{
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
           return (n+sum(n-1)); 
        }
    }

    public static void sum1(int i, int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        else{
            sum=sum+i;
            sum1(i+1, n, sum);
        }
    }

    public static void main(String[] args){
        System.out.println(sum(3));
        sum1(1, 3, 0);
    }
}
