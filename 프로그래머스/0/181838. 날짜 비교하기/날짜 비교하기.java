class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String da1="";
        String da2="";
        int a,b=0;
        for(int i=0; i<date1.length; i++) {
            da1+=Integer.toString(date1[i]);
            da2+=Integer.toString(date2[i]);
        }
        a = Integer.parseInt(da1);
        b = Integer.parseInt(da2);
        System.out.println(a);
        System.out.println(b);
        if(a<b) {
            answer = 1;
        }
        
        return answer;
    }
}