package coding03.test116문자열_정렬하기_1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<String>();
        char[] ch = my_string.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
			if(ch[i] < 'a') {
				list.add(String.valueOf(ch[i]));
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
}