
public class Ex4_16 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		while (sum <= 100) {
//			++i;
//			sum += i;
//		}
		
		// while문에서 조건식은 생략불가
		while (true) {	// 무한 반복문 for(;;) {}
			if (sum > 100) {
				break;
			}
			++i;
			sum += i;
		}	// end of while
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
