package coding03.test110가까운_1_찾기;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for (int i = idx; i < arr.length; i++) {
			if(arr[i] == 1) {
				answer = i;
				break;
			}
			answer = -1;
		}
        
        return answer;
    }
}