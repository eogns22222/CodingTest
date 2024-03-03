package coding02.test86부분_문자열인지_확인하기;

class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        if(my_string.contains(target)) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}