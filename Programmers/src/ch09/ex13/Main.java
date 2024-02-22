package ch09.ex13;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("banana","ana");
		System.out.println("1==" + result);
		
		result = sol.solution("banana","nan");
		System.out.println("0==" + result);
		
		result = sol.solution("banana","wxyz");
		System.out.println("0==" + result);
		
		result = sol.solution("banana","abanana");
		System.out.println("0==" + result);
		
	}

}
