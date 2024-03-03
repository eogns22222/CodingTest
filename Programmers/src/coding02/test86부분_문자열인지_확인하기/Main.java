package coding02.test86부분_문자열인지_확인하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("banana", "ana");
		System.out.println("1==" + result);

		result = sol.solution("banana", "wxyz");
		System.out.println("0==" + result);

	}

}
