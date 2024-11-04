package neetCode150.arraysAndHashing;

import java.util.*;

public class TwoSum {
    public int[] func(int []a,int t){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int n = t-a[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n),i};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}
class Main2{
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int x= sc.nextInt();
            for(int j=0;j<n;j++){
                a[j] =sc.nextInt();
            }
                System.out.println(Arrays.toString(obj.func(a,x)));
        }
        sc.close();
    }
}
