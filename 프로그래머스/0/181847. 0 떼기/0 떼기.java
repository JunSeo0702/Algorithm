class Solution {
    public String solution(String n_str) {
        String answer = "";
        int i=0;
        if(n_str.charAt(0) == '0') {
            while(n_str.charAt(i) == '0') {
                i++;
            }
        }
        answer = n_str.substring(i);
        return answer;
    }
}