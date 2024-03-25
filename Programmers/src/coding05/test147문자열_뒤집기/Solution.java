package coding05.test147문자열_뒤집기;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] str = my_string.substring(s, e + 1).split(""); // 뒤집어질 구간 미리 저장
        String[] str2 = new String[str.length]; // str 크기의 str2 선언
        String[] str3 = my_string.split(""); // 완성 배열 저장할 str3 선언 (미리 my_string 을 배열로 저장)
        int cnt = 0;
        
        // str 를 뒤집어서 str2 에 저장
        for (int i = str.length - 1; i >= 0; i--) { 
			str2[cnt] = str[i];
			cnt++;
		}
        
        // cnt 를 s 번째부터로 바꾼다
        cnt = s;
        for (int i = 0; i < str2.length; i++) {
			str3[s] = str2[i]; // str3 에 s 번째부터 str2 에 값을 전부 대입
			s++;
		}
        
        for (String n : str3) { // answer 에 저장
			answer += n;
		}
        
        return answer;
    }
}
