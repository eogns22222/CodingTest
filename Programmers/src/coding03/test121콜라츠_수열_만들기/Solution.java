package coding03.test121콜라츠_수열_만들기;

import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(n);
        while(n > 1) {
        	if(n % 2 == 0) {
        		n = n / 2;
        		list.add(n);
        	}else {
        		n = n * 3 + 1;
        		list.add(n);
        	}
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}






















