package chap10.ex10Test;

import java.io.FileInputStream;
import java.util.Properties;

public class PropInput {

	public static void main(String[] args) throws Exception {

		// 위치지정 + 주스트림 + 보조스트림
		FileInputStream fis = new FileInputStream("src/chap10/ex10Test/profile.properties");
		// 읽기
		Properties pro = new Properties();
		pro.load(fis);
		
		for (Object key : pro.keySet()) {
			System.out.println(key + " : " + pro.get(key));
		}
		
		// 자원 반납
		fis.close();
		
	}

}
