package Binarytree;

public class diameter {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[]nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }

            int lh=height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh)+1;
        }

        public static int diameter(Node root){
            if(root==null){
                return 0;
            }

            int ld=diameter(root.left);
            int rd=diameter(root.right);
            int lh=height(root.left);
            int rh=height(root.right);

            int a = Math.max(ld, rd);

            return Math.max(a, lh+rh+1);
        }

        public static void main(String[]args){
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            System.out.println(diameter(root));
        }
    }
}
