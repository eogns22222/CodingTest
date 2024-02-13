package chap12.ex06;

import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		try {
			// 소켓 생성
			Socket socket = new Socket("192.168.70.103", 7777);
			System.out.println("접속 성공");
			
			// 보내기
			SenderThread sender = new SenderThread(socket);
			sender.start();
			
			// 받기
			ReceiveThread receiver = new ReceiveThread(socket);
			receiver.start();
		
			
		} catch (IOException e) {
			// 예외가 발생하면 접속 실패
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		
		
	}

}






























