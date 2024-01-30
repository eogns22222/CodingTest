package ch04.ex02;



public class Solution {
	 public int[] solution(int[] num_list) {
	        int[] answer = {0,0}; //짝수 / 홀수
	        
	        // 1. 들어온 배열의 값이 홀수인지 짝수인지 구분
	        // 짝수이면 answer[0] 의 값이 1 증가
	        // 아니면 answer[1] 의 값이 1 증가
	        
	        for (int i = 0; i < num_list.length; i++) {
				if(num_list[i] % 2 == 0){
					answer[0] += 1;
				}else {
					answer[1] += 1;				
				}	
		}
			
	        
	        
	        
	        return answer;
	    }
}
