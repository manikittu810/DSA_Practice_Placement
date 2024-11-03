package recursion;

import java.util.Scanner;

public class PrintN{
    public void recur(int n ){
        if(n == 1){
            System.out.print(1+" ");
            return ;
        }
//        System.out.print(n+" ");
        recur(n-1);
        System.out.print(n+" ");

    }

}
class Main{
    public static void main(String[] args) {
        PrintN obj = new PrintN();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            obj.recur(n);
        }
        sc.close();
    }
}
