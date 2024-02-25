package LinkedList;
import java.util.LinkedList;

public class zig_zag_ll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;

    public static void zigzag(LinkedList<Integer> list){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node temp;

        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR = right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }

    public static void display(LinkedList<Integer> list){
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

    public static void main(String[]args){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        head = new Node(l1.getFirst());
    
        zig_zag_ll.zigzag(l1);
        display(l1);
        
    }

}
