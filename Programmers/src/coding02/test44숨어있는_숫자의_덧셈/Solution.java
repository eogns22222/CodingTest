package coding02.test44숨어있는_숫자의_덧셈;

//class Solution {
//    public int solution(String my_string) {
//        int answer = 0;
//        String intStr = my_string.replaceAll("[^0-9]", "");
//        String[] str = intStr.split("");
//        
//        for (String s : str) {
//			answer += Integer.parseInt(s);
//		}
//        
//        return answer;
//    }
//}

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (char c : my_string.toCharArray()) {
			
        	if(c >= '0' && c <= '9') {
        		answer += c - '0';
        	}
        	
		}
        
        return answer;
    }
}