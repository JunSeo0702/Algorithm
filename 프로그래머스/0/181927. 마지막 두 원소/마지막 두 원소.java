import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int a = num_list[length - 1];
        int b = num_list[length - 2];
        int[] answer = new int[length+1];
        answer = Arrays.copyOfRange(num_list,0,length+1);
        if(a>b) {
            answer[length] = num_list[length-1] - num_list[length-2];
        }
        else if(a<=b) {
            answer[length] = num_list[length-1] * 2;
        }
        return answer;
    }
}