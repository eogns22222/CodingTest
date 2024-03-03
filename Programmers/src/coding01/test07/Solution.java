package coding01.test07;

import java.util.ArrayList;
import java.util.Collections;

// 나누어 떨어지는 숫자 배열
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        if(list.size() == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        
        int size = 0;
        
        for (int i : list) {
			answer[size++] = i;
			
		}
        
       
        return answer;
    }
}
