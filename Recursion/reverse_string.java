package Recursion;
//Reverse the string using recursion

public class reverse_string {
    public static void reverse(String s, int index){
        if(index==0){
            System.out.print(s.charAt(0));
        }
        else{
            System.out.print(s.charAt(index));
            reverse(s, index-1);
        }
    }

    public static void main(String[] args){
        String s ="abcde";
        /* reverse(s,s.length()-1); */
        reverse1(s, s.length()-1);
    }

    public static void reverse1(String s, int index){
        if(index==0){
            System.out.print(s.charAt(0));
            return;
        }
        else{
            System.out.print(s.charAt(index));
            reverse1(s, index-1);
        }
    }
}
