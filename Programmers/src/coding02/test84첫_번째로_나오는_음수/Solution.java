package coding02.test84첫_번째로_나오는_음수;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
			if(num_list[i] < 0) {
				answer = i;
				break;
			}else {
				answer = -1;
			}
			
		}
        
        return answer;
    }
}