package coding03.test113예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        
        Arrays.sort(d); // 최대한 많은 팀을 지원하기 위해 값을 오름차순으로 정렬한다.
        
        for (int i = 0; i < d.length; i++) {
			if(budget < d[i]) { // 남은 예산이 꺼낸 온 금액보다 작으면 종료 시켜라
				break;
			}
			budget = budget - d[i]; // 예산에서 꺼낸 온 금액을 차감해 저장
			cnt++; // 지원해준 팀 수를 카운팅
		}
        answer = cnt;
        
        return answer;
    }
}