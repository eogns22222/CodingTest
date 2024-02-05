package chap10.ex07;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInput {

	public static void main(String[] args) throws Exception {

		// 읽어올 위치 지정 + 객체 생성 + 주 스트림 준비
		FileInputStream fis = new FileInputStream("C:/img/temp/data.dat");
		
		// 보조스트림 준비(java 고유 데이터 사용)
		DataInputStream dis = new DataInputStream(fis);
		
		// 읽어오기(쓴 순서 그대로 읽어와야 한다.)
		String name = dis.readUTF();
		int salary = dis.readInt();
		boolean promotion = dis.readBoolean();
		System.out.println(name + " / " + salary + " / " + promotion);
		
		// 자원 반납
		dis.close();
		
	}

}
