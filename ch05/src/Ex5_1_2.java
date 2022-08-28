
public class Ex5_1_2 {

	public static void main(String[] args) {
//		// index범위 : 0 ~ 9
//		int[] arr = new int[9];	// 길이가 5인 int 배열 arr을 생성
//		System.out.println("arr.length = " + arr.length);
		
//		for (int i = 0; i < 10; i++) {	// index 범위를 벗어나서 에러
//			System.out.println("arr[" + i +"] = " + arr[i]);
//		}

		int[] arr = new int[5];
		System.out.println("arr.length = " + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i +"] = " + arr[i]);
		}
	}

}
