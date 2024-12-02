import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int idx=0;
        int k=0;
        for(int i=0; i<arr.length; i++) {
            int a = arr[i];
            if(i<arr.length-1) {
                if(a == arr[i+1]) {
                    idx++;    
                }
            }
        }
        answer = new int[arr.length-idx];
        answer[k++] = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                answer[k++] = arr[i];
            }
            
        }

        return answer;
    }
}