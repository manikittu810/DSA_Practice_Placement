package neetCode150.arraysAndHashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int []a){
        Set<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        int longestStreak = 0;
        for(int i : set){
            if (!set.contains(i - 1)) {
                int curNum = i;
                int curCount = 1;
                while(set.contains(curNum+1)){
                    curNum+=1;
                    curCount+=1;
                }
                longestStreak = Math.max(longestStreak,curCount);
            }
        }
return longestStreak;
    }
}
class Main6{
    public static void main(String[] args) {
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int []a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            System.out.println(obj.longestConsecutive(a));
        }
        sc.close();
    }
}