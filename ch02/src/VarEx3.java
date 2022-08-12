
public class VarEx3 {

	public static void main(String[] args) {
		boolean power = true;	// boolean 데이터 타입에는 true 또는 false만 할당할 수 있다.
//		boolean power = 1;	// boolean  데이터 타입에 정수형인 1을 할당하려고 하니 에러가 발생
		
		byte b = 127;
//		byte b = 128; // byte 데이터 타입은 -128~127까지의 값을 수용하기 때문에 127보다 큰 128을 할당하니 에러가 발생
		
		int oct = 010;	// 앞에 0이 붙어있기 때문에 8진수, 10진수로는 8
		int hex = 0x10;	// 앞에 0x가 붙어있기 때문에 16진수, 10진수로는 16
		
		long l = 1_000_000_000;	// 뒤에 리터럴은 접미사가 붙지 않았기 때문에 int형이다. 하지만 long형이 int형보다 크기 때문에 수용이 가능하다.
//		long l = 10_000_000_000;	// int형은 최대 약 20억까지만 수용이 가능하기 때문에 20억을 넘는 100억을 접미사 없이 사용하니 에러가 발생한다.
		long l2 = 10_000_000_000L;	// 100억 리터럴 뒤에 long형을 뜻하는 L 접미사를 붙여주니 에러가 발생하지 않는다.

		float f = 3.14f;	// 변수의 데이터 타입이 float형일 때, 리터럴 뒤에 접미사 f를 사용하지 않을 경우 에러가 발생한다. (접미사 f를 사용하지 않으면 자바는 double형으로 인식을 하는데, 변수 타입은 double형보다 작은 float형이 때문에 에러가 발생한다.)
		double d = 3.14;	// double형은 뒤에 접미사 d를 붙여도 되고, 생략해도 된다. double형은 float형보다 크기 때문에 float형 리터럴이 들어와도 수용이 가능하다.
		double d2 = 3.14f;	// double형은 float형보다 크기 때문에 float형 리터럴이 들어와도 수용이 가능하다.
		
		System.out.println(10.);	// 10.0, 소수점 뒤에 0을 넣지 않아도 자바는 double형으로 인식하여 10.0을 출력
		System.out.println(.10);	// 0.1, 소수점 앞에 0을 넣지 않아도 자바는 double형으로 인식하고, 뒤에 0은 생략한 0.1을 출력
		System.out.println(10f);	// 자바에서 접미사는 출력하지 않기 때문에 float형의 10.0을 출력
		System.out.println(1e3);	// e는 10의 n제곱을 뜻하기 때문에 1 * 10^3을 한 double형의 1000.0을 출력
	}

}
