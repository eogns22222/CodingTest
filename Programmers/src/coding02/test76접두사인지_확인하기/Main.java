package coding02.test76접두사인지_확인하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("banana", "ban");
		System.out.println("1==" + result);

		result = sol.solution("banana", "nan");
		System.out.println("0==" + result);
		
		result = sol.solution("banana", "abcd");
		System.out.println("0==" + result);
		
		result = sol.solution("banana", "bananan");
		System.out.println("0==" + result);

		
		
	}

}
