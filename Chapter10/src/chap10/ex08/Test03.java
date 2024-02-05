package chap10.ex08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test03 {

	public static void main(String[] args) throws Exception {

		// copy 하기
		
		// 위치지정 + 객체생성 + 주스트림생성
		FileInputStream fis = new FileInputStream("C:/img/low.jpg");
		FileOutputStream fos = new FileOutputStream("C:/img/temp/low_copy.jpg");
		
		// 보조스트림
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 읽어오기 -> 쓰기
		int data;
		
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		System.out.println("종료합니다.");
		
		
		// 자원 반납
		bis.close();
		bos.flush();
		bos.close();
		
	}

}
