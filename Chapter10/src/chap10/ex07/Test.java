package chap10.ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {

		// scanner 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String inputStr = scan.nextLine();
		
		System.out.println("급여를 입력하세요.");
		int inputInt = scan.nextInt();
		
		System.out.println("승진여부를 입력하세요.");
		boolean inputBool = scan.nextBoolean();
		
		// 위치 저장 + 객체 생성 + 주스트림
		FileOutputStream fos = new FileOutputStream("C:/img/temp/input_sample.dat");
		FileInputStream fis = new FileInputStream("C:/img/temp/input_sample.dat");
		
		// 보조스트림
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
		
		// 입력받은 값 넣기
		dos.writeUTF(inputStr);
		dos.writeInt(inputInt);
		dos.writeBoolean(inputBool);
		
		String str = dis.readUTF();
		int inti = dis.readInt();
		boolean bool = dis.readBoolean();
		System.out.println(str + " / " + inti + " / " + bool);

		// 자원 반납
		scan.close();
		dos.flush();
		dos.close();
		
	}

}
