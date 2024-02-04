package ch09.ex04;

import java.util.Stack;

public class Solution {
	
	// 닫힘으로 시작하면 애초에 비교할 가치도 없다.
	boolean solution(String s) {
        boolean answer = true;

        if(s.startsWith(")")) {
        	return false;
        }
        
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') { // '(' 일 경우 값 증가
				sum++;
			}else { // ')' 일 경우 값 감소
				if(sum > 0) {
					sum--;
				}else {
					return false;
				}
				
			}
		}
        
        answer = sum == 0;

        return answer;
    }
	
}













