class Solution {
    public String solution(String s) {
        String answer = "";
        String st[] = s.split(" ");
        int min, max;
        int[] arr = new int[st.length];
        
        for(int i=0; i<st.length; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        min = arr[0];
        max = arr[0];
        
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        answer = min + " " + max;
        
        return answer;
    }
}