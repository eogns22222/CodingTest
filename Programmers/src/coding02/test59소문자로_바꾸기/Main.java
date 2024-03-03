package coding02.test59소문자로_바꾸기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("aBcDeFg");
		System.out.println("abcdefg==" + result);
		
		result = sol.solution("aaa");
		System.out.println("aaa==" + result);
		
	}

}
