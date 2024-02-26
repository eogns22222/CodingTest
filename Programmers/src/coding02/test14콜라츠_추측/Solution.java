package coding02.test14콜라츠_추측;

class Solution {
    public int solution(int num) {
        int answer = 0;
        long sum = num;
        int count = 0;
        
        while(sum > 1) {
        	
        	if(sum % 2 == 0) {
        		sum = sum / 2;
        	}else if(sum % 2 == 1){
        		sum = (sum * 3) + 1;
        	}
        	
        	count++;
        	
        	if(count == 500) {
        		count = -1;
        		break;
        	}
        	
        	
        }
        
        answer = count;
        
        return answer;
    }
}