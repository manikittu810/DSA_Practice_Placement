package recursion;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleInStack {
    public void fun(Stack<Integer>st){
        if(!st.isEmpty()){
            int count = st.size()/2;
            deleteMidStack(st,count);
        }
    }
    private void deleteMidStack(Stack<Integer> st, int count){
        if(count == 1){
            st.pop();
            return;
        }
        int temp = st.pop();
        deleteMidStack(st,count-1);
        st.push(temp);
    }
}
class Test3{
    public static void main(String[] args) {
        DeleteMiddleInStack obj = new DeleteMiddleInStack();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for(int j=0;j<n;j++){
                int z = sc.nextInt();
                st.push(z);
            }
            obj.fun(st);
            System.out.println(st);
        }
    }
}