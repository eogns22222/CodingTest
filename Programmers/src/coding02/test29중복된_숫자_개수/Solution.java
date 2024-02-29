package coding02.test29중복된_숫자_개수;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i : array) {
			if(i == n) {
				answer++;
			}
		}
        
        return answer;
    }
}