package coding02.test88암호_해독;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("dfjardstddetckdaccccdegk", 4);
		System.out.println("attack==" + result);

		result = sol.solution("pfqallllabwaoclk", 2);
		System.out.println("fallback==" + result);

	}

}
