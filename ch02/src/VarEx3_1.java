
public class VarEx3_1 {

	public static void main(String[] args) {
		char ch = 'A';	// A, char형의 ch 변수에 문자 'A'를 할당
		int i = 'A';	// 65, int형의 i 변수에 문자 'A'를 할당 int형이기 때문에 문자 'A'의 문자코드가 할당된다.
		
		// char형은 ''(작음 따옴표)를 사용해야하며, 문자를 감싸는 ''안에는 반드시 하나의 문자만 들어와야한다.
//		char ch1 = 'AB';	// 하나 이상의 문자가 들어오면 에러가 발생
//		char ch2 = '';	// 문자가 하나라도 안 들어와도 에러 발생
		
		// String형은 ""(큰 따옴표)를 사용해야 한다.
		String str = "";	// 빈 문자열(empty string), 문자열인 String에는 ""안에 아무것도 넣지 않아도 에러가 발생하지 않는다.
		String str2 = "ABCD";	// 여러개의 문자열을 넣어도 에러가 발생하지 않는다.
		String str3 = "123";
		String str4 = str2 + str3;	// 문자열에서 +는 산술연산에 더하기가 아니라 문자열끼리 결합시키는 결합 연산자로 사용된다.
		
		System.out.println(ch);
		System.out.println(i);
		System.out.println(str4);
		System.out.println("" + 7 + 7);	// 77, 앞에 빈 문자열 + 숫자를 하면 뒤에 숫자를 문자열로 변환하여 결합시켜준다.
		System.out.println(7 + 7 + "");	// 14, 빈 문자열이 뒤에 있기 때문에 앞에 7 + 7을 산술연산하여 14로 만든 다음에 빈 문자열과 결합하여 문자열 "14"가 된다.
	}

}
