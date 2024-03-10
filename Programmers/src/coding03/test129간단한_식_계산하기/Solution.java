package coding03.test129간단한_식_계산하기;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        int num = Integer.parseInt(str[0].trim());
        String calc = str[1].trim();
        int num2 = Integer.parseInt(str[2].trim());
        
        if(calc.equals("+")) {
        	answer = num + num2;
        }else if(calc.equals("-")) {
        	answer = num - num2;
        }else if(calc.equals("*")) {
        	answer = num * num2;
        }
        
        return answer;
    }
}