class Solution {
    public int[] solution(int[] arr) {
        // 최대 크기를 arr.length로 설정
        int[] stk = new int[arr.length];
        int k = 0; // stk의 현재 크기
        int i = 0; // arr의 인덱스

        while (i < arr.length) {
            if (k == 0) { // stk가 비어있을 때
                stk[k++] = arr[i++];
            } else if (stk[k - 1] < arr[i]) { // stk의 마지막 원소가 arr[i]보다 작을 때
                stk[k++] = arr[i++];
            } else { // stk의 마지막 원소가 arr[i]보다 크거나 같을 때
                k--; // stk의 마지막 원소 제거
            }
        }

        // 결과 배열 생성
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            result[j] = stk[j];
        }

        return result;
    }
}
