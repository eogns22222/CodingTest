package coding02.test03크기가_작은_부분문자열;

class Solution {
    public int solution(String t, String p) {
    	char[] ch = t.toCharArray();
        int answer = 0;
        int length = ch.length - p.length() + 1;
        long num = Long.parseLong(p);
        String str = "";
        
        
        for (int i = 0; i < length; i++) {
        	
        	
        	for (int j = i; j < p.length() + i; j++) {
				str += String.valueOf(ch[j]);
				
			}
        	
        	long var = Long.parseLong(str);
			
			if(var <= num) {
				answer++;
			}

			str = "";
			
		}
        
        return answer;
    }
}