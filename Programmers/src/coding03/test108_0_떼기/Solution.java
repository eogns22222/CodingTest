package coding03.test108_0_떼기;

//class Solution {
//    public String solution(String n_str) {
//        String answer = "";
//        String[] str = n_str.split("");
//        boolean flag = true;
//        
//        if(str[0].equals("0")) {
//        	flag = false;
//        	for (int i = 0; i < str.length; i++) {
//    			if(!str[i].equals("0")) {
//    				flag = true;
//    			}
//    			if(flag) {
//    				answer += str[i];
//    			}
//    		}
//		}else {
//			for (String s : str) {
//				answer += s;
//			}
//		}
//        
//        return answer;
//    }
//}

class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        answer = Integer.parseInt(n_str) + "";
        
        return answer;
    }
}