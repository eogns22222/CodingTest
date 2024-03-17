package coding04.test138외계어_사전;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;

		String[] arr1 = {"p", "o", "s"};
		String[] arr2 = {"sod", "eocd", "qixm", "adio", "soo"};
		result = sol.solution(arr1, arr2);
		System.out.println("2==" + result);

		String[] arr3 = {"z", "d", "x"};
		String[] arr4 = {"def", "dww", "dzx", "loveaw"};
		result = sol.solution(arr3, arr4);
		System.out.println("1==" + result);

		String[] arr5 = {"s", "o", "m", "d"};
		String[] arr6 = {"moos", "dzx", "smm", "sunmmo", "som"};
		result = sol.solution(arr5, arr6);
		System.out.println("2==" + result);
		
	}

}
