class Solution {
    public int solution(int n) {
        int answer = 1;
        int result = 0;
        for(int i=1; i<=n; i++) {
            answer *= i;
            if(answer > n) {
                result = i-1;
                break;
            }
            else if(answer == n) {
                result = i;
                break;
            }
        }
        answer = result;
        return answer;
    }
}