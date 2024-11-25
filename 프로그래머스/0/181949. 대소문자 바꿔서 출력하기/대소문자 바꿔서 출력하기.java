import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result="";
        for(int i=0; i<a.length(); i++) {
            char ch = a.charAt(i);
            if('A'<=ch && ch<='Z') {
                String st = Character.toString(ch);
                result += st.toLowerCase();
            }
            else if('a'<=ch && ch<='z') {
                String st = Character.toString(ch);
                result += st.toUpperCase();
            }
        }
        System.out.print(result);
        
    }
}