public class Ex13_8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
				
		delay(2 * 1000);
		System.out.print("<<main 종료>>");
	}	// main
	
	static void delay(long millis) {
		try {
//			th1.sleep(2000);
			Thread.sleep(millis);	// sleep()은 static메소드라서 클래스 자기 자신에게만 적용된다.
		} catch (InterruptedException e) {}
	}
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	}	// run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	}	// run()
}