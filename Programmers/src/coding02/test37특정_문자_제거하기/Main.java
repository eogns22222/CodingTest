package coding02.test37특정_문자_제거하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("abcdef", "f");
		System.out.println("abcde==" + result);
		
		result = sol.solution("BCBdbe", "B");
		System.out.println("Cdbe==" + result);

	}

}
