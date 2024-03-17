package coding04.test138외계어_사전;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int cnt = 0;
        
        for (int i = 0; i < dic.length; i++) {
			for (int j = 0; j < spell.length; j++) {
				if(dic[i].contains(spell[j])) { // dic[i] 을 spell 배열에 있는 모든 값을 비교를 한다.
					cnt++; // 일치할때마다 카운트++
				}
				if(cnt == spell.length) { // 만약 카운트 횟수와 spell 배열 길이가 같다면
					return 1; // 모두 포함된 것으로 1을 return
				}
			}
			
			cnt = 0; // 카운트 횟수가 spell 배열 길이와 같지 않았기에 다시 초기화
		}
        answer = 2;
        
        return answer;
    }
}