package coding02.test34최대값_만들기;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int tmp = 0;
        
        for (int i = 0; i < numbers.length; i++) {
        	for (int j = i + 1; j < numbers.length; j++) {
				
        		if(numbers[i] < numbers[j]) {
        			tmp = numbers[i];
        			numbers[i] = numbers[j];
        			numbers[j] = tmp;
        		}
        		
			}
		}
        
        answer = numbers[0] * numbers[1];
        
        return answer;
    }
}