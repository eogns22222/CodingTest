package coding02.test78배열_비교하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		result = sol.solution(arr1, arr2);
		System.out.println("-1==" + result);

		int[] arr3 = {100, 17, 84, 1};
		int[] arr4 = {55, 12, 65, 36};
		result = sol.solution(arr3, arr4);
		System.out.println("1==" + result);

		int[] arr5 = {1, 2, 3, 4, 5};
		int[] arr6 = {3, 3, 3, 3, 3};
		result = sol.solution(arr5, arr6);
		System.out.println("0==" + result);

	}

}
