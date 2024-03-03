package coding02.test56n번째_원소부터;

import java.util.Arrays;

//class Solution {
//    public int[] solution(int[] num_list, int n) {
//        int[] answer = new int[num_list.length - n + 1];
//        int cnt = 0;
//        
//        for (int i = n - 1; i < num_list.length; i++) {
//			answer[cnt] = num_list[i];
//			cnt++;
//		}
//        
//        return answer;
//    }
//}

class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);

		return answer;
	}
}