package coding02.test13음양더하기;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
			
        	if(signs[i] == false) {
        		answer += absolutes[i] * -1;
        	}else {
        		answer += absolutes[i];
        		
        	}
        	
		}
        
        return answer;
    }
}