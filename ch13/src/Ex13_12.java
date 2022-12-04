public class Ex13_12 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx12();
		new Thread(r).start();	// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start();	// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
	}
}

class Account {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withDraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}	// withDraw
}

class RunnableEx12 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금(withDraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withDraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}	// run()
}