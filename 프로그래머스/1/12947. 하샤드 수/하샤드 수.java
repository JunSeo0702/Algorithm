class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a,sum = 0;
        int total = x;
        while(x>0) {
            a = x % 10;
            sum += a;
            x = x / 10;
        }
        
        if((total % sum) != 0) {
            answer = false;
        }
        return answer;
    }
}