import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] ans = my_string.split("");
        for(int i=0; i<indices.length; i++) {
            ans[indices[i]] = "";
        }
        for(String x : ans) {
            answer += x;
        }
        
        return answer;
    }
}