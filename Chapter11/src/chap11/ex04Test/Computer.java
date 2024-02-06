package chap11.ex04Test;

public class Computer {

	private int score;
	
	public synchronized void setScore(int score) {
		this.score = score;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + score);
	}
	
}
