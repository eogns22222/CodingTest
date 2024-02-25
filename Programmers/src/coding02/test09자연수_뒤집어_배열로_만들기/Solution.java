package coding02.test09자연수_뒤집어_배열로_만들기;

import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(n > 0) {
        	
        	list.add((int) (n % 10));
        	n = n / 10;
        	
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
			
        	answer[i] = list.get(i);
        	
		}
        
        
        return answer;
    }
}