package coding02test22기사단원;


// 기사단원의 무기
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 1; i <= number; i++) {
			
        	for (int j = 1; j <= i; j++) {
				
        		if(i % j == 0) {
        			++sum;
        		}
			}
        	
        	if(sum > limit) {
        		sum = power;
        	}
        	
        	answer += sum;
        	sum = 0;
        	
		}
        
        return answer;
    }
}