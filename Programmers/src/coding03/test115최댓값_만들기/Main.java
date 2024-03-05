package coding03.test115최댓값_만들기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {1, 2, -3, 4, -5};
		result = sol.solution(arr1);
		System.out.println("15==" + result);

		int[] arr2 = {0, -31, 24, 10, 1, 9};
		result = sol.solution(arr2);
		System.out.println("240==" + result);
		
		int[] arr3 = {10, 20, 30, 5, 5, 20, 5};
		result = sol.solution(arr3);
		System.out.println("600==" + result);
		
	}

}
