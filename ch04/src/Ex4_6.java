import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();	// 화면을 통해 입력받은 숫자를 month에 저장
		
		switch (month) {
		case 3:	// case문은 한 줄에 하나씩 써도 된다.
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;	// break문을 만나야 switch문이 종료된다. break문이 없으면 switch문 끝까지 실행
		case 6: case 7: case 8:	// case문은 한 줄에 여러 개를 써도 된다.
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;		
		default:
//		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
		}	// default는 거의 switch문 끝에 쓰기 때문에 break문을 잘 쓰지 않는다. default문은 생략 가능
	}	// main의 끝

}
