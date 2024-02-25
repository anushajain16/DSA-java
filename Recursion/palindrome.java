package Recursion;
//Check if a string is Palindrome or not 
public class palindrome {
    public static boolean checkPalindrome(String s,int index, int n){
        if(index==n-1){
            System.out.println("String is palindrome");
            return true;
        }
        else if(s.charAt(index)==s.charAt(n-1)){
           return checkPalindrome(s, index+1, n-1);
        }
        else{
            System.out.println("String is not a palindrome");
            return false;
        }
    }

    public static void main(String[] args){
        String s="anusha";
        checkPalindrome(s, 0, s.length());
    }
}
