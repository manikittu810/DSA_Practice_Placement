package neetCode150.twoPointers;

import java.util.Scanner;

public class TrappingRainWater {
    public int water(int[] a){
        if(a.length == 0){
            return 0;
        }
        int l=0,r=a.length-1,ans=0;
        int maxLeft_so_far = a[l];
        int max_Right_so_far = a[r];
        while(l<r){
            if(maxLeft_so_far<=max_Right_so_far){
                l++;
                maxLeft_so_far = Math.max(maxLeft_so_far,a[l]);
                int n = maxLeft_so_far-a[l];
                if(n>0){
                    ans+=n;
                }
            }
            else{
                r--;
                max_Right_so_far=Math.max(max_Right_so_far,a[r]);
                int n = max_Right_so_far-a[r];
                if(n>0){
                    ans+=n;
                }
            }
        }
        return ans;
    }
}
class MainTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrappingRainWater obj = new TrappingRainWater();
        int t= sc.nextInt();
        sc.nextLine();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int []a= new int[n];
            for(int j=0;j<n;j++){
                a[j] =sc.nextInt();
            }
            System.out.println(obj.water(a));
        }
        sc.close();
    }
}