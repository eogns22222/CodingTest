package coding02.test17문자열_다루기_기본;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
        	try {
    			Integer.parseInt(s);
    		} catch (Exception e) {
    			answer = false;
    		}
        }else {
        	answer = false;
        }
        
        
        
        return answer;
    }
}
