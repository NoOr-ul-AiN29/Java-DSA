package dsa1;
import java.util.*;
public class BinaryTree1 {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int[] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(!queue.isEmpty()){
                Node current = queue.remove();
               if(current==null){
                   System.out.println();
                   if(queue.isEmpty()){
                       break;
                   }
                   else{
                       queue.add(null);
                   }
               }
               else{
                   System.out.print(current.data+" ");
                   if(current.left!=null){
                       queue.add(current.left);
                   }
                   if(current.right!=null){
                       queue.add(current.right);
                   }
               }

            }
        }
        public static int countNodes(Node root){
           if(root==null){
               return 0;
           }
           return 1 + countNodes(root.left) + countNodes(root.right);
        }

        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
        }
        public static int treeHeight(Node root){
            if(root==null){
                return 0;
            }
            treeHeight(root.left);
            treeHeight(root.right);
            int height=Math.max(treeHeight(root.left),treeHeight(root.right));
            return height+1;
        }



    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = tree.buildTree(arr);
        System.out.println("PreOrder: ");
        tree.preOrder(root);
        System.out.println("\nInOrder: ");
        tree.inOrder(root);
        System.out.println("\nPostOrder: ");
        tree.postOrder(root);
        System.out.println("\nLevelOrder: ");
        tree.levelOrder(root);
        System.out.println("Number of nodes: ");
        System.out.println(BinaryTree.countNodes(root));
        System.out.println("Sum of nodes: ");
        System.out.println(BinaryTree.sumOfNodes(root));
        System.out.println("Tree height: ");
        System.out.println(BinaryTree.treeHeight(root));


    }



}
