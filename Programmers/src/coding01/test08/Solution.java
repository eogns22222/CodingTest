package coding01.test08;

// 최대공약수와 최소공배수
class Solution {
    public int[] solution(int n, int m) {
    	
    	int[] answer = new int[2];
    	int max = 0;
    	
    	for (int i = 1; i <= m; i++) {
			
    		if(m % i == 0 && n % i == 0) {
    			max = i;
    		}
    		
		}
    	answer[0] = max;
    	
    	answer[1] = (n * m) / max;
    	
        return answer;
    }
}
