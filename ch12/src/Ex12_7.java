class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	@Override
	@Deprecated
	@SuppressWarnings("deprecation")
	void parentMethod() {}	// 조상 메소드의 이름을 잘못 적었음.
}

@FunctionalInterface	// 함수형 인터페이스는 하나의 추상메소드만 가능
interface Testable {
	void test();	// 추상메소드
//	void check();	// 추상메소드
}

class Ex12_7 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();	// deprecated된 메소드 사용
	}
}