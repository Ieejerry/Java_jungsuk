import java.util.*;	// 1. import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		// 2. Scanner 클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();	// nextInt() 메소드를 통해 입력 받은 첫번째 정수를 num 변수에 할당
		int num2 = scanner.nextInt();	// nextInt() 메소드를 통해 입력 받은 두번째 정수를 num2 변수에 할당
		System.out.println(num);	// 변수 num을 출력
		System.out.println(num2);	// 변수 num2을 출력
		
		// 밑에 두 코드는 위의 int num = scanner.nextInt()와 같은 역할을 함
		String input = scanner.nextLine();	// nextLine() 메소드를 통해 입력 받은 문자를 input 변수에 할당
		int num3 = Integer.parseInt(input);	// input 변수에 할당된 문자를 int형으로 변환하고, 변수 num3에 할당
		
		System.out.println(num3);	// 변수 num3을 출력
	}

}
