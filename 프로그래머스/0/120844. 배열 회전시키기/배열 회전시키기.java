class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int length=numbers.length;
        if(direction.contains("right")) {
            int a=numbers[numbers.length-1];
            for(int i=1; i<numbers.length; i++) {
                answer[i] = numbers[i-1];
            }
            answer[0] = a;
        }
        else if(direction.contains("left")) {
            int b=numbers[0];
            for(int i=0; i<numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[answer.length-1] = b;
        }
        return answer;
    }
}