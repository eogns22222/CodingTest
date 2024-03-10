package coding03.test120최소직사각형;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;

		int[][] arr1 = {
			{60, 50}, 
			{30, 70}, 
			{60, 30}, 
			{80, 40}
		};
		result = sol.solution(arr1);
		System.out.println("4000==" + result);

		int[][] arr2 = {
			{10, 7}, 
			{12, 3}, 
			{8, 15}, 
			{14, 7}, 
			{5, 15}
		};
		result = sol.solution(arr2);
		System.out.println("120==" + result);
		
		int[][] arr3 = {
			{14, 4}, 
			{19, 6}, 
			{6, 16}, 
			{18, 7}, 
			{7, 11}
		};
		result = sol.solution(arr3);
		System.out.println("133==" + result);

	}

}
