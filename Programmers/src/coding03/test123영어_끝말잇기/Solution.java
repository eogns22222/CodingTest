package coding03.test123영어_끝말잇기;

import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        // 말했던 단어 저장할 배열 생성
        ArrayList<String> list = new ArrayList<String>();
        // 첫단어 첫 음절 미리 저장
        char before = words[0].charAt(0);
        // 사람 번호
        int num = 1;
        // 사람 당 말한 횟수
        int cnt = 1;
        
        for (int i = 0; i < words.length; i++) {
        	if(num > n) { // 마지막 사람 번호에서 넘어 갔으면
        		num = 1; // 다시 첫 사람으로 복귀
        		cnt++; // 첫 사람으로 복귀할 때 횟수 올림
        	}
        	
        	if(list.contains(words[i])) { // list 에 저장 되었던 단어가 다시 나올 시 종료
        		if(i == 0) { // 만약 그게 첫 번째 단어라면 정상적으로 돌아간 경우로 0,0 반환
        			num = 0;
        			cnt = 0;
        		}
        		break;
        	}
        	// 이전 단어의 마지막 음절과 지금 나온 단어의 첫 음절이 다르면 종료
        	if(before != words[i].charAt(0)) { 
        		break;
        	}
        	
        	// 지금 나온 단어의 마지막 음절 저장
        	before = words[i].charAt(words[i].length() - 1);
        	// 지금 나온 단어 list 에 추가
        	list.add(words[i]);
        	
        	// words 에 있던 모든 단어가 나왔으면 다시 맨 처음으로 복귀
        	if(i == words.length - 1) {
        		i = -1;
        	}
        	
        	num++; // 다음 사람으로 카운트
        	
		}
        
        answer[0] = num; // 틀린 사람 번호
        answer[1] = cnt; // 말한 횟수
        
        
        return answer;
    }
}






















