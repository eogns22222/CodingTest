package ch08.ex02;

public class Solution {

	public String solution(String my_string, int n) {
        String answer = "";
        
        // 각각의 문자를 뽑아내기
        String[] arr = my_string.split("");
        
        StringBuffer buffer = new StringBuffer();
        
        // 뽑아낸 문자를 n번 반복
        for (String str : arr) {
        	// 반복된 문자를 answer 에 합치기
        	buffer.append(str.repeat(n));
		}
        answer = buffer.toString();
        
        
//        for (int i = 0; i < my_string.length(); i++) {
//
//        	for (int j = 0; j < n; j++) {
//        		answer += my_string.charAt(i);
//			}
//        	
//		}
        
        return answer;
    }
	
}
