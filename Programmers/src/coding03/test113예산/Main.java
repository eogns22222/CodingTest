package coding03.test113예산;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {1,3,2,5,4};
		result = sol.solution(arr1, 9);
		System.out.println("3==" + result);

		int[] arr2 = {2,2,3,3};
		result = sol.solution(arr2, 10);
		System.out.println("4==" + result);
		
	}

}
