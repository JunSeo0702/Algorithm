import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-z]","");
        String[] string = my_string.split("");
        for(String i : string)
        answer += Integer.parseInt(i);
        return answer;
    }
}