package java191113;

class Car{
	//����
	String color = "";
	//Ŭ����
	Car(String color){
		this.color = color;
	}
	//�ż���
	String drive() {
		return color+"�� ���� �������ϴ�.";
	}
}
public class ClassArrEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car [] cars = new Car[5];
		String [] colors = {"����","���","����","�Ķ�","����"};
		
//		cars[0] = new Car("����");
//		System.out.println(cars[0].color);
//		System.out.println(cars[0].drive());
	
		
		
		for(int i = 0 ; i < cars.length ; i++) {
			cars[i] = new Car(colors[i]);
//			System.out.println(cars[i]);
			System.out.println(cars[i].drive());
		}
	}

}
