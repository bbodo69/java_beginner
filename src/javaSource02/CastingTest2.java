class Car {
	String color;
	int door;

	void drive() { 		// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {		// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {		// ���� �Ѹ��� ���
		System.out.println("water!!!");
	}
}
class CastingTest2 {
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
  
		car.drive();
		fe = (FireEngine)car2;	
		fe.drive();
		car2 = (Car)fe;
		car2.drive();


	}
}