package coding04.test139푸드_파이트_대회;

import java.util.ArrayList;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>(); // 최종 저장할 list
        ArrayList<Integer> list2 = new ArrayList<Integer>(); // 거꾸로 뒤집어 넣어줄 list
        int cnt = 1;
        
        for (int i = 1; i < food.length; i++) { // 물을 필요없으니 1번부터 시작
        	
			for (int j = 0; j < food[i] / 2; j++) { // 음식을 공평하게 둘로 나누어야 하기에 
				// 1번 음식부터 나누어진 횟수만큼 저장
				list.add(cnt);
				list2.add(cnt);
			}
			cnt++; // 다음 음식으로 카운팅
		}
        
        list.add(0); // 물 넣어주고
        
        for (int i = list2.size() - 1; i >= 0; i--) { // 같이 저장된 list2 를 반전해서 list 에 넣어줌
			list.add(list2.get(i));
		}
        
        for (Integer n : list) {
			answer += String.valueOf(n);
		}
        
        return answer;
    }
}