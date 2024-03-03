package coding03.test100문자열_바꿔서_찾기;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] str = myString.split("");
        String sumStr = "";
        
        for (String s : str) {
			if(s.equals("A")) {
				sumStr += "B";
			}else {
				sumStr += "A";
			}
		}
        
        if(sumStr.contains(pat)) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}