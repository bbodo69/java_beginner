package java191119;

class Mart{									//Ŭ���� ����
	int price;	
	double bonus;
	
	Mart(int price){							//������ ����
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
	