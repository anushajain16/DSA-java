package Queues;
import java.util.Stack;

public class queue_using_stacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            if(s1.isEmpty()==true){
                return true;
            }
            else{
                return false;
            }
        }

        public static void add(int d){
            if(s1.isEmpty()==true){
                s1.push(d);
            }
            else{
                while(s1.isEmpty()!=true){
                    s2.push(s1.pop());
                }
                s1.push(d);

                while(s2.isEmpty()!=true){
                    s1.push(s2.pop());
                }
            }
        }

        public static int remove(){
            if(s1.isEmpty()==true){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
    }
}


