package java191108;

class Car{

	int number;
	String name;
	
	static void run() {
		System.out.println("���� ����մϴ�.");
	}
	
	static void stop() {
		System.out.println("���� ����ϴ�.");
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
		car1.name = "�ҳ�Ÿ";
		
		car2.number = 2222;
		car2.name = "k5";
		
		System.out.println("�� ��ȣ = " + car1.number 
				+ "\n" + "�� �� = "+car1.name);
		car1.run();
		car1.stop();
		
		
		
		
	}

}
