package coding02.test89대문자와_소문자;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'A' && ch[i] <= 'Z') {
				answer += String.valueOf(ch[i]).toLowerCase();
			}else {
				answer += String.valueOf(ch[i]).toUpperCase();
			}
		}
        
        return answer;
    }
}