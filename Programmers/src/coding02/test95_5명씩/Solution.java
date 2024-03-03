package coding02.test95_5명씩;

import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add(names[0]);
        
        for (int i = 5; i < names.length; i = i + 5) {
			list.add(names[i]);
		}

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}