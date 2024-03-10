package coding03.test132배열_회전시키기;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
    	int[] answer = new int[numbers.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(direction.equals("right")) {
        	list.add(numbers[numbers.length - 1]);
        	for (int i = 0; i < numbers.length - 1; i++) {
				list.add(numbers[i]);
			}
        }else {
        	for (int i = 1; i < numbers.length; i++) {
				list.add(numbers[i]);
			}
        	list.add(numbers[0]);
        }
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
 
        
        return answer;
    }
}