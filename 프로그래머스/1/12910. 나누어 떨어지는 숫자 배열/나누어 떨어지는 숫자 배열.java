import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int index = 0;
        int a = 0;
        int[] arrays = new int[arr.length];
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                index++;
            }
        }
        int[] answer = new int[index];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[a] = arr[i];
                a++;
            }
        }
        if(index == 0) {
            return new int[]{-1};
        }
        
        return answer;
    }
}