package LinkedList;
import java.util.LinkedList;

public class palindrome_ll {
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

    //Check whether linked list is a palindrome
    public static void palindrome(LinkedList list){
        Node slow= head;
        Node fast=head;
        boolean isPalindrome = true;
        if(head==null || head.next==null){
            System.out.println("Palindrome");
            return;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node midNode = slow;
        Node prev = null;
        Node curr = midNode;
        Node temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data!=right.data){
                isPalindrome = false;
                break;
            }
            left=left.next;
            right=right.next;
        }
        if(isPalindrome){
            System.out.println("A palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }

    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        insert(l1, 0);
        insert(l1, 1);
        insert(l1, 1);
        insert(l1, 4);
        palindrome(l1);
    }
}
