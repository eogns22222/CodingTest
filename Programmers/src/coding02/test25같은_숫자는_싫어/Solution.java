package coding02.test25같은_숫자는_싫어;

import java.util.*;

public class Solution {
	public int[] solution(int[] arr) {
		int before = arr[0]; // 미리 비교할 값 저장
		Queue<Integer> queue = new LinkedList<Integer>(); 
		
		queue.add(arr[0]); // 미리 첫번째 값 저장
		
		for (Integer n : arr) { 
			if(before != n) { // 이전 값과 새로 꺼낼 값이 같지 않을 때만 queue 에 저장
				queue.add(n);
			}
			before = n; // 새로운 이전 값 저장
		}
		
		int[] answer = new int[queue.size()];
		for (int i = 0; i < answer.length; i++) { // queue 에서 하나씩 꺼내 answer 에 저장
			answer[i] = queue.poll();
		}

		return answer;
	}
}






































