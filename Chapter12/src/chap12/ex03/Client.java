package chap12.ex03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		try {
			// 소켓 생성 -> 서버한테 접속 요청
			socket = new Socket("192.168.70.103", 7777);
			System.out.println("접속 성공");
			// 3. 할 일
			String msg = "ㅎㅎㅎ";
			
			// 주스트림
			OutputStream os = socket.getOutputStream();
			// 보조스트림
			ObjectOutputStream oos = new ObjectOutputStream(os);
			// 쓰기
			System.out.println("전송 내용 : " + msg);
			oos.writeUTF("니가 보낸 메시지 : " + msg);
			oos.flush();
			// 읽기
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			msg = ois.readUTF();
			System.out.println(msg);
			// 자원 반납
			ois.close();
			oos.close();
			
			
		} catch (IOException e) { // 예외가 발생하면 접속실패
			System.out.println("접속 실패");
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 자원 반납
		
		
	}

}
