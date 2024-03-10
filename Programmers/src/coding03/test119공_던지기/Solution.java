package coding03.test119공_던지기;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num = 0;
        
        for (int i = 0; i < k; i++) {
        	answer = numbers[num];
			if(num == numbers.length - 1) {
				num = 1;
			}else if(num == numbers.length - 2) {
				num = 0;
			}else {
				num += 2;
			}
		}
        
        
        return answer;
    }
}