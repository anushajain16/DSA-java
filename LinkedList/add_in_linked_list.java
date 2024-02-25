package LinkedList;
//Adding node in linked lists
import java.util.*;
public class add_in_linked_list {
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
    //Printing a list
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

    //Inserting at any index and counting the total number of elements in the list
    public static void insertNode(LinkedList list, int data, int index){
        Node temp = head;
        Node newNode1 = new Node(data);
        if(head==null){
            head=newNode1;
        }
        else{
            if(index==0){
                newNode1.next=head;
                head=newNode1;
            }
            else{
                int idx=0;
                while(temp!=null && idx<index-1){
                    temp=temp.next;
                    idx++;
                }
                if(temp==null){
                    System.out.println("Index is out of bounds.");
                    return;
                }
                newNode1.next=temp.next;
                temp.next=newNode1;
            }
        }
    }

    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        LinkedList l2 = new LinkedList<>();
        insertNode(l2, 1, 0);
        display(l2);
        System.out.println();
        insertNode(l2, 2, 1);
        display(l2);
    }
}

