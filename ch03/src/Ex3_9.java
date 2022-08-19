
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;	// 1,000,000 1백만 = 10의 6제곱
		int b = 2_000_000;	// 2,000,000 2백만 = 2 * 10의 6제곱
		
		// 2 * 10의 12제곱	int의 범위는 10의 9제곱
		long c = a * b;		// a * b = 2,000,000,000,000 ?
//		a * b는 int * int이고, 결과는 int형으로 반환되기 때문에 long형의 변수 c에 할당되기 전에 오버플로우가 발생하여 오버플로우 된 값이 할당된다.
		long c2 = (long)a * b;	// a를 long형으로 형변환 후 long형 변수 c2에 할당
//		변수 a가 long형으로 형변환 되면서 산술 변환으로 변수 b도 long형으로 자동 형변환이 된다 그래서 결과도 long형으로 반환이 되어 오버플로우가 발생하지 않는다.
		long c3 = a * (long)b;	// 두 변수 중 아무거나 형변환 해주면 된다. 산술 변환으로 인해 다 형변환이 되기 때문에
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
	}

}
