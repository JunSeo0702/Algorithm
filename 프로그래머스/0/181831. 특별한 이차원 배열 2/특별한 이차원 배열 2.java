class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        for(int i=0; i<arr.length; i++) {
            for(int j=arr.length-1; j>0; j--) {
                if(arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }
}