package chap10.ex10Test;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropOutput {

	public static void main(String[] args) throws Exception {

		// properties 생성
		Properties pro = new Properties();
		pro.put("name", "강대훈");
		pro.put("age", "31");
		pro.put("job", "student");
		
		// 위치지정 + 주스트림
		FileOutputStream fos = new FileOutputStream("src/chap10/ex10Test/profile.properties");
		
		// 저장
		pro.store(fos, "properties test");
		
		// 자원 반납
		fos.close();
		
	}

}
