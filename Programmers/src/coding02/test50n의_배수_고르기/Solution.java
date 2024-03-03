package coding02.test50n의_배수_고르기;

import java.util.LinkedList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for (Integer i : numlist) {
        	if(i % n == 0) {
        		list.add(i);
        		
        	}
		}
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}