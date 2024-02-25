package LinkedList;
import java.util.LinkedList;

public class delete_node {
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

    //Delete a node of given position

    public static void delete(LinkedList list, int position){
        Node temp = head;
        if(position==0){
            head=head.next;
        }
        else{
            int idx=0;
            while(temp!=null && idx<position-1){
                temp=temp.next;
                idx++;
            }
            if(temp==null){
                System.out.println("Index is out of bounds");
                return;
            }
            temp.next=temp.next.next;
        }
    }

    public static void display(LinkedList list){
        Node temp=head;
        if(head==null){
            System.out.print("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    //Delete the middle node from the linked list

    public static void deleteMiddle(LinkedList list){
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=prev.next.next;
        
    }
    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        insert(l1, 1);
        insert(l1,2);
        insert(l1, 3);
        insert(l1, 4);
        insert(l1, 5);
        insert(l1, 6);
        /* delete(l1, 1); */
        deleteMiddle(l1);
        display(l1);
    }
}
