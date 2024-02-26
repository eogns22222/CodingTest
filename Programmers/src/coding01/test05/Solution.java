package coding01.test05;

// 콜라
class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;
		int mok = 0;
		int var = 0;
		
		while(n / a > 0) {
			mok = (n / a) * b;
			answer += mok;
			n = mok + (n % a);
		}
		
		return answer;
	}
}








