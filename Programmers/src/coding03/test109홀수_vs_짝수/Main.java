package coding03.test109홀수_vs_짝수;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {4, 2, 6, 1, 7, 6};
		result = sol.solution(arr1);
		System.out.println("17==" + result);

		int[] arr2 = {-1, 2, 5, 6, 3};
		result = sol.solution(arr2);
		System.out.println("8==" + result);
		
	}

}
