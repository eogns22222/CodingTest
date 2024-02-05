package chap10.ex06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferMain {

	// 이미지 복사하기
	public static void main(String[] args) throws Exception {

		// 1. 위치지정 + 객체 생성 + 빨대 준비
		FileInputStream fis = new FileInputStream("C:/img/low.jpg");
		FileOutputStream fos = new FileOutputStream("C:/img/temp/low_copy.jpg");
		
		// 보조 스트림 준비
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 2. 읽어오기 -> 쓰기
		int data;
		long start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		System.out.println("저장완료");
		long end = System.currentTimeMillis();
		System.out.println("걸린시간 : " + (end - start) + "ms");
		
		
		// 3. 자원 반납
		bis.close();
		bos.flush();
		bos.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
