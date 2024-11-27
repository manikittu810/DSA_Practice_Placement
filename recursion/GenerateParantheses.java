package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParantheses {
    public List<String> paramGen(int n){
        List<String> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTrack(l,n,n,n,sb);
        return l;

    }
    private void backTrack(List<String> l,int n, int openBracket,int closedBracket,StringBuilder sb){
        if(sb.length() == 2*n){
            l.add(sb.toString());
            return;
        }

        if(openBracket>0){
            sb.append('(');
            backTrack(l,n,openBracket-1,closedBracket,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(openBracket<closedBracket){
            sb.append(')');
            backTrack(l,n,openBracket,closedBracket-1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
class Test5{
    public static void main(String[] args) {
        GenerateParantheses obj = new GenerateParantheses();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(obj.paramGen(n));
        }
        sc.close();
    }
}