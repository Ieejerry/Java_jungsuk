
public class VarEx2 {

	public static void main(String[] args) {
//		int score = 100; // 변수 score에 리터럴 100을 할당
//		final int score = 100;	// 변수 score를 상수로 선언 및 리터럴 100으로 할당
//		score = 200;	// 변수 score의 값을 리터럴 200으로 변경
		// score가 상수가 되었기 때문에 score의 값은 더 이상 바꿀 수가 없기 때문에 에러가 발생
		
//		final int score;	// 상수 score 선언
//		score = 100; // score에 리터럴 100 할당 (초기화)
		
		final int score = 100;	// 선언과 동시에 초기화를 하는 것이 좋다.
		
		System.out.println(score);
	}

}
