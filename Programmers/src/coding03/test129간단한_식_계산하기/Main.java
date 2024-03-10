package coding03.test129간단한_식_계산하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;

		result = sol.solution("43 + 12");
		System.out.println("55==" + result);

		result = sol.solution("0 - 7777");
		System.out.println("-7777==" + result);
		
		result = sol.solution("40000 * 40000");
		System.out.println("1600000000==" + result);
		
	}

}
