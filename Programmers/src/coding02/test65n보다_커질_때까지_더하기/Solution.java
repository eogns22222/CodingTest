package coding02.test65n보다_커질_때까지_더하기;

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        
        for (int i : numbers) {
        	answer += i;
			if(answer > n) {
				break;
			}
		}
        
		return answer;
    }
}