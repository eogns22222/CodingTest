package coding03.test118특별한_이차원_배열2;

class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] != arr[j][i]) {
					return 0;
				}
			}
			
		}
        answer = 1;
        
        return answer;
    }
}