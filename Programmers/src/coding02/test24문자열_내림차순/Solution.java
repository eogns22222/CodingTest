package coding02.test24문자열_내림차순;

import java.util.Arrays;

//문자열 내림차순으로 배치하기
class Solution {
	public String solution(String s) {
		String answer = "";

		String[] str = new String[s.length()];

		str = s.split("");

		Arrays.sort(str);

		StringBuffer buffer = new StringBuffer();

		for (String n : str) {
			buffer.append(n);
		}

		answer = buffer.reverse().toString();

		return answer;
	}
}