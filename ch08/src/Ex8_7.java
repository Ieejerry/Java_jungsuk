public class Ex8_7 {
	public static void main(String[] args) {
		try {
			throw new Exception();	// Exception을 고의로 발생시킨다.
			// Exception과 그의 자손들은 checked 예외라서 예외 처리가 필수이다.			
		} catch (Exception e) {}
	}
}