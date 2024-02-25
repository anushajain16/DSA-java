package LinkedList;
import java.util.LinkedList;

public class remove_nthnode_fromend {
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

    public static Node remove(LinkedList list, int index){
        int idx=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            idx++;
        }
        if(index==idx){
            return head.next;
        }
        int i=1;
        int find =idx-index;
        Node prev= head;
        while(i<find){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }

    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        insert(l1, 1);
        insert(l1, 2);
        insert(l1, 3);
        insert(l1, 4);
        insert(l1, 5);
        display(l1);
        remove(l1, 2);
        display(l1);
    }
}
