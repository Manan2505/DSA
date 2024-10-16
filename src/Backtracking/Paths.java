package Backtracking;

public class Paths {
    public static void path(boolean[][]maze,int row,int col,String path){
        if(row==2 && col==2){
            System.out.println(path);
            return;
        }

        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        if(row<2){
            path(maze,row+1,col,path+"D");
        }
        if(col<2){
            path(maze,row,col+1,path+"R");

        }
        if(row>0){
            path(maze,row-1,col,path+"U");
        }
        if(col>0){
            path(maze,row,col-1,path+"L");
        }
        maze[row][col]=true;
    }
    public static void main(String[] args) {
        boolean[][]maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        path(maze,0,0,"");
    }
}
