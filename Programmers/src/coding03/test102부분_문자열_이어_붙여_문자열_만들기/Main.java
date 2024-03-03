package coding03.test102부분_문자열_이어_붙여_문자열_만들기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		String[] arr1 = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] arr2 = {
			{0, 4}, {1, 2}, {3, 5}, {7, 7}
		};
		result = sol.solution(arr1, arr2);
		System.out.println("programmers==" + result);
		
	}

}
