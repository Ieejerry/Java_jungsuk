import java.util.*;

public class Ex12_3_2 {
	public static void main(String[] args) {
		Box b = new Box<String>();
		b.add(new Integer(100)); 
		
		Box<String> bStr = null;
		
		b = (Box)bStr;	// Box<String> -> Box 가능 but 경고
		bStr = (Box<String>)b;	// Box -> Box<String> 가능 but 경고
	}
}