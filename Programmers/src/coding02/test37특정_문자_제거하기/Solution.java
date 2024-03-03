package coding02.test37특정_문자_제거하기;

import java.util.ArrayList;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        ArrayList<String> list = new ArrayList<String>();
        
        for (char m : ch) {
        	if(String.valueOf(m).equals(letter)) {
        		continue;
        	}
        	
			list.add(String.valueOf(m));
		}
        

        for (String s : list) {
			answer += s;
		}
        
        return answer;
    }
}