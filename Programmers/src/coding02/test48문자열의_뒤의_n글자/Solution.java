package coding02.test48문자열의_뒤의_n글자;

//class Solution {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        String[] str = my_string.split("");
//        
//        for (int i = str.length - n; i < str.length; i++) {
//        	answer += str[i];
//		}
//        
//        return answer;
//    }
//}

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        answer = my_string.substring(my_string.length() - n);
        
        return answer;
    }
}