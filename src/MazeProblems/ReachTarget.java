package MazeProblems;

public class ReachTarget {
    public static void steps(int row,int col,String str){
        if(row==2 && col==2){
            System.out.println(str);
            return;
        }
        if(row<2){
            steps(row+1,col,str+"D");
        }
        if(col<2){
            steps(row,col+1,str+"R");
        }
    }
    public static int count(int row,int col){
        if(row==2 || col==2){
            return 1;
        }
        int left=count(row+1,col);
        int right=count(row,col+1);
        return left+right;
    }
    public static void main(String[] args) {
        steps(0,0,"");
        System.out.println(count(0,0));
    }
}
