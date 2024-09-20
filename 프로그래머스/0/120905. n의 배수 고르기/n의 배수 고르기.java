import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int a=0;
        int k=0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n ==0)
              a++;  
        }
        answer = new int[a];
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n ==0) {
                answer[k] = numlist[i];
                k++;
            }
        }
        return answer;
    }
}