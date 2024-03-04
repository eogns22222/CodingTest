package coding03.test106A_강조하기;

class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");
        
        for (String s : str) {
			
        	if(s.equals("a")) {
        		answer += s.toUpperCase();
        	}else if(s.equals(" ") || s.equals("A")) {
        		answer += s;
        	}else {
        		answer += s.toLowerCase();
        	}
        	
		}
        
        return answer;
    }
}