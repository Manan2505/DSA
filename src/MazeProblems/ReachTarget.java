package MazeProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReachTarget {
    public static ArrayList<String> steps(int row, int col, String str){
        if(row==2 && col==2){
           ArrayList<String>list=new ArrayList<>();
           list.add(str);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        if(row<2 && col<2){
            list.addAll(steps(row+1,col+1,str+"S")); // for diagonal movement

        }
        if(row<2){
            list.addAll(steps(row+1,col,str+"D"));
        }
        if(col<2){
            list.addAll(steps(row,col+1,str+"R"));
        }
        return list;
    }
    public static int count(int row,int col){
        if(row==2 || col==2){
            return 1;
        }
        int down=count(row+1,col);
        int right=count(row,col+1);
        int slant=count(row+1,col+1);
        return down+right+slant;
    }

    public static void main(String[] args) {

        System.out.println(steps(0,0,""));
        System.out.println(count(0,0));
    }
}
