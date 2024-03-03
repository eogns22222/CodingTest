package coding02.test90카운트_다운;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int cnt = 0;
        
        while(start >= end_num) {
        	answer[cnt] = start;
        	start--;
        	cnt++;
        }
        
        return answer;
    }
}