class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0,s);
        answer += overwrite_string.substring(0,overwrite_string.length());
        if(answer.length() < my_string.length()) {
            answer +=  my_string.substring(answer.length(), my_string.length());
        }
        return answer;
    }
}