package coding03.test112주사위의_개수;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int cnt1 = 1;
        
        for (int i = 0; i < box.length; i++) {
			cnt1 *= box[i] / n;
		}
        
        answer = cnt1;
        
        return answer;
    }
}