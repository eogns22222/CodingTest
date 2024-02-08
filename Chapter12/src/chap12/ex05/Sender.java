package chap12.ex05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Sender {

	public static void main(String[] args) throws Exception {

		// 서버 연결
		Socket socket = new Socket("192.168.70.103", 7777);
		
		// 내 PC 에서 파일 불러오기
		File file = new File("C:/img/high.jpg"); // 파일객체
		String fileName = file.getName(); // 파일 이름
		long size = file.length(); // 크기(byte)
		
		FileInputStream fis = new FileInputStream("C:/img/high.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 소켓을 이용하여 스트림 추출
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeUTF(fileName); // 파일명 전송
		byte[] arr = new byte[(int) size]; // byte 배열의 크기는 정수값으로 지정되어야 합니다.
		int data = bis.read(arr); // 배열 데이터가 담기고, 한번에 담긴게 얼마만큼의 크기에 담겼는지 반환
		System.out.println("한번에 읽은 크기 : " + data);
		
		oos.write(arr); // 바이트 전송
		System.out.println("전송 완료 : 크기(" + (size/1024) + "KB)");
		
//		int data;
//		while((data = bis.read()) != -1) {
//			// 내 PC 에서 읽어온 내용 내보내기
//			bos.write(data);
//			
//		}
		
		// 자원반납
		oos.flush();
		bis.close();
		oos.close();
		socket.close();
	}

}
