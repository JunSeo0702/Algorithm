class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=0;
        min = Math.abs(n-array[0]);
        answer = array[0];
        for(int i=0; i<array.length; i++) {
            if(min > Math.abs(n-array[i])) {
                min = Math.abs(n-array[i]);
                answer = array[i];
            } 
            else if(min == Math.abs(n-array[i]) && answer > array[i]) {
                answer = array[i];
            }
        }
        return answer;
    }
}