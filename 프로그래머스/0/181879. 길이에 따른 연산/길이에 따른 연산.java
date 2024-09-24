import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        if(num_list.length >= 11) {
            for(int i=0; i<num_list.length; i++) {
                answer += num_list[i];
            }
        }
        else if(num_list.length <= 10) {
            for(int i=0; i<num_list.length; i++) {
                a *= num_list[i];
            }
            return a;
        }
        return answer;
    }
}