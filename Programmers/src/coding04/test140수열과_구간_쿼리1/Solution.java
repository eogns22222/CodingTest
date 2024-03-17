package coding04.test140수열과_구간_쿼리1;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
		for (int j = 0; j < queries.length; j++) {
			
			// arr 의 queries[j][0] 번째 부터 queries[j][1] 번째까지 1++ 하라는 뜻
			for (int j2 = queries[j][0]; j2 <= queries[j][1]; j2++) {
				arr[j2] += 1;
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
		}
        
        return answer;
    }
}
