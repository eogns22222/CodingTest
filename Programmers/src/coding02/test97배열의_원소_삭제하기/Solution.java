package coding02.test97배열의_원소_삭제하기;

import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
        	list.add(arr[i]);
			for (int j = 0; j < delete_list.length; j++) {
				if(arr[i] == delete_list[j]) {
					list.remove(list.indexOf(arr[i]));
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