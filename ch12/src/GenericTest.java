import java.util.*;

public class GenericTest {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList list = new ArrayList();	// JDK1.5이전. 제네릭스 도입이전
		ArrayList<Object> list = new ArrayList<Object>();	// JDK1.5이후. 모든 타입을 허용.
		list.add(10);	// list.add(new Integer(10));
		list.add(20);
		list.add("30");	// String을 추가
//		list.add(30);	// 타입 체크 강화됨. 제네릭스 덕분에
		
//		Integer i = (Integer)list.get(2);	// 컴파일 OK
//		Integer i = list.get(2);	// 제네릭스를 통해 타입을 알기 때문에 형변환 생략가능
		String i = (String)list.get(2);	// 형변환 필요
		
		System.out.println(list);
	}
}