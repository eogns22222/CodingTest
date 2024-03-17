package coding04.test141피보나치_수;

import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        // 0번째와 1번째는 미리 넣어줬다.
        
        for (int i = 2; i <= n; i++) { // 2번째부터 n까지 피보나치 저장
        	// 피보나치 수는 전 값과 전전 값을 더하면 된다.
			list.add((list.get(i - 1) + list.get(i - 2))  % 1234567); 
			// 값이 너무 크면 오버플로우가 생길 가능성이 있어 미리 나머지로 구해 준다.
			/* 
			 * 미리 나머지로 구했을 때 1234567 보다 값이 작을 경우는 상관없지만
			 * 1234567 보다 커질 경우가 우려되어
			 *  1. 나누기 전 저장 값 : 30 : 832040, 31 : 1346269, 32 : 2178309, 33 : 3524578
			 *  2. 저장한 값을 후에 나눈 값 : 30 : 832040, 31 : 111,702, 32 : 943,742, 33 : 1,055,444
			 *  3. 처음부터 나눈 후 저장 값 : 30 : 832040, 31 : 111,702, 32 : 943,742, 33 : 1,055,444
			 *  결과는 같다는 것을 확인
			 */
		}

        answer = list.get(list.size() - 1); // 저장된 마지막 값을 반환
        
        return answer;
    }
}
