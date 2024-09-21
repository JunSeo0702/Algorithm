import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        int a = 0;
        for(int i=0; i<num_list.length; i++) {
            sum *= num_list[i];
            a += num_list[i];
        }
        
        if(sum > a*a) 
            answer = 0;
        else answer = 1;
        return answer;
    }
}