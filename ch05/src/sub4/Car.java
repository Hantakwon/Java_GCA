package sub4;

// 클래스 설계(정의)
public class Car {

	// 속성 (멤버 변수, 필드) - 무조건 private으로 선언, 상속관계에서 부모 클래스이면 protected로 선언
	private String name;
	private String color;
	protected int speed; // 상속관계에서 자식클래스에서 참조 가능하게 접근 권한을 protected로 변경 

	// 전체 차량 수를 지정하는 클래스 변수
	public static int count; // 클래스 변수(정적 변수) 일반적으로 public
	
	// 생성자(Constructor) - 속성을 초기화하는 반환타입이 없는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	// Getter/Setter - 은닉된 속성을 안전하게 처리하기 위한 메서드
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// 기능 (멤버 메서드) - 무조건 public으로 선언
	public void speedUp(int speed) {
		this.speed += speed;
	}

	public void speedDown(int speed) {
		this.speed -= speed;
	}

	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("현재속도 : " + speed);		
	}
}
