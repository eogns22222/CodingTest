package ch09.ex14;

// 없는 숫자 더하기
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        String str = "";
        
        for (Integer n : numbers) {
			str += n + "";
		}
        for (int i = 0; i < 10; i++) {
        	String str2 = i + "";
			if(!str.contains(str2)) {
				int var = Integer.valueOf(str2);
				answer += var;
			}
		}
        
        return answer;
    }
}