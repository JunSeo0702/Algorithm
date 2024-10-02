class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int k=0;
        for(int i=0; i<num_list.length; i++) {
            while(num_list[i] > 1) {
                System.out.print(num_list[2]);
                if(num_list[i] % 2 ==0) {
                    num_list[i] /= 2;
                    answer++;
                }
                else if(num_list[i] % 2== 1) {
                    num_list[i] = (num_list[i]-1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}