package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class GenerateParanthesisUsingStack {
    public List<String> generateUSingStack(int n){
        List<String >res = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        backTrack(res,n,n,n,st);
        return res;
    }
    private void backTrack(List<String> res, int n, int openBracket,int closedBracket,Stack<Character> st){
        if(st.size() == 2*n){
            StringBuilder sb = new StringBuilder();
            for(Character c : st){
                sb.append(c);
            }
            res.add(sb.toString());
            return;
        }
        if(openBracket>0){
            st.push('(');
            backTrack(res,n,openBracket-1,closedBracket,st);
            st.pop();
        }
        if(closedBracket>openBracket){
            st.push(')');
            backTrack(res,n,openBracket,closedBracket-1,st);
            st.pop();
        }
    }
}
class GenerateTest{
    public static void main(String[] args) {
        GenerateParanthesisUsingStack obj = new GenerateParanthesisUsingStack();
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(obj.generateUSingStack(n));
        }
        sc.close();
    }
}