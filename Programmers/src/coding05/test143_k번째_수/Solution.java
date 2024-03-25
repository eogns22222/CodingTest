package coding05.test143_k번째_수;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int iNum = 0;
        int jNum = 0;
        int kNum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < commands.length; i++) {
			iNum = commands[i][0] - 1;
			jNum = commands[i][1] - 1;
			kNum = commands[i][2] - 1;
			
			for (int j = iNum; j <= jNum; j++) {
				list.add(array[j]);
			}
			
			Collections.sort(list);
			
			answer[i] = list.get(kNum);
			
			list.removeAll(list);
			
		}
        
        return answer;
    }
}
