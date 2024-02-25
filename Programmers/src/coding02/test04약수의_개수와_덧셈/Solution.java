package coding02.test04약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;
        
        for (int i = left; i <= right; i++) {
			
        	for (int j = 1; j <= i; j++) {
				
        		if(i % j == 0) {
        			sum ++;
        		}
        		
			}
        	System.out.println(sum);
        	
        	if(sum % 2 == 0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        	sum = 0;
        	
		}
        
        return answer;
    }
}