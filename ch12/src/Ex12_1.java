import java.util.*;

class Product {}
class Tv2 extends Product {}
class Audio2 extends Product {}

public class Ex12_1 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv2> tvList = new ArrayList<Tv2>();
//		ArrayList<Product> tvList = new ArrayList<Tv2>();	// 에러.
//		List<Tv2> tvList = new ArrayList<Tv2>();	// OK. 다형성
		
		productList.add(new Tv2());	// public boolean add(Product e) {
		productList.add(new Audio2());
		
		tvList.add(new Tv2());	// public boolean add(Tv e) {
		tvList.add(new Tv2());
//		tvList.add(new Audio2());	// Tv 혹은 Tv의 자손클래스만 들어올 수 있다.
		
		printAll(productList);
//		printAll(tvList);	// 컴파일 에러가 발생한다.
	}
	
	private static void printAll(ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}
}