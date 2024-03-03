package coding02.test83공백으로_구분하기1;

import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
    	ArrayList<String> list = new ArrayList<String>();
    	String[] str = my_string.split(" ");
        
        for (String s : str) {
			list.add(s);
		}
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}