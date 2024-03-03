package coding02.test92배열의_원소만큼_추가하기;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				list.add(String.valueOf(arr[i]));
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
        
        
        return answer;
    }
}