package coding02.test89대문자와_소문자;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("cccCCC");
		System.out.println("CCCccc==" + result);

		result = sol.solution("abCdEfghIJ");
		System.out.println("ABcDeFGHij==" + result);

	}

}
