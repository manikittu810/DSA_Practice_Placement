package neetCode150.arraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupThem(String[] s) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : s) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(word);
        }
        return  new ArrayList<>(map.values());
    }
}
class Main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GroupAnagrams obj = new GroupAnagrams();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            sc.nextLine();
            String[] s = new String[n];
            for(int j=0;j<n;j++){
                s[j] = sc.nextLine();
            }
            System.out.println(obj.groupThem(s));
        }
        sc.close();
    }
}