import java.util.*;

public class Ex11_5 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		Collection c = new HashSet();	// Set은 Collection의 자손
		Collection c = new TreeSet();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// iterator는 1회용이라 다 쓰고나면 다시 얻어와야 한다.
		it = c.iterator();	// 새로운 iterator객체를 얻는다.
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		for(int i = 0; i < c.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
	}	// main
}