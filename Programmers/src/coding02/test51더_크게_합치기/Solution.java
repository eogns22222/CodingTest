package coding02.test51더_크게_합치기;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        sum1 = Integer.parseInt("" + a + b);
        sum2 = Integer.parseInt("" + b + a);
        
        if(sum1 >= sum2) {
        	answer = sum1;
        }else if(sum2 > sum1) {
        	answer = sum2;
        }
        
        return answer;
    }
}