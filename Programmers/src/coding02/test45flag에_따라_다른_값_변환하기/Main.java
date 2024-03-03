package coding02.test45flag에_따라_다른_값_변환하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution(-4, 7	, true);
		System.out.println("3==" + result);

		result = sol.solution(-4, 7, false);
		System.out.println("-11==" + result);
		
	}

}
