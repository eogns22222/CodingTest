package coding02.test47원소들의_곱과_합;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multi = 1;
        
        for (int n : num_list) {
			
        	sum += n;
        	multi *= n;
        	
		}
        
        if(multi < (sum * sum)) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}