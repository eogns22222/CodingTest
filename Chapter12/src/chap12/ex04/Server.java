package chap12.ex04;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		// 1. 서버소켓 생성
		ServerSocket server = null;
		// 2. 요청 대기
		try {
			server = new ServerSocket(7777);
			while(true) {
				System.out.println("접속 대기중...");
				// 3. 접속 요청이 있으면 수락
				Socket socket = server.accept();
				// 4. 할일...
				// 읽기
				InputStream is = socket.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				String msg = ois.readUTF();
				System.out.println("Client> " + msg);
				// 쓰기
				OutputStream os = socket.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeUTF("니가 보낸 메시지 : " + msg);
				// 다 썼으면 자원 반납
				oos.flush();
				ois.close();
				oos.close();
				socket.close();
				
			}
			
		} catch (IOException e) {
			try {
				
				server.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
	}

}













