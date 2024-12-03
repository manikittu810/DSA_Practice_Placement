package recursion;

import java.util.Scanner;

public class JosephusOptimized {
    public int solve(int n , int k){
        int ans =0;
        for(int i=2;i<=n;i++){
            ans = (ans+k)%i;
        }
        return ans+1;
    }
}
class  TestIterativeJosephus{
    public static void main(String[] args) {
        JosephusOptimized obj = new JosephusOptimized();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(obj.solve(n, k));
        }
        sc.close();
    }
}