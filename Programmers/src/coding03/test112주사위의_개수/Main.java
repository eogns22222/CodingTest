package coding03.test112주사위의_개수;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {1, 1, 1};
		result = sol.solution(arr1, 1);
		System.out.println("1==" + result);

		int[] arr2 = {10, 8, 6};
		result = sol.solution(arr2, 3);
		System.out.println("12==" + result);
		
	}

}
