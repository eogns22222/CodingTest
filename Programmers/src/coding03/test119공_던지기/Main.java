package coding03.test119공_던지기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;

		int[] arr1 = {1, 2, 3, 4};
		result = sol.solution(arr1, 2);
		System.out.println("3==" + result);

		int[] arr2 = {1, 2, 3, 4, 5, 6};
		result = sol.solution(arr2, 5);
		System.out.println("3==" + result);

		int[] arr3 = {1, 2, 3};
		result = sol.solution(arr3, 3);
		System.out.println("2==" + result);

	}

}
