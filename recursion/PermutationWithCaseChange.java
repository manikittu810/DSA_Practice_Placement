package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationWithCaseChange {
    public List<String> caseChange(String s){
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTrack(res,s,sb,0);
        return res;
    }
    private void backTrack(List<String> res,String s, StringBuilder sb, int idx){
        if(idx == s.length()){
            res.add(sb.toString());
            return;
        }
        char c = s.charAt(idx);
        sb.append(Character.toLowerCase(c));
        backTrack(res,s,sb,idx+1);
        sb.deleteCharAt(sb.length()-1);

        char c1 = s.charAt(idx);
        sb.append(Character.toUpperCase(c1));
        backTrack(res,s,sb,idx+1);
        sb.deleteCharAt(sb.length()-1);

    }
}
class Test4{
    public static void main(String[] args) {
        PermutationWithCaseChange obj = new PermutationWithCaseChange();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            System.out.println(obj.caseChange(s));
        }
        sc.close();
    }
}
// TC : 2powN
//sc : O(N)