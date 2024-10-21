import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer;
        int max = intervals[0][1] - intervals[0][0];
        int min = intervals[1][1] - intervals[1][0];
        answer = new int[max+min+2];
        int k=0;
        int s = intervals[0][0];
        int e = intervals[1][0];
        for(int i=0; i<=max; i++) {
            answer[k++] = arr[s+i];
        }
        for(int i=0; i<=min; i++) {
            answer[k++] = arr[e+i];
        }
    
        return answer;
    }
}