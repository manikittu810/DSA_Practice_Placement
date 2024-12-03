package recursion;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    public void fun(Stack<Integer> st){
        if(st.size()<=1){
            return;
        }
        int temp = st.pop();
        fun(st);
        insert(st,temp);
    }
    private void insert(Stack<Integer> st,int temp){
        if(st.isEmpty()||st.peek()<=temp){
            st.add(temp);
            return;
        }
        int val = st.pop();
        insert(st,temp);
        st.add(val);
    }
}
class Test2{
    public static void main(String[] args) {
        SortStack obj = new SortStack();
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for(int j=0;j<n;j++){
                int z = sc.nextInt();
                st.add(z);
            }
            obj.fun(st);
            System.out.println(st);
        }
        sc.close();
    }
}