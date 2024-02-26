package coding01.test15;

// 하샤드 수
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int var = 0;
        int cl = x;
        
        while(x != 0) {
        	
        	var += x % 10;
        	x = x / 10;
        	
        }
        
        if(cl % var == 0) {
        	answer = true;
        }else {
        	answer = false;
        }
        
        return answer;
    }
}