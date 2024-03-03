package coding02.test64문자열_곱하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("string", 3);
		System.out.println("stringstringstring==" + result);
		
		result = sol.solution("love", 10);
		System.out.println("lovelovelovelovelovelovelovelovelovelove==" + result);
		
	}

}
