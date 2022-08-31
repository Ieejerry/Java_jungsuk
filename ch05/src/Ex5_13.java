import java.util.Arrays;

public class Ex5_13 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};	// 1차원 배열 arr
		int[][] arr2D = {{11, 22}, {21, 22}};	// 2차원 배열 arr2D
		
		System.out.println(Arrays.toString(arr));	// 1차원 배열을 문자열로 출력
		System.out.println(Arrays.deepToString(arr2D));	// 다차원 배열을 문자열로 출력
		
		String[][] str2D = {{"aaa", "bbb"}, {"AAA"}, {"BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"}, {"AAA"}, {"BBB"}};
		
		System.out.println(str2D == str2D2);	// 참조변수 값 비교하기 때문에 문자열 비교에서 사용 x
		System.out.println(Arrays.equals(str2D, str2D2));	// 1차원 문자열 배열 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));	// 다차원 문자열 비열 비교
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);	// 배열의 길이만큼 복사
		int[] arr3 = Arrays.copyOf(arr, 3);	// 배열 3번째까지 복사
		int[] arr4 = Arrays.copyOf(arr, 7);	// 배열 7번째까지 복사 (남는 공간은 0으로 채워짐)
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);	// 배열의 3번째부터 4번째까지 복사
		System.out.println(Arrays.toString(arr5));
		
		int[] arr6 = {3, 4, 1, 0, 2};
		System.out.println(Arrays.toString(arr6));
		Arrays.sort(arr6);	// 배열 오름차순으로 정렬
		System.out.println(Arrays.toString(arr6));
	}

}
