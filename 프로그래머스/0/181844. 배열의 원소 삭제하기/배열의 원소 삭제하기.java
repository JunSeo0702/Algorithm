class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        int k=0;
        int size=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    k++;
                }
            }
        }
        answer = new int[arr.length-k];
        for(int i=0; i<arr.length; i++) {
            int index=0;
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    index=1;
                    break;
                }
            }
            if(index==0) {
                answer[size] = arr[i];
                size++;
            }
        }
        return answer;
    }
}