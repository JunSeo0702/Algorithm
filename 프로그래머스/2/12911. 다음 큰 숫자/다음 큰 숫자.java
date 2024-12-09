import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i)=='1') {
                count++;
            }
        }
        for(int i=n+1; i<1000000; i++) {
            int ncount=0;
            String nbinary = Integer.toBinaryString(i);
            for(int j=0; j<nbinary.length(); j++) {
                if(nbinary.charAt(j) == '1') {
                    ncount++;
                }
            }
            if(count==ncount) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}