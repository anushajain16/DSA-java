package LinkedList;
import java.util.LinkedList;

public class addtwonos_ll {
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
    public static void insert(Node list, int data){
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
    public static void display(Node list){
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

    public static Node add(Node l1, Node l2){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node newNode = new Node(sum%10);
            temp.next=newNode;
            temp=temp.next;
        }
        return dummy;
    }

    public static void main(String[]args){
        Node l1 =null ;
        Node l2 =null;
        Node l3=null;
        insert(l1, 2);
        insert(l1, 4);
        insert(l1, 3);
        insert(l2, 5);
        insert(l2, 6);
        insert(l2, 4);
        l3=add(l1, l2);
        display(l3);
    }
}
