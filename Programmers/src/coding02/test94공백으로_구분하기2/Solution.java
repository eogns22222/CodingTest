package coding02.test94공백으로_구분하기2;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        
        for (String s : str) {
			list.add(s);
		}
        list.removeAll(Arrays.asList("", null)); // 빈 문자열 제거
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}

//class Solution {
//    public String[] solution(String my_string) {
//        String[] answer = my_string.trim().split("[ ]+");
//        
//        return answer;
//    }
//}