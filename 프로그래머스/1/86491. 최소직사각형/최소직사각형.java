import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int first = 0;
        int second = 0;
        for(int i=0; i<sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            first = Math.max(first, max);
            second = Math.max(second, min);
            System.out.println(first+" "+second);
        }
        answer = first * second;
        return answer;
    }
}