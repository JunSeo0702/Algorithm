class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n; i>3; i--) {
            int k=0;
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    k++;
                    if(k==3) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}