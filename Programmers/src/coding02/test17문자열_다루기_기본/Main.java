package coding02.test17문자열_다루기_기본;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		boolean result;
		
		result = sol.solution("a234");
		System.out.println("false==" +result);
		
		result = sol.solution("1234");
		System.out.println("true==" +result);
		
		
	}

}
