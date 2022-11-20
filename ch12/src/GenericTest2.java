import java.util.*;

class Tv {}

class Audio {}

public class GenericTest2 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();	// Tv타입의 객체만 저장가능
		ArrayList<Tv> list = new ArrayList<Tv>();	// Tv타입의 객체만 저장가능
		list.add(new Tv());
//		list.add(new Audio());
		
//		Tv t = (Tv)list.get(0);	// list의 첫번째 요소를 꺼낸다.
		Tv t = list.get(0);	// 제네릭스 사용 시 반환타입이 타입변수의 타입으로 되기 때문에 형변환 불필요
	}
}