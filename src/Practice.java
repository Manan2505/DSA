import java.util.*;

public class Practice {
    static HashMap<Character,Integer>map=new HashMap<>();
    static HashSet<Character>set=new HashSet<>();
    public static String valueCount(String num){
        String ans="";
        for(int i=0; i<num.length(); i++){
            if(map.containsKey(num.charAt(i))){
                map.put(num.charAt(i),map.get(num.charAt(i))+1);
            }
            map.put(num.charAt(i),1);
        }
        System.out.println(map);
        for(int i=0; i<num.length(); i++){
            set.add(num.charAt(i));
        }
        for(int i=0; i<num.length(); i++){
            if(map.containsKey(num.charAt(i))&& set.contains(num.charAt(i))){
                ans+=map.get(num.charAt(i))+""+num.charAt(i);
                set.remove(num.charAt(i));
            }
        }
        return ans;

    }
    public static String countAndSay(int n) {
        int i=2;
        String num="1";
        while(i<=n){
            System.out.println(num);
            num=valueCount(num);
            i++;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
