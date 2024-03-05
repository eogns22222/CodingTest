package coding03.test113예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
			if(budget < d[i]) {
				break;
			}
			budget = budget - d[i];
			cnt++;
		}
        answer = cnt;
        
        return answer;
    }
}