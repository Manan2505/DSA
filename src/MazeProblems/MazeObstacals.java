package MazeProblems;

public class MazeObstacals {
    // Maze with obstacals questions
    public static void checkPaths(int row,int col,String str){
        if(row==2 && col==2){
            System.out.println(str);
            return;
        }
        if(row==1 && col==1){
            return;
        }
        if(row<2){
            checkPaths(row+1,col,str+"D");
        }
        if(col<2){
            checkPaths(row,col+1,str+"R");
        }
    }

    public static void main(String[] args) {
               checkPaths(0,0,"");  // rock at 1,1
    }

}
