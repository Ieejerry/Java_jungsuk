public class Ex8_8 {
	public static void main(String[] args) {
		throw new RuntimeException();	// RuntimeException을 고의로 발생시킨다.
		// RuntimeException과 그의 자손들은 unchecked예외라서 예외 처리를 하지 않아도 컴파일이 된다.
	}
}