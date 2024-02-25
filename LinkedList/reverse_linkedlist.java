package LinkedList;
import java.util.LinkedList;

public class reverse_linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    //Inserting an element in the list
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

    public static void reverse(LinkedList list){
        Node temp = head;
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
    }

    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        insert(l1, 1);
        insert(l1,2);
        insert(l1, 3);
        insert(l1, 4);
        insert(l1, 5);
        insert(l1, 6);
        display(l1);
        System.out.println();
        reverse(l1);
        display(l1);
    }
}
