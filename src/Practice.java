import java.util.ArrayList;

public class Practice {
    public static int steps(int row,int col){
        if(row==2 || col==2) {
            return 1;
        }
        int a=steps(row+1,col);
        int b=steps(row,col+1);
        return a+b;
    }

    public static ArrayList<String> path(int row,int col,String path){
        ArrayList<String>list=new ArrayList<>();
        if(row==2 && col==2){
            list.add(path);
            return list;
        }
        if(row<2){
            list.addAll(path(row+1,col,path+"D"));
        }
        if(col<2){
           list.addAll( path(row,col+1,path+"R"));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(steps(0,0));
        System.out.println( path(0,0,""));
    }
}
