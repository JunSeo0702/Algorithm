class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String st = Integer.toString(k);
        char ch = st.charAt(0);
        String s = Integer.toString(num);
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ch) {
                answer = i+1;
                break;
            }
            else answer=-1;
        }
        return answer;
    }
}