package coding02.test71길이에_따른_연산;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 1;
        
        for (int i = 0; i < num_list.length; i++) {
			if(num_list.length > 10) {
				sum1 += num_list[i];
				answer = sum1;
			}else {
				sum2 *= num_list[i];
				answer = sum2;
			}
			
		}
        
        
        return answer;
    }
}