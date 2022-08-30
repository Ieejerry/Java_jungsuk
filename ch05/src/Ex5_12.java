
public class Ex5_12 {

	public static void main(String[] args) {
		//			  01234
		String str = "ABCDE";
		
		char ch = str.charAt(2);	// charAt()은 문자열에서 원하는 인덱스의 문자를 반환한다.
		System.out.println(ch);
		
		String str2 = str.substring(1, 4);	// subString()은 문자열에서 원하는 인덱스부터 원하는 인덱스 전까지의 문자열을 반환한다.
		String str3 = str.substring(1);	// 1~4
		String str4 = str.substring(1, str.length());	// length()는 문자열의 길이를 반환한다.
		System.out.println(str2);	// BCD
		System.out.println(str3);	// BCDE
		System.out.println(str4);	// BCDE
	}

}
