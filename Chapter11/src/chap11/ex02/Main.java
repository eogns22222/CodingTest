package chap11.ex02;

public class Main {

	public static void main(String[] args) {
		
		// 쓰레드 객체화
		Thread th = new Job(); // 상속과 다형성 활용
		// 쓰레드 실행
		th.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main Thread...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
