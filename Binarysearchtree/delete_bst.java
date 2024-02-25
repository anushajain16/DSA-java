package Binarysearchtree;

import Binarytree.inorder;

public class delete_bst {
    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node delete(int key,Node root){
        if(root.data>key){
            root.left = delete(key, root.left);
        }
        else if(root.data<key){
            root.right = delete(key, root.right);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node is = findInorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(is.data, root.right);
            
        }
        return root;
        
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[]args){
        int [] arr = {5,1,3,4,2,7,8,9};
        Node root = null;
        for(int i=0; i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        root = delete(3, root);
        inorder(root);
    }
}
