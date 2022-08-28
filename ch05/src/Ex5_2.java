import java.util.Arrays;	// ctrl + shift + o 자동으로 import문 추가

public class Ex5_2 {

	public static void main(String[] args) {
		int[] iArr = {100, 90, 80, 70, 60};	// 길이 5인 int 배열
		System.out.println(iArr);
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
	}

}
