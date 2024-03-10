package coding03.test122문자열_내_마음대로_정렬하기;

import java.util.ArrayList;
import java.util.Collections;

//class Solution {
//    public String[] solution(String[] strings, int n) {
//        String[] answer = new String[strings.length];
//        
//        Arrays.sort(strings);
//        System.out.println(Arrays.toString(strings));
//        
//        for (int i = 0; i < strings.length; i++) {
//        	
//			for (int j = i; j < strings.length; j++) {
//				
//				if(strings[i].charAt(n) > strings[j].charAt(n)) {
//					String temp = "";
//					temp = strings[i];
//					strings[i] = strings[j];
//					strings[j] = temp;
//				}
//			}
//		}
//        System.out.println(Arrays.toString(strings));
//        
//        answer = strings;
//        
//        
//        return answer;
//    }
//}

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<String>();
       
        for (int i = 0; i < strings.length; i++) {
			list.add(strings[i].charAt(n) + strings[i]); 
			// 사전적 정렬을 포함하여 비교 하기 위해 문자를 미리 앞에 붙인다.
		}
        
        Collections.sort(list); // 사전적 정렬
        
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).substring(1);
			// 뽑아온 문자열에 1번째 부터 저장
		}
        
        return answer;
    }
}






















