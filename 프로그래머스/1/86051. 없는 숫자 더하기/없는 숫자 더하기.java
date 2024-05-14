class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int num[] = new int[10];
        for(int i=0; i<10; i++) {
            num[i] = i;
        }
        
        for(int i=0; i<num.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(numbers[j]==i) {
                    num[i] = 0;
                }
            }
        }
        for(int i=0; i<num.length; i++) {
            System.out.println(num[i]);
            answer += num[i];
        }
        return answer;
    }
}