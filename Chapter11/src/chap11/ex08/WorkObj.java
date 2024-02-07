package chap11.ex08;

public class WorkObj {

	// notify(), notifyAll(), wait() 을 사용할 떼는 synchronized 안에서 해야 한다.
	public synchronized void work() {
		System.out.println(Thread.currentThread().getName() + " 가 실행 됨");
		// 다른 누구를 깨우고
		notify();
		// 스스로 잔다.
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
