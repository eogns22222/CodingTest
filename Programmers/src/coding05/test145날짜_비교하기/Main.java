package coding05.test145날짜_비교하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;

		int[] arr1 = {2021, 12, 28};
		int[] arr2 = {2021, 12, 29};
		result = sol.solution(arr1, arr2);
		System.out.println("1==" + result);
		
		int[] arr3 = {1024, 10, 24};
		int[] arr4 = {1024, 10, 24};
		result = sol.solution(arr3, arr4);
		System.out.println("0==" + result);
		
	}

}
