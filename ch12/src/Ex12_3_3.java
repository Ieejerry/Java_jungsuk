import java.util.*;

public class Ex12_3_3 {
	public static void main(String[] args) {
		FruitBox<? extends Fruit> fBox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();
		// FruitBox<Apple> -> FruitBox<? extends Fruit> 가능
		FruitBox<? extends Fruit> aBox = new FruitBox<Apple>();
		
		// FruitBox<? extends Fruit> -> Fruit<Apple> 가능
		FruitBox<Apple> appleBox = (FruitBox<Apple>)aBox;	// OK. 경고발생
	}
}