import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        int k=0;
        int size = 0;
        if(names.length % 5>0) {
            size = (names.length/5)+1;
        }
        else size = names.length/5;
        answer = new String[size];
        for(int i=0; i<names.length; i+=5) {
            answer[k] = names[i];
            k++;
        }
        return answer;
    }
}