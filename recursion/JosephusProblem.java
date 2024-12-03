package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {
    public void solve(List<Integer> a, int k, int idx){
        if(a.size()==1) {
            System.out.println(a.getFirst());
            return;
        }
        idx = (idx+k)%a.size();
        a.remove(idx);
        solve(a,k,idx);
    }
}
class TestJosephus{
    public static void main(String[] args) {
        JosephusProblem obj = new JosephusProblem();
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for(int j=1;j<=n;j++){
                l.add(j);
            }
            obj.solve(l,k-1,0);
        }
        sc.close();
    }
}
//This is an Recursive solution with TC : O(n^2) and sc: O(n)