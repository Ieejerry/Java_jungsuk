import java.util.*;
import java.util.stream.*;

public class Ex14_0 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = list.stream();	// list를 stream으로 변환
		intStream.forEach(System.out::print);	// forEach() 최종연산
		
		// stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
		intStream = list.stream();	// list로부터 stream을 생성
		intStream.forEach(System.out::print);
		
		System.out.println();
		
//		Stream<String> strStream = Stream.of("a", "b", "c");
//		Stream<String> strStream = Stream.of(new String[] {"a", "b", "c", "d"});
		String[] strArr = {"a", "b", "c", "d"};
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::println);
//		System.out.println("count = " + intStream2.count());	// 최종연산
//		System.out.println("sum = " + intStream2.sum());
		System.out.println("average = " + intStream2.average());
		
//		Integer[] intArr = {1, 2, 3, 4, 5};
//		Stream<Integer> intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::println);
//		System.out.println("count = " + intStream2.count());
		
//		IntStream intStream3 = new Random().ints(5, 10);	// 무한스트림
//		intStream3.limit(10).forEach(System.out::println);	// 10개만 자르기
		IntStream intStream3 = new Random().ints(10, 5, 10);	// 유한스트림
		intStream3.forEach(System.out::println);
		
		// iterate(T seed, UnaryOperator f) 단항 연산자 
		Stream<Integer> intStream4 = Stream.iterate(1, n -> n + 2);
		intStream4.limit(10).forEach(System.out::println);
		
		// generate(Supplier s) : 주기만 하는 것. 입력 X, 출력 O
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream.limit(10).forEach(System.out::println);
	}
}
