package ch09.ex06;

// 콜라
class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;
		int mok = 0;
		int var = 0;
		
		while(true) {
			mok = n / a;
			var = n % a;
			n = mok + var; // 10 5 3 2 1

			answer += mok * b;
			
			if(n < a) {
				break;
			}
		}
		
		
		return answer;
	}
}








