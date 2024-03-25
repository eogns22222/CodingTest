package coding05.test148수열과_구간_쿼리3;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int num1 = 0;
        int num2 = 0;
        int temp = 0;
        
        for (int i = 0; i < queries.length; i++) {
			num1 = queries[i][0]; // 쿼리 i 번째의 0 번째 값 저장
			num2 = queries[i][1]; // 쿼리 i 번째의 1 번째 값 저장
        	
			// 치환 공식
			temp = arr[num1]; // temp 에 arr 의 num1 번째 저장
			arr[num1] = arr[num2]; // arr num1 번째에 arr num2 번째 저장
			arr[num2] = temp; // arr num2 번째에 temp 저장
        	
		}
        
        // 최종 arr 을 answer 에 저장
        for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
		}
        
        return answer;
    }
}
