package chap09.ex04;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableMain {

	public static void main(String[] args) {

		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("김철수", 99);
		map.put("박동빈", 80);
		map.put("박은빈", 75);
		map.put("신솔비", 43);
		map.put("한은정", 52);
		map.put("김민지", 100);
		map.put("김윤경", 80);
		map.put("정철수", 99);
		map.put("안은호", 87);
		map.put("최영일", 75);
		
		// containsKey(key) : 특정 키가 존재하는지
		// get(key) : 해당 키에 대한 값을 가져와라
		boolean contain = map.containsKey("박은빈");
		System.out.println("박은빈이 있나? " + contain);
		
		// containsValue(value) : 특정한 값이 존재하는지
		contain = map.containsValue(99);
		System.out.println("99점 학생이 있는지? " + contain);
		
		// get 을 이용하면 키로써 값을 찾을 수 있지만
		// 값으로써 키를 찾는 방법은 없다. (예 : 99 점 학생은 누구누구 인가?)
		// 99점 학생은 누구누구 인가?
		// 1번 방법
		for (String key : map.keySet()) {
			int val = map.get(key);
			if(val == 99) {
				System.out.println(val + "점인 학생 : " + key);
			}
		}
		
		// 2번 방법
		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			if(val == 99) {
				System.out.println(val + "점인 학생 : " + key);
			}
		}
		
		// 3번 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet(); // 엔트리 형태로 Set을 만든다.
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator(); // 자르기 좋게 Iterator 화 시킨다.
		
		while(iterator.hasNext()) { // 있나?
			Entry<String, Integer> entry = iterator.next(); // 엔트리를 뽑아냄
			int value = entry.getValue();
			if(value == 99) {
				// 값으로 키를 가져온다.
				System.out.println(entry.getKey()); // 엔트리에서 키와 값으로 분리
				
			}
		}
		
		
	}

}

















