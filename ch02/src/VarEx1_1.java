
public class VarEx1_1 {

	public static void main(String[] args) {
		// 두 변수 바꾸기
		
		int x = 10, y = 20;	// int형 변수 x, y를 선언하고 각각 10과 20으로 초기화

		int tmp;	// in형 변수 tmp 선언
		
		tmp = x;	// 변수 tmp에 변수 x의 값 10을 할당, tmp = 10
		x = y;	// 변수 x에 변수 y의 값 20을 할당, x = 20
		y = tmp;	// 변수 y에 변수 tmp의 값 10을 할당, y = 10
		
		System.out.println("x = " + x);	// 여기서 +는 산술연산의 더하기가 아니라 문자끼리 결합시켜주는 결합 연산자이다.
		System.out.println("y = " + y);
	}

}
