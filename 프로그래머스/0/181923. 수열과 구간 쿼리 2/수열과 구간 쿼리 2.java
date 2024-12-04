class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int k=0;
        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int min = queries[i][2];
            int max=Integer.MAX_VALUE;
            int result = 0;
            for(int j=s; j<=e; j++) {
                if(arr[j] > min) {
                    result=1;
                    if(arr[j]<max) {
                        max = arr[j];
                    }
                }
            }
            if(result==1) {
                answer[k++] = max;
            }
            else answer[k++] = -1;
        }
        return answer;
    }
}