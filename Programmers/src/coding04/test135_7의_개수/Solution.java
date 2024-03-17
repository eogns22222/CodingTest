package coding04.test135_7의_개수;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 0;
        
        for (int i = 0; i < array.length; i++) {
        	
			while(array[i] > 0) {
				if(array[i] % 10 == 7) {
					cnt++;
				}
				array[i] = array[i] / 10;
			}
			
		}
        answer = cnt;
        
        return answer;
    }
}