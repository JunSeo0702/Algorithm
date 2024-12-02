class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = t.length()-p.length() + 1;
        Long sp = Long.parseLong(p);
        
        for(int i=0; i<size; i++) {
            String result = t.substring(i,p.length()+i);
            if(Long.parseLong(result)<=sp) {
                answer++;
            }
        }
        return answer;
    }
}