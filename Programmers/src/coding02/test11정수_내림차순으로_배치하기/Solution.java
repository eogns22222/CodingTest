package coding02.test11정수_내림차순으로_배치하기;

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        String str2 = "";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        
        for (int i = ch.length - 1; i >= 0; i--) {
			
        	str2 += ch[i];
        	
		}
        
        
        answer = Long.parseLong(str2);
        
        return answer;
    }
}