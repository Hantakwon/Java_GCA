package sub6;

/*
 * 날짜 : 2025/07/15
 * 이름 : 한탁원
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 * 	- 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 형태로 변하는 특징
 *  - 객체 생성할 때 타입선언을 부모클래스 타입으로 선언(업캐스팅)
 *  - 다형성을 통해서 프로그래밍의 중복코드 줄이고 유연성 향상
 */
public class PolyTest {
	
	public static void main(String[] args) {
		
		// 다형성 - 자식 객체의 타입 선언을 부모 타입으로 선언
		Animal tiger = new Tiger(); // 업캐스팅
		Animal shark = new Shark(); // 업캐스팅
		Animal eagle = new Eagle();
		
		tiger.move();
		tiger.hunt();
		
		shark.move();
		shark.hunt();
		
		eagle.move();
		eagle.hunt();
		
		// 다운 캐스팅 - 부모타입의 객체를 자식타입으로 캐스팅(Casting, 형변환)
		Tiger t = (Tiger) tiger;
		Shark s = (Shark) shark;
		Eagle e = (Eagle) eagle;
		
		t.move();
		t.hunt();
		
		s.move();
		s.hunt();
		
		e.move();
		e.hunt();
		
		// 다형성을 활용한 객체 배열;
		Animal arr[] = {t, e, s};
		
		arr[0].move();
	}
	
}
