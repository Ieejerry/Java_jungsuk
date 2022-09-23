class A {
//	public void method(B b) {	// B클래스의 객체만을 인자로 받는다.
	public void method(I i) {	// 인터페이스 I를 구현한 객체들을 인자로 받는다.
		i.method();
	}
}

// B클래스와 선언과 구현을 분리
interface I {
	void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메소드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메소드");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B());	// A가 B를 사용(의존)
		a.method(new C());	// A가 C를 사용(의존)
	}
}