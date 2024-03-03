package coding03.test100문자열_바꿔서_찾기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		result = sol.solution("ABBAA", "AABB");
		System.out.println("1==" + result);

		result = sol.solution("ABAB", "ABAB");
		System.out.println("0==" + result);
		
	}

}
