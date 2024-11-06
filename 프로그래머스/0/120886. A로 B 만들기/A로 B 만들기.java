class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int count=0;
        String[] be  = before.split("");
        String[] af  = after.split("");
        for(int i=0; i<before.length(); i++) {
            for(int j=0; j<after.length(); j++) {
                if(be[i].equals(af[j])) {
                    count++;
                    af[j]="";
                    break;
                }
            }
        }
        if(count==before.length()) {
            answer = 1;
        }
        return answer;
    }
}