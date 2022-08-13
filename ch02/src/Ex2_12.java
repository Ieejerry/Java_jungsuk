
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');	// 3, 문자열 "3"에서 문자 '3'으로 변환 후, 문자 '0'을 빼서 정수 3으로 변환
		System.out.println('3' - '0' + 1);	// 4, 문자 '3'에서 정수 3으로 변환 후, 정수 1 더하기
		System.out.println(Integer.parseInt("3") + 1);	// 4, 문자열 "3"에서 정수 3으로 변환 후 정수 1 더하기
		System.out.println("3" + 1);	// "31", 문자열 "3"에 정수 1를 더하면 앞에 3이 문자열이기 때문에 +는 결합 연산자로 인식되어 뒤에 정수 1을 문자열 "1"로 변환하고, 문자열 "3"과 "1"을 결합시킴
		System.out.println(3 + '0');	// 51, 앞에 정수 3이 정수형이 때문에 뒤에 문자 '0'은 정수로 48이기 때문에 정수 3 더하기 정수 48이 된다.
	}

}
