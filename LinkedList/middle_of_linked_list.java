package LinkedList;
import java.util.LinkedList;

public class middle_of_linked_list {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    
    public static void insert(LinkedList list, int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public static Node middle(LinkedList list){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        insert(l1, 1);
        insert(l1,2);
        insert(l1, 3);
        insert(l1, 4);
        insert(l1, 5);
        insert(l1, 6);
        System.out.println(middle(l1).data);
    }
}
