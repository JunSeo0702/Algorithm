import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] a = new String[my_string.length()];
        a = my_string.toLowerCase().split("");
        Arrays.sort(a);
        for(int i=0; i<my_string.length(); i++) {
            answer += a[i];
        }
        return answer;
    }
}