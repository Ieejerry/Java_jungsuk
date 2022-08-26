
public class Ex4_11 {

	public static void main(String[] args) {
		
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//			System.out.println();
//		}
		
		// i = 1, 2, 3, 4, 5 5번 {}안의 내용을 반복
		for (int i = 1; i <= 5; i++) {
//			System.out.println("**********");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	// main의 끝

}
