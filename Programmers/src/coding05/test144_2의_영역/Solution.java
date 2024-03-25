package coding05.test144_2의_영역;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        String str = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int n : arr) { // arr 하나씩 꺼내서
        	if(n >= 10) { // n 이 10 보다 크거나 같다면
        		n = n / 10;  // 10 으로 나눠서 한자리수로 만들어준다.
        	}
        	
			str += n; // 저장
		}
        
        // str 에서 앞에서부터 2를 찾은 위치 부터 뒤에서부터 2를 찾은 위치까지 arr 배열에서 꺼내
        for (int i = str.indexOf("2"); i <= str.lastIndexOf("2"); i++) {
        	if(str.indexOf("2") == -1) { // -1 은 2가 없다는 뜻으로 -1 을 저장
        		list.add(-1);
        		break;
        	}
			list.add(arr[i]); // list 에 저장
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}
