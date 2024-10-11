package RecursionQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AllOccurrences {
    //ques: using linear search find all occurrences of given target
//    static ArrayList<Integer>list=new ArrayList<>();
    //Ist approach
//    public static void check(int[]arr,int target,int i){
//        if(i==arr.length){
//            return;
//        }
//        if(arr[i]==target){
//            list.add(i);
//        }
//        check(arr,target,i+1);;
//
//    }

//    IInd Approach
    public static ArrayList<Integer> check(int[]arr,int target, int i){
        ArrayList<Integer>list=new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer>ansFromBelow=check(arr,target,i+1);
        list.addAll(ansFromBelow);
        return list;
    }
    public static void main(String[] args) {
        int target=8;
        int[]arr={3,5,4,7,8,5,2,1,7,8,8};
        System.out.println(check(arr,target,0)); //2nd approach
//    check(arr,target,0); //1st approach
//        System.out.println(list);
    }
}
