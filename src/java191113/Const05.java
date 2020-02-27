package java191113;

class Circle1{
	
	Circle1(){
	
	}
	
	int radius;
	
	Circle1(int r){
		radius = r;
	}
	
	//Circle(){} <= 눈에 안보이는 생성자가 생성되고 실행했음.
	
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

		Circle1 pizza = new Circle1();				//기본 생상자가 없기 때문에
															//무조건 인자를 넣어주어야함
		pizza.set(15);
		System.out.println(pizza.getArea());
		
		
	}

}
