package coding02.test99할_일_목록;

import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < todo_list.length; i++) {
			if(finished[i] == false) {
				list.add(todo_list[i]);
			}
		}
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}