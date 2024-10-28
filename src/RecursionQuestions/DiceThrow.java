package RecursionQuestions;

public class DiceThrow {
    public static void dice(String p,int t){
        if(t==0){
            System.out.println(p);
            return ;
        }
        if(t<0){
            return;
        }
        for(int i=1; i<=t; i++){
            dice(i+p,t-i);
        }
    }
    public static void main(String[] args) {
        int target=4;
        dice("",target);
    }
}
