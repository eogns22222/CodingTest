package coding01.test06;

import java.util.ArrayList;

// 문자열 내 p와 y의 개수
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countY = 0;
        int countP = 0;

        String str = s.toUpperCase();
        ArrayList<String> list = new ArrayList<String>();
        
        String[] arr = str.split("");
        
        for (String t : arr) {
			list.add(t);
		}

        for (int i = 0; i < list.size(); i++) {

        	if("Y".equals(list.get(i))) {
        		countY++;
        	}
        	if("P".equals(list.get(i))) {
        		countP++;
        	}
        	
		}
        
        if(countY == countP) {
        	answer = true;
        }else {
        	answer = false;
        }
        
        
        return answer;
    }
}
