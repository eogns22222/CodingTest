package coding02.test96n개_간격의_원소들;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < num_list.length; i += n) {
			list.add(num_list[i]);
		}

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
		}
        
        return answer;
    }
}