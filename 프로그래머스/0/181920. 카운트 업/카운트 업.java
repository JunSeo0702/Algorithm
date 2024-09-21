class Solution {
    public int[] solution(int start_num, int end_num) {
        int start = end_num - start_num + 1;
        int a = start_num;
        int[] answer = new int[start];
        for(int i=0; i<start; i++) {
            answer[i] = a;
            a++;
        }
        return answer;
    }
}