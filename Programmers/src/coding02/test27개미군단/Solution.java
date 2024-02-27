package coding02.test27개미군단;

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int power = 5;
        
        while(hp > 0) {
        	
        	answer += hp / power;
        	hp = hp % power;
        	
        	power--;
        	power--;
        	
        }
        
        
        return answer;
    }
}