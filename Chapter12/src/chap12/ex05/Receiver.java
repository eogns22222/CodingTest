package chap12.ex05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {

	public static void main(String[] args) throws Exception {

		// 서버소켓 생성
		ServerSocket server = new ServerSocket(7777);
		
		while(true) { 
			// 접속 대기
			System.out.println("접속 대기중...");  
			Socket socket = server.accept(); 
			// 서버에 accept 를 사용해 소켓 클래스 소켓에 접속 요청을 수락해줍니다.
			
			// 클라이언트에서 보내온 스트림 수신 
			InputStream is = socket.getInputStream(); // 소켓으로부터 도착하는 스트림를 가져옵니다.
			BufferedInputStream bis = new BufferedInputStream(is); 
			ObjectInputStream ois = new ObjectInputStream(bis); // 객체를 직접 입출력할 수 있도록 도와줍니다.
			// 자바의 고유데이터를 불러오는것을 도와주는 역할
			
			// 가져온 파일이름 값을 넣어준다.
			String fileName = ois.readUTF();
			
			// 내 PC 의 특정 경로로 저장
			FileOutputStream fos = new FileOutputStream("C:/img/temp/" + fileName); 
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			
			System.out.println("파일 저장 시작");
			int data;
			while((data = ois.read()) != -1) {
				bos.write(data);
			}
			System.out.println("파일 저장 완료");
			
			// 자원 반납
			bos.flush();
			ois.close();
			bos.close();
			socket.close();
		}
		
	}

}
