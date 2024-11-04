package neetCode150;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class containsDuplicate {
    public boolean func(int[]a){
        Set<Integer> set = new HashSet<>();
        for(int i : a){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
class Main{
    public static void main(String[] args) {
        containsDuplicate obj = new containsDuplicate();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int []a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println(obj.func(a));
        }
        sc.close();
    }
}