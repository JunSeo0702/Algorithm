class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for(int i=0; i<s; i++) {
            char ch = my_string.charAt(i);
            answer += ch;
        }
        for(int i=e; i>=s; i--) {
            char ch = my_string.charAt(i);
            answer += ch;
        }
        for(int i=e+1; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            answer += ch;
        }
        return answer;
    }
}