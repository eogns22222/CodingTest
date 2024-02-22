package ch09.ex13;

// 접미사인지 확인하기
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        boolean bool = my_string.contains(is_suffix);
        System.out.println(bool);
        
        return answer;
    }
}