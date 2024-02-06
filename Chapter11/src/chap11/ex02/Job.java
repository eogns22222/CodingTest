package chap11.ex02;

public class Job extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("work Thread...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
