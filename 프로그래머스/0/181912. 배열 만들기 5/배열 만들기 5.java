class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer;
        int size = 0;
        int index=0;
        String st = "";
        for(int i=0; i<intStrs.length; i++) {
            for(int j=s; j<s+l; j++) {
                char ch = intStrs[i].charAt(j);
                st += ch;
            }
            if(Integer.parseInt(st) > k) {
                size++;
            }
            st="";
        }
        answer = new int[size];
        
        for(int i=0; i<intStrs.length; i++) {
            for(int j=s; j<s+l; j++) {
                char ch = intStrs[i].charAt(j);
                st += ch;
            }
            if(Integer.parseInt(st) > k) {
                answer[index++] = Integer.parseInt(st);
            }
            st="";
        }
        return answer;
    }
}