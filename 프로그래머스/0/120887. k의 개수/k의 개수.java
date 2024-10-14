class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++) {
            String st = Integer.toString(a);
            String sk = Integer.toString(k);
            char cha = sk.charAt(0);
            for(int b=0; b<st.length(); b++) {
                char ch = st.charAt(b);
                if(ch==cha) {
                    answer++;
                }
            }
        }
        return answer;
    }
}