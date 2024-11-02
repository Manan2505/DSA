package Trees;
import java.util.*;
public class Insertion {
    // Insertion in binary tree and traversals.
    static Node root;
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public Insertion(int value,Scanner sc){
        root=new Node(value);
        insert(root,sc);
    }
    public void insert(Node node,Scanner sc){
        System.out.println("Do you want to insert on left side of "+node.value);
        boolean check=sc.nextBoolean();
        if(check){
            System.out.println("Enter value ");
            int val=sc.nextInt();
            node.left=new Node(val);
            insert(node.left,sc);
        }
        System.out.println("Do you want to insert on right side of "+node.value);
        boolean check2=sc.nextBoolean();
        if(check2){
            System.out.println("Enter value ");
            int val=sc.nextInt();
            node.right=new Node(val);
            insert(node.right,sc);
        }
        return;
    }
    public static void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);

    }

    public static void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value +" ");
        preorder(node.left);
        preorder(node.right);

    }

    public static void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value +" ");

    }
    public static void display(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value +" ");
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Insertion i=new Insertion(1,sc);
        inorder(root);
        System.out.println("preorder ");
        preorder(root);
        System.out.println("postorder");
        postorder(root);
   }
}
