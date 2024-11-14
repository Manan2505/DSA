package TreesQuestions;
import Trees.Insertion;

import java.util.*;
public class BFS {

    class Node{
        Node left;
        Node right;
        int value;
        int height;
        public Node(int value){
            this.value=value;
        }
    }

    Node root;
    public Node insert(Scanner sc,Node node,int value){
        System.out.println("DO you want to insert left of "+node.value);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter value");
            int num=sc.nextInt();
            Node node1=new Node(num);
            node.left=insert(sc,node1,num);
        }
        System.out.println("Do you want to insert right of "+node.value);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter value");
            int num=sc.nextInt();
            Node node1=new Node(num);
            node.right=insert(sc,node1,num);
        }
        return node;
    }
    public static void display(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value +" ");
        display(node.left);
        display(node.right);
    }
    public void insert(Scanner sc,int value){
        root=new Node(value);
        root=insert(sc,root,value);
    }
    public void BFS(ArrayDeque<Node>q){
        if(q.isEmpty()){
            return;
        }
        Node dummy=q.getFirst();
        System.out.println(q.getFirst().value);
        q.removeFirst();
        if(dummy.left!=null){
            q.addLast(dummy.left);
        }
        if(dummy.right!=null){
            q.addLast(dummy.right);
        }
        BFS(q);
    }
    public static void main(String[] args) {
        ArrayDeque<Node>q=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        BFS b=new BFS();
        b.insert(sc,1);
//        display(b.root);
        q.addLast(b.root.left);
        q.addLast(b.root.right);
        b.BFS(q);
    }
}
