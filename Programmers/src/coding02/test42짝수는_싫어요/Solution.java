package coding02.test42짝수는_싫어요;

class Solution {
    public int[] solution(int n) {
    	int num = 0;
    	if(n % 2 == 0) {
    		num = n / 2;
    	}else {
    		num = n / 2 + 1;
    	}
    	
        int[] answer = new int[num];
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
			
        	if(i % 2 == 1) {
        		answer[cnt] = i;
        		cnt++;
        	}
        	
		}
        
        return answer;
    }
}