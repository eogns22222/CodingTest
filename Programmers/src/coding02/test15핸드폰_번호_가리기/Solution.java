package coding02.test15핸드폰_번호_가리기;

//class Solution {
//    public String solution(String phone_number) {
//        String answer = "";
//        int length = phone_number.length() - 4;
//        char[] ch = phone_number.toCharArray();
//        
//        for (int i = 0; i < length; i++) {
//        	
//        	ch[i] = '*';
//        	
//		}
//        
//        answer = String.valueOf(ch);
//        
//        
//        return answer;
//    }
//}


class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] str = phone_number.split("");
        
        for (int i = 0; i < str.length; i++) {
			if(i < str.length - 4) {
				answer += "*";
			}else {
				answer += str[i];
			}
			
		}
        
        return answer;
    }
}









































