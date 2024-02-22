package coding01.test12;

// 접미사인지 확인하기
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        boolean bool = my_string.endsWith(is_suffix);
        
        if(bool) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}