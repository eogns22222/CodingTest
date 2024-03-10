package coding03.test125특별한_이차원_배열1;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if(i == j) {
					answer[i][j] = 1;
				}else {
					answer[i][j] = 0;
				}
			}
		}
        
        return answer;
    }
}






















