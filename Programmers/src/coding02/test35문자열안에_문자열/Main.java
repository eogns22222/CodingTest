package coding02.test35문자열안에_문자열;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
		System.out.println("1==" + result);
		
		result = sol.solution("ppprrrogrammers", "pppp");
		System.out.println("2==" + result);
		
		result = sol.solution("AbcAbcA", "AAA");
		System.out.println("2==" + result);

		
	}

}
