package coding02.test91특정한_문자를_대문자로_바꾸기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("programmers", "p");
		System.out.println("Programmers==" + result);

		result = sol.solution("lowercase", "x");
		System.out.println("lowercase==" + result);

	}

}
