package ch09.ex03;

import java.util.Arrays;

public class Solution {

	public int solution(int []A, int []B){
        int answer = 0;
        int[] arr = new int[B.length];
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < B.length; i++) {
        	arr[i] = B[B.length - i - 1];
			answer += A[i] * arr[i];
		}
       
        return answer;
    }
	
}
