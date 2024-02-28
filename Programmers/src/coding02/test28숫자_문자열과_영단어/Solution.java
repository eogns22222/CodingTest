package coding02.test28숫자_문자열과_영단어;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        Set<String> set = map.keySet();
        Iterator<String> iter = set.iterator();
        
        while(iter.hasNext()) {
        	String key = iter.next();
        	if(s.contains(key)) {
        		str = ""+map.get(key);
        		s = s.replace(key, str);
        	}
        }
        
        answer = Integer.valueOf(s);
        
        
        return answer;
    }
}