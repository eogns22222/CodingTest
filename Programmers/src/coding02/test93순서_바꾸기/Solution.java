package coding02.test93순서_바꾸기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int cnt = 0;
        
        for (int i = n; i < answer.length; i++) {
			answer[cnt] = num_list[i];
			cnt++;
		}
        
        for (int i = 0; i < n; i++) {
        	System.out.println(Arrays.toString(answer));
			answer[cnt] = num_list[i];
			cnt++;
		}
        
        return answer;
    }
}