package java191113;

class Circle1{
	
	Circle1(){
	
	}
	
	int radius;
	
	Circle1(int r){
		radius = r;
	}
	
	//Circle(){} <= ���� �Ⱥ��̴� �����ڰ� �����ǰ� ��������.
	
	void set(int r) {
		radius = r;
	}
	
	double getArea() {
		return radius * radius * 3.14;
	}
}

public class Const05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle1 pizza = new Circle1();				//�⺻ �����ڰ� ���� ������
															//������ ���ڸ� �־��־����
		pizza.set(15);
		System.out.println(pizza.getArea());
		
		
	}

}
