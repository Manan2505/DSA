package RecursionQuestions;

import java.util.ArrayList;

public class Subsets {
    // find subsets of given string
    public static ArrayList<String> subsets(String ans,String str){
        ArrayList<String>list=new ArrayList<>();
        if(str.isEmpty()){
            list.add(ans);
            return list;
        }
       ArrayList<String>left= subsets(ans+str.charAt(0),str.substring(1));
        ArrayList<String>right= subsets(ans,str.substring(1));
        list.addAll(left);
        list.addAll(right);
        return list;

    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(subsets("",str));

    }
}
