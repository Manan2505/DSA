package Trees;
public class SegmentTree {
    static int[]arr={2,2,2,2};
     Node root;
    class Node{
        int value;
        int startIndex;
        int endIndex;
        Node left;
        Node right;
        public Node(int startIndex,int endIndex){
            this.startIndex=startIndex;
            this.endIndex=endIndex;
        }
    }
    public Node insert(int[]arr,int s,int e){
        if(s==e){
            Node leaf=new Node(s,e);
           leaf.value=arr[s];
           return leaf;
        }
        Node node=new Node(s,e);
        int mid=(s+e)/2;
        node.left=insert(arr,s,mid);
        node.right=insert(arr,mid+1,e);
        node.value=node.left.value+node.right.value;
        return node;
    }
    public int populate(int s,int e){
        root=insert(arr,s,e);
        return root.value;
    }
    public Node update(Node node,int s,int e,int index,int value){
        if(s==e && s==index){
            node.value=value;
            return node;
        }
        int mid=(s+e)/2;
        if(index>=s && index<=e){
            node.left=update(node.left,s,mid,index,value);
            node.right=update(node.right,mid+1,e,index,value);
            node.value=node.left.value+node.right.value;
            return node;
        }
        return node;
    }
    public int update(int s,int e,int index,int value){
        root=update(root,s,e,index,value);
        return root.value;
    }
    public static void main(String[] args) {
        SegmentTree t=new SegmentTree();
        System.out.println(t.populate(0,arr.length-1));
        System.out.println(t.update(0,arr.length-1,3,14));
    }
}
