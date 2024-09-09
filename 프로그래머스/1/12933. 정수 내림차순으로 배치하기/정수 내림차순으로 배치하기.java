import java.util.*;
class Solution {
    public long solution(long n) {
        String [] list = String.valueOf(n).split("");
        Arrays.sort(list);
        
        StringBuilder sb = new StringBuilder();
        
        for(String aList : list) {
            sb.append(aList);
        }
        sb.reverse();
        System.out.print(sb);
        return Long.parseLong(sb.toString());
    }
}