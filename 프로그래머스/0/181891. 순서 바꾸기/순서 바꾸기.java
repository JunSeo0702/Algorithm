class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int k=0;
        for(int i=n; i<num_list.length; i++) {
            answer[k] = num_list[i];
            k++;
        }
        for(int i=0; i<n; i++) {
            answer[k] = num_list[i];
            k++;
        }
        return answer;
    }
}