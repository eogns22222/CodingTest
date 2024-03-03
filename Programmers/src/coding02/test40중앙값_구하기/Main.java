package coding02.test40중앙값_구하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr = {1, 2, 7, 10, 11};
		result = sol.solution(arr);
		System.out.println("7==" + result);
		
		int[] arr2 = {9, -1, 0};
		result = sol.solution(arr2);
		System.out.println("0==" + result);

	}

}
