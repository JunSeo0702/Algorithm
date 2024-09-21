class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = "";
        int c = 0;
        int su = 2*a*b;
        sum = Integer.toString(a) + Integer.toString(b);
        c = Integer.parseInt(sum);
        if(c > su)
            answer = c;
        else answer = su;
        return answer;
    }
}