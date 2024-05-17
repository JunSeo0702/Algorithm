class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        if(arr.length == 1) {
            return new int[]{-1};
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != min) {
                answer[count++] = arr[i];
            }
        }
        
        return answer;
    }
}