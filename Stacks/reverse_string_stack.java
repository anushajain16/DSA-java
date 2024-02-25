package Stacks;
import java.util.*;
public class reverse_string_stack {
    public static void reverse(String a){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<a.length();i++){
            s.push(a.charAt(i));
        }

        while(s.isEmpty()!=true){
            System.out.print(s.pop());
        }
    }
    public static void main(String[]args){
        Stack<Character> s = new Stack<>();
        reverse("abc");
    }
}
