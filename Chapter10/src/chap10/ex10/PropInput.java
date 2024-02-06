package chap10.ex10;

import java.io.FileInputStream;
import java.util.Properties;

public class PropInput {

	public static void main(String[] args) throws Exception {

		// 스트림 준비
		FileInputStream fis = new FileInputStream("src/chap10/ex10/profile.properties");
		
		// Properties 불러오기
		Properties prop = new Properties();
		prop.load(fis); // 스트림으로 읽어온 값이 Properties 에 저장
		
		// 읽기 // map 에서 값을 읽어오는 것처럼 읽어오면 됨
		for (Object key : prop.keySet()) {
			System.out.println(key + " : " + prop.get(key));
		}
		
		// 자원 반납
		fis.close();
		
	}

}
