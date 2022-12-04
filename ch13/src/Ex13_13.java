public class Ex13_13 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx13();
		new Thread(r).start();	// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start();	// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
	}
}

class Account2 {
	private int balance = 1000;
	
	public synchronized int getBalance() {
		return balance;
	}
	
	public synchronized void withDraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}	// withDraw
}

class RunnableEx13 implements Runnable {
	Account2 acc = new Account2();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금(withDraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withDraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}	// run()
}