package ch09.ex19같은_숫자는_싫어;


import java.util.*;

// 같은 숫자는 싫어
public class Solution {
    public int[] solution(int []arr) {
        int before = arr[0];
        Queue<Integer> que = new LinkedList<Integer>();
        
        que.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
        	
        	if(arr[i] != before) {
        		
        		que.add(arr[i]);
        	}
        	before = arr[i];
		}
        
        int[] answer = new int[que.size()];
        
        int var = que.size();
        
        for (int i = 0; i < var; i++) {
			answer[i] = que.poll();
		}

        return answer;
    }
}