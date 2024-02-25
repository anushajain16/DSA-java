package LinkedList;
// Search a number in linked list

import java.util.LinkedList;

public class search_linked_list {
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
    public static void search(LinkedList list, int number){
        Node temp = head;
        if(head==null){
            System.out.println("Empty linked list");
        }
        else{
            while(temp!=null){
                if(temp.data==number){
                    System.out.println("Number found in the list");
                    return;
                }
                
                temp=temp.next;
            }
            System.out.println("Number not found");
        }    
    }

    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        insert(l1, 1);
        insert(l1,2);
        insert(l1, 3);
        insert(l1, 4);
        insert(l1, 5);
        insert(l1, 6);
        search(l1, 0);
        search(l1, 1);
    }
}
