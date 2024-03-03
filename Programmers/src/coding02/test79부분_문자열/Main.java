package coding02.test79부분_문자열;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("abc", "aabcc");
		System.out.println("1==" + result);

		result = sol.solution("tbt", "tbbttb");
		System.out.println("0==" + result);

	}

}
