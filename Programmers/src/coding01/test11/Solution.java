package coding01.test11;

// 배열 만들기1
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        for (int i = 1; i <= n/k; i++) {
			
			if((k * i) > n) {
				break;
			}
			answer[i - 1] = k * i;
		}
        
        return answer;
    }
}