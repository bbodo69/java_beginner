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
			//num == �Ķ���� num == �������� == plus �޼��尡 ����Ǹ� �Ҹ�
		}
	
	static void biggerPizza(Circle pizza) {
		pizza.radius += 10;
	}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�⺻Ÿ��
		int num = 10;
//		num = plus(num);
		plus(num);
		System.out.println(num);
		
		//��üŸ��
		Circle pizza = new Circle();
		
		biggerPizza(pizza);
		System.out.println(pizza.radius);
		
	}

}
