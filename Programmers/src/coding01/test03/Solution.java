package coding01.test03;

import java.util.ArrayList;

// 제일 작은 수 제거하기
class Solution {
	public int[] solution(int[] arr) {
		int[] answer = {};

		ArrayList<Integer> list = new ArrayList<Integer>();

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		list.remove(list.indexOf(min));

		if (list.isEmpty()) {
			list.add(-1);
		}

		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		

		return answer;
	}
}