package coding02.test72문자열의_앞의_n글자;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        answer = my_string.substring(0, n);
        
        return answer;
    }
}