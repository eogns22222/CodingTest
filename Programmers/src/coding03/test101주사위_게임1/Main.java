package coding03.test101주사위_게임1;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution(3, 5);
		System.out.println("34==" + result);

		result = sol.solution(6, 1);
		System.out.println("14==" + result);
		
		result = sol.solution(2, 4);
		System.out.println("2==" + result);
		
	}

}
