package coding01.test01;

// 삼각형 완성조건
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < sides.length; i++) {
			for (int j = 0; j < sides.length; j++) {
				if(sides[i] > sides[j]) {
					int tmp = sides[i];
					sides[i] = sides[j];
					sides[j] = tmp;
				}
			}
		}
        max = sides[0];
        sum = sides[1] + sides[2];
        
        if(max < sum) {
        	answer = 1;
        }else if(max >= sum) {
        	answer = 2;
        }
        
        return answer;
    }
}