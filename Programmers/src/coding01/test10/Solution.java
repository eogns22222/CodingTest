package coding01.test10;

// 피자 노나먹기
class Solution {
	public int solution(int slice, int n) {
		int answer = 0;
		
		answer = n / slice;
		if(n % slice > 0) {
			answer++;
		}
	
		return answer;
	}
}