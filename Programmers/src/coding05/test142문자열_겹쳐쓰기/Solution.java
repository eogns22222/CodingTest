package coding05.test142문자열_겹쳐쓰기;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] str1 = my_string.split("");
        String[] str2 = overwrite_string.split("");
        int cnt = s;
        
        for (int i = 0; i < str2.length; i++) {
			str1[cnt] = str2[i];
			cnt++;
		}
        
        for (int i = 0; i < str1.length; i++) {
			answer += str1[i];
		}
        
        
        return answer;
    }
}
