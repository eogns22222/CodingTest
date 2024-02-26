package coding01.test15;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		boolean result;
		
		result = sol.solution(10);
		System.out.println("true==" + result);
		result = sol.solution(12);
		System.out.println("true==" + result);
		result = sol.solution(11);
		System.out.println("false==" + result);
		result = sol.solution(13);
		System.out.println("false==" + result);
		
		
		
	}

}
