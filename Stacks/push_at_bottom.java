package Stacks;
import java.util.*;
public class push_at_bottom {

    public static void pushBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s, data);
        s.push(top);
    } 
    public static void main(String[]args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottom(s, 4);
        while(s.isEmpty()!=true){
            System.out.println(s.pop());
        }
    }
}
