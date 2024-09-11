class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int right = money % 5500;
        int left = money / 5500;
        answer[0] = left;
        answer[1] = right;
        return answer;
    }
}