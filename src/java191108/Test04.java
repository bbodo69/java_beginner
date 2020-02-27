package java191108;

class Car{

	int number;
	String name;
	
	static void run() {
		System.out.println("차가 출발합니다.");
	}
	
	static void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
}


public class Test04{	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = new Car();
		
		car1.number = 1111;
		car1.name = "소나타";
		
		car2.number = 2222;
		car2.name = "k5";
		
		System.out.println("차 번호 = " + car1.number 
				+ "\n" + "차 종 = "+car1.name);
		car1.run();
		car1.stop();
		
		
		
		
	}

}
