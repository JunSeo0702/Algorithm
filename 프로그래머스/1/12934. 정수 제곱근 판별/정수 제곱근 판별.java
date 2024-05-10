class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = 0;
        if(n == ((long)Math.sqrt(n) * (long)Math.sqrt(n))) {
            a = ((long)Math.sqrt(n) + 1);
           answer = a * a;
        }
        else 
            return -1;
        return answer;
    }
}