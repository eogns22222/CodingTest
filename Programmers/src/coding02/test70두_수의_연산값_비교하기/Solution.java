package coding02.test70두_수의_연산값_비교하기;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum1 = Integer.parseInt("" + a + b);
        int sum2 = (2 * a * b);
        
        if(sum1 >= sum2) {
        	answer = sum1;
        }else {
        	answer = sum2;
        }
        
        return answer;
    }
}