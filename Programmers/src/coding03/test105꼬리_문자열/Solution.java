package coding03.test105꼬리_문자열;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for (String s : str_list) {
			if(s.contains(ex)) {
				continue;
			}
			answer += s;
		}
        
        return answer;
    }
}