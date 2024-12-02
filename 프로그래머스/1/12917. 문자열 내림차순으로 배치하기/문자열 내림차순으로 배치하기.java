import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String st[] = s.split("");
        Arrays.sort(st, (a, b) -> b.compareTo(a));
        
        for(int i=0; i<st.length; i++) {
            answer += st[i];
        }
        return answer;
    }
}