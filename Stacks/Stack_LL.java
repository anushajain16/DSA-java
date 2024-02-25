package Stacks;
public class Stack_LL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()==true){
                head=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }

        public static int pop(){
            if(isEmpty()==true){
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()==true){
                return-1;
            }
            return head.data;
        }

        public static void main(String[]args){
            Stack s = new Stack();
            s.push(0);
            s.push(2);
            s.push(4);

            while(s.isEmpty()!=true){
                System.out.print(s.peek()+" ");
                s.pop();
            }
        }
    }
}
