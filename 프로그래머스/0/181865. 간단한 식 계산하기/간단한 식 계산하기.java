class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int stoppoint = 0;
        char op=' ';
        for(int i=0; i<binomial.length(); i++) {
            char c = binomial.charAt(i);
            if(c == '+'||c == '-'||c == '*') {
                stoppoint = i;
                op=c;
                break;
            }
        }
        String aStr = binomial.substring(0,stoppoint).trim();
        String bStr = binomial.substring(stoppoint+1).trim();
        int a = Integer.parseInt(aStr);
        int b = Integer.parseInt(bStr);
        
        switch(op) {
                case '+' :
                    answer = a+b;
                    break;
                case '*' :
                    answer = a*b;
                    break;
                case '-' :
                    answer = a-b;
                    break;
        }
        
        return answer;
    }
}