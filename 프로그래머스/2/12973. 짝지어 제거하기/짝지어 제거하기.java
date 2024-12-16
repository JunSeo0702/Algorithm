import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(stack.empty()) {
                stack.push(s.charAt(i));
            }
            else {
                char ch = s.charAt(i);
                if(stack.peek() == ch) {
                    stack.pop();
                }
                else stack.push(ch);
            }
        }
        if(stack.empty()) {
            answer = 1;
        }
        return answer;
    }
}