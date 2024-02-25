package coding02.test03크기가_작은_부분문자열;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("3141592", "271");
		System.out.println("2==" + result);
		
		result = sol.solution("500220839878", "7");
		System.out.println("8==" + result);
		
		result = sol.solution("10203", "15");
		System.out.println("3==" + result);
		
		
	}

}
