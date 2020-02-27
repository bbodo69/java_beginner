package java191113;

class Car{
	//변수
	String color = "";
	//클래스
	Car(String color){
		this.color = color;
	}
	//매서드
	String drive() {
		return color+"색 차가 지나갑니다.";
	}
}
public class ClassArrEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car [] cars = new Car[5];
		String [] colors = {"빨간","노란","보라","파란","검은"};
		
//		cars[0] = new Car("빨간");
//		System.out.println(cars[0].color);
//		System.out.println(cars[0].drive());
	
		
		
		for(int i = 0 ; i < cars.length ; i++) {
			cars[i] = new Car(colors[i]);
//			System.out.println(cars[i]);
			System.out.println(cars[i].drive());
		}
	}

}
