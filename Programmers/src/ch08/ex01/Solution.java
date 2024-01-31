package ch08.ex01;

public class Solution {

	public String solution(String my_string) {
		// 1. StringBuffer 활용 (0.09ms~0.10ms)
		StringBuffer buffer = new StringBuffer(my_string);
		String answer = buffer.reverse().toString();
		
		
		// 2. char[] 활용 (0.02ms~0.04ms)
		char[] result = new char[my_string.length()];
		
		for (int i = 0; i < my_string.length(); i++) {
			result[(my_string.length() - 1) - i] = my_string.charAt(i);
		}
		answer = new String(result); // 배열을 다시 문자열로
		
        return answer;
    }
	
}
