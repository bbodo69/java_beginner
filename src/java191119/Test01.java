package java191119;

class Mart{									//適掘什 持失
	int price;	
	double bonus;
	
	Mart(int price){							//持失切 持失
		this.price = price;
		bonus = (int)price*0.01;
	}
	
}

class TvTest extends Mart{
	TvTest(){
		super(100);
		
	}

	
}



public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mart m = new TvTest();
		System.out.println(m.price);

	}

}
	