package coding02.test68이어_붙인_수;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        
        for (int i : num_list) {
			
        	if(i % 2 == 0) {
        		str1 += i;
        	}else {
        		str2 += i;
        	}
        	
		}
        
        answer = Integer.parseInt(str1) + Integer.parseInt(str2);
        
        return answer;
    }
}