package coding02.test06나머지가_1이_되는_수_찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = n; i > 0; i--) {
        	if(n % i == 1) {
        		answer = i;
        	}
        	
		}
        
        return answer;
    }
}