package coding03.test111_I로_만들기;

//class Solution {
//    public String solution(String myString) {
//        String answer = "";
//        char[] ch = myString.toCharArray();
//        
//        for (int i = 0; i < ch.length; i++) {
//			
//        	if(ch[i] >= 'a' && ch[i] <= 'l') {
//        		answer += 'l';
//        	}else {
//        		answer += ch[i];
//        	}
//        	
//		}
//        
//        
//        return answer;
//    }
//}

class Solution {
    public String solution(String myString) {
        String answer = "";
        
        answer = myString.replaceAll("[^l-z]", "l");
        
        return answer;
    }
}