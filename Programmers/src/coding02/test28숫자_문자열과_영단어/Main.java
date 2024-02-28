package coding02.test28숫자_문자열과_영단어;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;

		result = sol.solution("one4seveneight");
		System.out.println("1478==" + result);
		
		result = sol.solution("23four5six7");
		System.out.println("234567==" + result);
		
		result = sol.solution("2three45sixseven");
		System.out.println("234567==" + result);
		
		result = sol.solution("123");
		System.out.println("123==" + result);
		


	}

}
