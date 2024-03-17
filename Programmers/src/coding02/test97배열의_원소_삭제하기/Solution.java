package coding02.test97배열의_원소_삭제하기;

import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
        	list.add(arr[i]); // 미리 arr 의 i 번째를 저장
			for (int j = 0; j < delete_list.length; j++) {
				if(arr[i] == delete_list[j]) { // 만약 delete_list 에서 꺼내 오는 값 중에 arr의 i 번째와 같다면
					list.remove(list.indexOf(arr[i])); // 삭제
				}
			}
		}

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}