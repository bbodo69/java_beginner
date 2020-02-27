package java191108;

// 1. 클래스 생성
class Person{
	//변수 (속성)
	String name = "";
	int age = 0;
	//메서드 (지능)
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}		
}

public class Test02 {

	public static void main(String[] args) {
		// 프로그램 실행시 먼저 자동으로 실행(호출)되는 메서드 == 메인메서드
		
		//2. 객체 생성
		Person p1 = new Person(); //제품생산
		//3. 객체 사용
		System.out.println("p1 age = "+ p1.age); 
		System.out.println("p1 name = " + p1.name);
		p1.eat();
		p1.sleep();
		
		p1.name = "호기일동";
		p1.age = 1500;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
	}

}
