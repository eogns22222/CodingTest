package coding03.test118특별한_이차원_배열2;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;

		int[][] arr1 = { 
			{ 5, 192, 33 }, 
			{ 192, 72, 95 }, 
			{ 33, 95, 999 } 
		};
		result = sol.solution(arr1);
		System.out.println("1==" + result);

		int[][] arr2 = { 
			{19, 498, 258, 587}, 
			{63, 93, 7, 754}, 
			{258, 7, 1000, 723}, 
			{587, 754, 723, 81} 
		};
		result = sol.solution(arr2);
		System.out.println("0==" + result);

	}

}
