class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int capet = brown + yellow;
        for(int i=3; i<capet; i++) {
            int col = i; //세로
            int row = capet/i; //가로
        
            if(row>=col) {
                if((col-2) * (row-2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }
}