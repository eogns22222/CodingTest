package coding02.test35문자열안에_문자열;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        var flag = str1.contains(str2);
        
        if(flag) {
        	answer = 1;
        }else {
        	answer = 2;
        }
        
        return answer;
    }
}