package Recursion;
// Sum of digit of a number
public class sum_of_digit_of_no {
    public static int sumDigit(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10 + sumDigit(n/10));
        }
    }

    public static void main(String[] args){
        System.out.println(sumDigit(12345));
    }
}
