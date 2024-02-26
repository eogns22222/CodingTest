package coding01.test16;

// 이상한 문자 만들기
class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        int idx = 0;
        
        for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
				idx = 0;
			}else {
				if(idx % 2 == 0) {
					ch[i] = Character.toUpperCase(ch[i]);
				}else {
					ch[i] = Character.toLowerCase(ch[i]);
				}
				idx++;
			}
			
		}
        
        answer = String.valueOf(ch);
        
        return answer;
    }
}