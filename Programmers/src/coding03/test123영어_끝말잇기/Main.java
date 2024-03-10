package coding03.test123영어_끝말잇기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		String[] arr1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		result = sol.solution(3, arr1);
		System.out.println("[3,3]==" + Arrays.toString(result));

		String[] arr2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		result = sol.solution(5, arr2);
		System.out.println("[0,0]==" + Arrays.toString(result));
		
		String[] arr3 = {"hello", "one", "even", "never", "now", "world", "draw"};
		result = sol.solution(2, arr3);
		System.out.println("[1,3]==" + Arrays.toString(result));
		
	}

}
