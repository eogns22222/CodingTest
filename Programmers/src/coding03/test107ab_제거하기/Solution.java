package coding03.test107ab_제거하기;

import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<String>();
        
        for (String s : strArr) {
			if(s.contains("ad")) {
				continue;
			}else {
				list.add(s);
			}
		}
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        
        return answer;
    }
}