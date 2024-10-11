import java.util.*;
public class Practice {
    public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        Stack<Integer>st=new Stack<>();
        while(!s.isEmpty()){
          if(st.isEmpty()){
              st.push(s.pop());
          }
          else if(!st.isEmpty()&&s.peek()>=st.peek()){
              st.push(s.pop());
          }
          else if(!st.isEmpty()&& s.peek()<st.peek()){
              while(!st.isEmpty()&&s.peek()<st.peek()){
                  deque.add(st.pop());
              }
              st.push(s.pop());
              while(!deque.isEmpty()){
                  st.push(deque.pollLast());
              }
          }
        }
        if(!deque.isEmpty()){
            st.push(deque.pollLast());
        }
        return st;
    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(7);
        System.out.println(s);
        System.out.println(sort(s));
    }
}
