package coding02.test82원하는_문자열_찾기;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        if(myString.toLowerCase().contains(pat.toLowerCase())) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}