package Recursion;
//Calculate gcd of two numbers using recursion
public class gcd {
    public static int hcf(int n1, int n2){
        if(n2==0){
            return n1;
        }
        else{
            return hcf(n2, n1%n2);
        }
    }
    public static void main(String[]args){
        System.out.println(hcf(20, 36));
    }
}
