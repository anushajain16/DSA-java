package LinkedList;
import java.lang.*;

class DoublyLinkedList {
    public static Node head;

    // Node Class
    class Node {
        int data;
        Node next, prev;

        Node(int x)
        {
            data = x;
            next = null;
            prev = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head.prev=newNode;
        newNode.prev = null;
        head=newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node temp =  head;
        if(head==null){
            head=newNode;
            return;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }  
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("Doubly linked list is empty");
        }
        if(head.next==null){
            head=null;
            System.out.println("List is now empty");
        }
        head=head.next;
        head.prev=null;
    }

    public void removeLast(){
        Node temp=head;
        if(head==null){
            System.out.println("Doubly linked list is empty");
        }
        if(head.next==null){
            head=null;
            System.out.println("List is now empty");
        }
        else{
            while(temp.next!=null && temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp= temp.next;
        }
        System.out.println("null");
    }

}
class Main{
    public static void main(String args[])
    {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);

        dll.display();
        dll.removeFirst();
        dll.addLast(4);
        dll.removeLast();
        dll.display();
    }
}
