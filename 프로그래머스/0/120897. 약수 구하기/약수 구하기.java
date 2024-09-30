class Solution {
    public int[] solution(int n) {
        int[] answer;
        int k=0;
        int size=0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                size++;
            }
        }
        answer = new int[size];
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                answer[k] = i;
                k++;
            }
        }
        return answer;
    }
}