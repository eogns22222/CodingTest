package chap12.ex06;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		try {
			// 서버 생성
			ServerSocket server = new ServerSocket(7777);
			// 요청 대기
			System.out.println("접속 대기중...");

			// 접속 수락
			Socket socket = server.accept();
			System.out.println("접속 수락");

			// 보내기
			SenderThread sender = new SenderThread(socket);
			sender.start();

			// 받기
			ReceiveThread receiver = new ReceiveThread(socket);
			receiver.start();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
