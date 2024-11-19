package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArray {
    public void fun1(List<Integer> a){
        if(a.size()<=1){
            return ;
        }
        int temp = a.removeLast();
        fun1(a);
        insert(a,temp);
    }
    public void insert(List<Integer> a,int val){
        if(a.isEmpty() || a.getLast() <= val){
            a.add(val);
            return ;
        }
        int temp = a.removeLast();
        insert(a,val);
        a.add(temp);
    }
}
class Test1{
    public static void main(String[] args) {
        SortArray obj = new SortArray();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            for(int j=0;j<n;j++){
                int z = sc.nextInt();
                a.add(z);
            }
            obj.fun1(a);
            System.out.println(a);
        }
        sc.close();
    }
}