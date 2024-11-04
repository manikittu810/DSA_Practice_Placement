package neetCode150.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public boolean anagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(Character i : s.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }

        for(Character i : t.toCharArray()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }

        return map1.equals(map2);
    }
}
class Main1{
    public static void main(String[] args) {
        ValidAnagram  obj = new ValidAnagram();
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<t;i++){
            String s = sc.nextLine();
            String z= sc.nextLine();
            System.out.println(obj.anagram(s,z));
        }
        sc.close();
    }
}