package coding03.test128배열_만들기3;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < intervals.length; i++) {
			for (int j = intervals[i][0]; j <= intervals[i][1]; j++) { // 1~3번째까지, 0~4번째까지 
				list.add(arr[j]);
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}