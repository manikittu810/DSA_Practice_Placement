package recursion;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int topElement = st.pop();
        reverse(st);
        insertAtBottom(st,topElement);
    }
    private void insertAtBottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int topElement = st.pop();
        insertAtBottom(st,val);
        st.push(topElement);
    }
}
class ReverseStackTest{
    public static void main(String[] args) {
        ReverseStack obj = new ReverseStack();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t;i++){
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for(int j=0;j<n;j++){
                int z = sc.nextInt();
                st.push(z);
            }
            obj.reverse(st);
            System.out.println(st);
        }
        sc.close();
    }
}