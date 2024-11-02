package Trees;

public class AVL {
    class Node{
        Node left;
        Node right;
        int value;
        int height;
        public Node(int value){
            this.value=value;
        }
    }
    static Node root;
    public static int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public void insert(int value){
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
        return rotate(node);

    }
    public Node rightRotate(Node node){
       Node c=node.left;
       Node t=c.right;
       c.right=node;
       node.left=t;
       node.height=Math.max(height(node.left),height(node.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;

        return c;
    }
    public Node leftRotate(Node node){
        Node c=node.right;
        Node t=c.left;
        c.left=node;
        node.right=t;
        node.height=Math.max(height(node.left),height(node.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;
    }
    public Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            // right case
            if(height(node.left.left)-height(node.right.right)>0){
                // left-left case
                return rightRotate(node);
            }else{
                //left-right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left)-height(node.right)<-1){
            // left case
            if(height(node.left.left)-height(node.right.right)>0){
                // right-right case
                return leftRotate(node);
            }else{
                //right-left case
                node.left=rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node;
    }
    public static void main(String[] args) {
        AVL a=new AVL();

        for(int i=1; i<30; i++){
            a.insert(i);
        }
    }
}
