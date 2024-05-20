import java.util.*;
class Solution {
    public long solution(int price, long money, long count) {
        long answer = -1;
        long a = 0;
        long sum = 0;
        for(int i=1; i<count+1; i++) {
            a = price*i;
            sum += a;
        }
        
        answer = money - sum;
        if(answer > 0) {
            return 0;
        }
        else if(answer < 0) {
            answer = answer * -1;
        }

        return answer;
    }
}