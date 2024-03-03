package coding02.test81수_조작하기1;

class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] str = control.split("");
       
        for (String s : str) {
			switch (s) {
			case "w":
				n += 1;
				break;
				
			case "s":
				n -= 1;
				break;
				
			case "d":
				n += 10;
				break;
				
			case "a":
				n -= 10;
				break;

			default:
				break;
			}
		}
        
        answer = n;
        
        return answer;
    }
}