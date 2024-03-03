package coding02.test61대문자로_바꾸기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("aBcDeFg");
		System.out.println("ABCDEFG==" + result);
		
		result = sol.solution("AAA");
		System.out.println("AAA==" + result);
		
		
	}

}
