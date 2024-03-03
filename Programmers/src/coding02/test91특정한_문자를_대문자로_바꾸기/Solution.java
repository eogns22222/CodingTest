package coding02.test91특정한_문자를_대문자로_바꾸기;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] str = my_string.split("");
        
        for (int i = 0; i < str.length; i++) {
			if(str[i].equals(alp)) {
				answer += str[i].toUpperCase();
			}else {
				answer += str[i];
			}
			
		}
        
        return answer;
    }
}