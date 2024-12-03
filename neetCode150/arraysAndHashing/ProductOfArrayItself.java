package neetCode150.arraysAndHashing;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayItself {
    public int[] productOfAnArrayExceptSelf(int []a){
        int n = a.length;
        int []ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++){
            ans[i] =ans[i-1]*a[i-1];
        }

        int rightProduct = 1;
        for(int i=n-1;i>=0;i--){
            ans[i]*= rightProduct;
            rightProduct*= a[i];
        }
        return ans;
    }
}
class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductOfArrayItself obj = new ProductOfArrayItself();

        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int []a= new int[n];
            for(int j=0;j<n;j++){
                a[j] =sc.nextInt();
            }
            System.out.println(Arrays.toString(obj.productOfAnArrayExceptSelf(a)));
        }
    }
}