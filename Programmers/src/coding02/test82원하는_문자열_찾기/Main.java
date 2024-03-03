package coding02.test82원하는_문자열_찾기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("AbCdEfG", "aBc");
		System.out.println("1==" + result);

		result = sol.solution("aaAA", "aaaaa");
		System.out.println("0==" + result);

	}

}
