package coding02.test33배열의_유사도;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		String[] arr1 = {"a", "b", "c"};
		String[] arr2 = {"com", "b", "d", "p", "c"};
		result = sol.solution(arr1, arr2);
		System.out.println("2==" + result);
		
		String[] arr3 = {"n", "omg"};
		String[] arr4 = {"m", "dot"};
		result = sol.solution(arr3, arr4);
		System.out.println("0==" + result);
		
		
	}

}
