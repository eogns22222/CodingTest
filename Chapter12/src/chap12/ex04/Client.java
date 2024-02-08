package chap12.ex04;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		try {
			// 소켓 생성 -> 서버 연결 요청
			socket = new Socket("192.168.70.103", 7777);
			System.out.println("접속 성공");
			System.out.println("메시지 전송>");
			String msg = scan.nextLine();
			
			// 주스트림
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			// 쓰기
			System.out.println(msg);
			oos.writeUTF(msg);
			oos.flush();
			// 읽기
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			msg = ois.readUTF();
			System.out.println(msg);
			// 자원 반납
			ois.close();
			oos.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 예외가 발생하면 접속 실패
		// 소켓 종료
		
	}

}















