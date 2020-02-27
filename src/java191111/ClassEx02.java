package java191111;

class Circle{
	int radius = 30;
	
}

public class ClassEx02 {
	
	static void plus (int num) {
//	while(true){
	
	
		
//		for(int i = 0 ; i < 10 ; i ++) {
		 
			num +=1;
			//return num;
			//num == 파라미터 num == 지역변수 == plus 메서드가 종료되면 소멸
		}
	
	static void biggerPizza(Circle pizza) {
		pizza.radius += 10;
	}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//기본타입
		int num = 10;
//		num = plus(num);
		plus(num);
		System.out.println(num);
		
		//객체타입
		Circle pizza = new Circle();
		
		biggerPizza(pizza);
		System.out.println(pizza.radius);
		
	}

}
