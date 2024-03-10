package coding03.test130접미사_배열;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;

		result = sol.solution("banana");
		System.out.println(
				"[\"a\", \"ana\", \"anana\", \"banana\", \"na\", \"nana\"]==" + Arrays.toString(result)
		);

		result = sol.solution("programmers");
		System.out.println(
				"[\"ammers\", "
				+ "\"ers\", \"grammers\", \"mers\", "
				+ "\"mmers\", \"ogrammers\", \"programmers\", "
				+ "\"rammers\", \"rogrammers\", \"rs\", \"s\"]==" + Arrays.toString(result)
		);
		
	}

}
