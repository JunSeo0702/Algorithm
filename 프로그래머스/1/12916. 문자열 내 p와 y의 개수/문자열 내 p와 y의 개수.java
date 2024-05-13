class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pnum = 0;
        int ynum = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') {
                pnum += 1;
            }
            else if(c == 'y' || c == 'Y') {
                ynum++;
            }
        }
        if(pnum == ynum) {
            answer = true;
        }
        else answer = false;

        return answer;
    }
}