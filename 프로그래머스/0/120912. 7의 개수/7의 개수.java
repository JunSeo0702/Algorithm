class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            String st = Integer.toString(array[i]);
            for(int j=0; j<st.length(); j++) {
                char ch = st.charAt(j);
                if(ch == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}