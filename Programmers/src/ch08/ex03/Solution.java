package ch08.ex03;

public class Solution {
	public String solution(int age) {
        String answer = "";
        String pa = "abcdefghij";
        StringBuilder builder = new StringBuilder();
        
        // 1. 숫자를 문자열화하여 끊고, 숫자로 다시 변환하는 방법
//        String[] num = String.valueOf(age).split("");
//        
//        for (String n : num) {
//        	 int idx = Integer.parseInt(n);
//        	 builder.append(pa.charAt(idx));
//		}
//        
//        answer = builder.toString();
        
        // 2. 두번째 방법
        while(age > 0) {
        	builder.append(pa.charAt(age%10));
            age /= 10;
        }
        
        answer = builder.reverse().toString();
        
        return answer;
    }
}
