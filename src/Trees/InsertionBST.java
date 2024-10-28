package Trees;

import java.util.*;

public class InsertionBST {
    static Node root;
    class Node{
        int value;
        Node left;
       Node right;
       int height;
        public Node(int value){
            this.value=value;
        }
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public InsertionBST(int value){
        root=insert(root,value);
    }
    public Node insert(Node node, int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value>node.value){
            node.right=insert(node.right,value);
        }else{
            node.left=insert(node.left,value);
        }
        node.height=Math.max(height(node.right),height(node.left))+1;
        return node;

    }
    public static void display(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InsertionBST i=new InsertionBST(4);
        display(root);
    }
}
