package chap09.ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrList01 {

	public static void main(String[] args) {

		// <> 를 제너릭 이라고 한다.
		// <> 안에 데이터 타입을 넣어서, 해당 클래스 안에서 어떤 데이터를 사용하는지 명시 해 준다.
		// 단, 데이터 타입은 반드시 클래스 형태로 들어가야 한다. int(x) Integer(o)
		ArrayList<String> list = new ArrayList<String>(); // ArrayList 안에는 String 만 들어갈 수 있다고 지정해줌
		
		// 크기 지정이 가능하다.
		// 지정된 크기(10)를 넘어가도 상관 없다.
		ArrayList<String> arr = new ArrayList<String>(3);
		
		// 이런식으로 선언이 됩니다. 왜? 다형성때문
		List<Integer> list2 = new ArrayList<Integer>();
		
		// 데이터 추가
		arr.add("collection"); // 0
		arr.add("thread"); // 1
		arr.add("java IO"); // 2
		arr.add("network"); // 3 <- 배열 같았으면 ArrayIndexOutOfBoundsException 발생
		arr.add(3, "lambda"); // network 가 한칸 밀리고 lambda 가 들어간다.
		System.out.println(arr); // 안에 있는 값을 다 보여준다. (Arrays.toString() 사용 필요 없음)
		
		// 크기는 length 가 아닌 size() 로 확인 한다.
		// 값을 가져올때는 get(index) 를 사용 한다.
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + " : " + arr.get(i));
		}
		
		// 데이터 삭제
		String val = arr.remove(2);
		System.out.println("내가 지운 값 : " + val);
		
		// 향상된 for
		for (String v : arr) {
			System.out.println(v);
		}
		
	}

}

































