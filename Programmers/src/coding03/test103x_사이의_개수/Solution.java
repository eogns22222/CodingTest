package coding03.test103x_사이의_개수;

import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] str = myString.split("");
        int cnt = 0;
        
        for (int i = 0; i < str.length; i++) {
			
        	if(!str[i].equals("x")) {
        		cnt++;
        	}
        	
        	
        	if(str[i].equals("x")) {
        		list.add(cnt);
        		cnt = 0;
        	}
        	
        	if(i == str.length - 1) {
        		list.add(cnt);
        	}
        	
        	
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}