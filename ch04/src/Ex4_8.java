
public class Ex4_8 {

	public static void main(String[] args) {
//		for (int i = 1; i <= 3; i++) {	// 괄호{} 안의 문장을 3번 반복, i = 1, 2, 3
//		for (int i = 1; i <= 5; i++) {	// 괄호{} 안의 문장을 5번 반복, i = 1, 2, 3, 4, 5
//		for (int i = 11; i <= 15; i++) {	// 괄호{} 안의 문장을 5번 반복, i = , 11, 12, 13, 14, 15
//		for (int i = 1; i <= 10; i = i + 2) {	// 괄호{} 안의 문장을 5번 반복 (2씩 증가), i = 1, 3, 5, 7, 9
//		for (int i = 1; i <= 10; i = i * 2) {	// 괄호{} 안의 문장을 5번 반복 (2배씩 증가), i = 1, 2, 4, 8
//		for (int i = 1; i <= 10; i = i++) {	// 괄호{} 안의 문장을 10번 반복, i = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//		for (int i = 10; i >= 1; i--) {	// 괄호{} 안의 문장을 10번 반복 1씩 감소, i = 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
//		for (int i = 1, j = 10; i <= 10; i++, j--) {	// 괄호{} 안의 문장을 10번 반복, 변수가 같은 타입이면 여러 개의 변수를 사용할 수 있다. 
//		for (int i = 1; i <= 10; i++) {	// for문의 i는 제어문 안의 변수라서 for문 밖에서는 사용할 수 없다.
		int i;	// scope(범위) - 선언된 위치부터 선언된 블럭 끝까지 유효하다
		
		// 조건식을 생략하면, true로 간주되어서 무한반복문이 됨
		for (i = 1; i <= 10; i++) {	// i를 for문 밖에서 선언하면, for문 안과 밖에 둘 다 사용할 수 있다.
//			System.out.println("Hello");
//			System.out.println(i);
//			System.out.println("i = " + i + " , j = " + j);
			System.out.println("i = " + i);
		}
		System.out.println(i);
	}

}
