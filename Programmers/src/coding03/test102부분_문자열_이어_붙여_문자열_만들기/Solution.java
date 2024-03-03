package coding03.test102부분_문자열_이어_붙여_문자열_만들기;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < parts.length; i++) {
			for (int j = 0; j < parts[i].length; j++) {
				if(j == 0) {
					start = parts[i][j];
				}else if(j == 1) {
					end = parts[i][j];
				}
			}
			answer += my_strings[i].substring(start, end + 1);
		}
        
        return answer;
    }
}