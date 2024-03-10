package coding03.test130접미사_배열;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split("");
        String str2 = "";
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = str.length - 1; i >= 0; i--) {
			str2 = str[i] + str2;
			list.add(str2);
		}
        
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}