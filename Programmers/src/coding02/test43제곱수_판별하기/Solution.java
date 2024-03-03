package coding02.test43제곱수_판별하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(Math.sqrt(n) % 1 == 0) {
        	answer = 1;
        }else {
        	answer = 2;
        }
        
        return answer;
    }
}