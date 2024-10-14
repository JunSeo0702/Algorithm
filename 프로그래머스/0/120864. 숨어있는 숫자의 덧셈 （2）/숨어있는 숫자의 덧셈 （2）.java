class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string=my_string.toLowerCase();
        String[] st = my_string.split("[a-z]");
        for(String numstr : st) {
            if(!numstr.isEmpty()) {
                answer += Integer.parseInt(numstr);
            }
        }
        
        return answer;
    }
}