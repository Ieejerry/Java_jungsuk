class Data_1 {
	int value;
	
	Data_1() {}	// 기본 생성자를 추가, 클래스에 생성자가 하나도 없을 때만 컴파일러가 기본 생성자 자동 생성
}

class Data_2 {
	int value;
	
	Data_2() {}	// 기본 생성자를 추가, 클래스에 생성자가 하나라도 있을 경우에는 컴파일러가 기본 생성자를 자동 생성하지 않음
	Data_2(int x) {	// 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();	// complie error 발생
	}

}
