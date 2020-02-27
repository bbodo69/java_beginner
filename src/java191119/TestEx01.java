package java191119;

class Fruit{
	int price;
	
	Fruit(int price){
		this.price = price;
	}
	
}

class Apple extends Fruit{
	Apple(){
		super(100);
	}
}

class Banana extends Fruit{
	Banana(){
		super(200);
	}
}

class Buyer{
	int money = 10000;
	void buy(Fruit b) {
		
	}
}



public class TestEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Fruit a = new Apple();
			Fruit f = new Apple();
		
	}

}
