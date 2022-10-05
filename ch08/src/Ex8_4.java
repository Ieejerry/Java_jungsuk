public class Ex8_4 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
//			System.out.println(0 / 0);
			System.out.println(args[0]);	// ArrayIndexOutOfBoundsException
			System.out.println(4);	// 실행되지 않는다.
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {	// 모든 예외의 최고조상인 Exception
			System.out.println("Exception");
		}	// try-catch의 끝
		System.out.println(6);
	}	// main의 끝
}