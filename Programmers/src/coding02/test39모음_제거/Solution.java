package coding02.test39모음_제거;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = {"a", "e", "i", "o", "u"};
        
        for (String s : str) {
        	my_string = my_string.replace(s, "");
        	
		}
        answer = my_string;
        
        
        return answer;
    }
}