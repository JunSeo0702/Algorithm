class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int sum = 0;
        int a = 0;
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        answer = new int[sum];
        for(int i=0; i<arr.length; i++) {
            a = arr[i];
            for(int j=0; j<a; j++) {
                answer[index++] = a;
            }
        }
        return answer;
    }
}