package coding04.test137팩토리얼;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 1; // 초기값 1로 지정
        int cnt = 2; // 어차피 2 부터 곱할거라 2로 지정
        
        while(true) {
        	
        	sum = sum * cnt; // sum 축적
        	
        	if(sum == n) { // 같다면 바로 브레이크
        		break;
        	}else if(sum > n) { // 크다면 카운트에 1이 더 추가되어 돌았다는 뜻으로 -1 해준다.
        		cnt -= 1;
        		break;
        	}
        	cnt++;
        	
        }
        answer = cnt;
        
        return answer;
    }
}