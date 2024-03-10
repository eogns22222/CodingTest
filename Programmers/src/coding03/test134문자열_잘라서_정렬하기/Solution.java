package coding03.test134문자열_잘라서_정렬하기;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> list = new ArrayList<String>();
        
        for (String s : answer) {
			if(!s.isEmpty()) {
				list.add(s);
			}
		}
        
        answer = list.toArray(new String[list.size()]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}