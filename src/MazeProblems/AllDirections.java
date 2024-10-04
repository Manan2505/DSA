package MazeProblems;

public class AllDirections {
    public static void checkPaths(int row,int col,boolean[][]maze,String str){
        if(row==2 && col==2){
            System.out.println(str);
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        if(row<2){
            checkPaths(row+1,col,maze,str+"D");
        }
        if(col<2){
            checkPaths(row,col+1,maze,str+"R");
        }
        if(col>0){
            checkPaths(row,col-1,maze,str+"L");
        }
        if(row>0){
            checkPaths(row-1,col,maze,str+"U");
        }
    }

    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
        checkPaths(0,0,maze,"");

    }
}
