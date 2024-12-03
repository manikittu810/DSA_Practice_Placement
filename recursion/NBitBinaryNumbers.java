package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Question : Print N-bit binary numbers having more 1's than 0's for any prefix
public class NBitBinaryNumbers {
    public List<String> generateBinaryNumbers(int n){
        List<String> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTrack(l,n,0,0,sb);
        return l;
    }
    private void backTrack(List<String> res ,int n , int count1,int count0,StringBuilder sb){
        //myVersion
//        if(count1>=count0 && n==0){
//            String s = sb.toString();
//            res.add(s);
//            return;
//        }
//        if(n>0){
//        sb.append("1");
//        backTrack(res,n-1,count1+1,count0,sb);
//        sb.deleteCharAt(sb.length()-1);
//        sb.append("0");
//        backTrack(res,n-1,count1,count0+1,sb);
//        sb.deleteCharAt(sb.length()-1);
//        }

//Optimized version
        if(n==0){
            String s = sb.toString();
            res.add(s);
            return;
        }
            sb.append("1");
            backTrack(res,n-1,count1+1,count0,sb);
            sb.deleteCharAt(sb.length()-1);
            if(count1>count0){ // append only when count of 1's is greater than count of 0's
                sb.append("0");
                backTrack(res,n-1,count1,count0+1,sb);
                sb.deleteCharAt(sb.length()-1);
            }

    }
}
class BitTest{
    public static void main(String[] args) {
        NBitBinaryNumbers obj = new NBitBinaryNumbers();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            System.out.println(obj.generateBinaryNumbers(n));
        }
        sc.close();
    }
}
// if we use int num = Integer.parseInt(sb.toString());
// and add it to the list , then what happens is , if there's a '0' infront of '1' then it doesn't get printed, so here we are
// using list of type String for better user understanding.