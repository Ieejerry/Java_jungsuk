abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다."); }
}

interface Fightable {	// 인터페이스의 모든 메소드는 public abstract. 예외없이
	void move(int x, int y);	// public abstract가 생략됨
	void attack(Fightable f);	// public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable {
	// 오버라이딩 규칙: 조상(public)보다 접근제어자 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	// 싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter f = new Fighter();	// Fighter를 생성해서 반환
		return f;
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Unit2 u = new Fighter();
		Fightable f2 = new Fighter();
		
		Fightable f3 = f.getFightable();
		f.move(100, 200);
		f.attack(f3);
		f.stop();
		
		u.move(100, 200);
//		u.attack(f3);	// Unit2에는 attack()이 없어서 호출불가
		u.stop();
		
		f2.move(100, 200);
		f2.attack(f3);
//		f2.stop();	// Fightable에는 stop()이 없어서 호출불가
	}
}