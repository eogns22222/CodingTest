package coding02.test77글자_이어_붙여_문자열_만들기;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] str = my_string.split("");
        
        for (int i = 0; i < index_list.length; i++) {
			answer += str[index_list[i]];
		}
        
        return answer;
    }
}