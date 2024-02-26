package coding02.test20_3진법_뒤집기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n, 3);
        String var = "";
        char[] ch = str.toCharArray();
        
        for (int i = ch.length - 1; i >= 0; i--) {
        	var += String.valueOf(ch[i]);
		}
        answer += Integer.parseInt(var, 3);
        
        return answer;
    }
}