import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger sa = new BigInteger(a);
        BigInteger sb = new BigInteger(b);
        BigInteger result = sa.add(sb);
        answer = result.toString();
        return answer;
    }
}