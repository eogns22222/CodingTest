package coding02.test72문자열의_앞의_n글자;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		result = sol.solution("ProgrammerS123", 11);
		System.out.println("ProgrammerS==" + result);

		result = sol.solution("He110W0r1d", 5);
		System.out.println("He110==" + result);
		
	}

}
