class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String st[] = s.split("");
        int sum=0;
        if(st[0].equals(")")) {
            return false;
        }
        for(int i=0; i<st.length; i++) {
            if(sum<0) {
                return false;
            }
            else if(st[i].equals("(")) {
                sum++;
            }
            else if(st[i].equals(")")) {
                sum--;
            }
        }
        if(sum==0) {
            answer = true;
        }
        else answer =false;

        return answer;
    }
}