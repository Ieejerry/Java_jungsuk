
public class Ex6_14 {

	public static void main(String[] args) {
		Car2 c = new Car2();
		System.out.println("색상 = " + c.color + ", 변속기 종류 = " + c.gearType + ", 문의 개수 = " + c.door);
		
		Car2 c2 = new Car2("red");
		System.out.println("색상 = " + c2.color + ", 변속기 종류 = " + c2.gearType + ", 문의 개수 = " + c2.door);
		
		Car2 c3 = new Car2("black", "maunal", 2);
		System.out.println("색상 = " + c3.color + ", 변속기 종류 = " + c3.gearType + ", 문의 개수 = " + c3.door);
	}

}

class Car2 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	
	Car2() {
		this("white", "auto", 4);
	}
	
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}