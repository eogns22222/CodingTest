package coding02.test10정수_제곱근_판별;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long)Math.sqrt(n);
        
        if(sqrt * sqrt == n) {
        	answer = (sqrt + 1) * (sqrt + 1);
        }else {
        	answer = -1;
        }
        
        return answer;
    }
}