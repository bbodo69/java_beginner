package java191119;

class Product{			//price, bP, ������
	int price;				//��ǰ�� ����
	int bonusPoint;		//��ǰ ���Ž� �����ϴ� ����Ʈ
	// ��ǰ���� �����ְ� ������, ��ǰ���� ����
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);	//����Ʈ�� ��ǰ������ 10%
	}
}

class Tv extends Product{	//price = 100 , bP = 10
	Tv(){
		//�θ�Ŭ������ ������ ȣ��
		//�ڽ�Ŭ������ new Tv() ���� �Ұ����ϴ� �ڽ� ������ ���������.
		super(100);		//Tv ������ 100�������� �Ѵ�.
	}
	@Override
		public String toString() { // ������ Object Ŭ������ ���� toString(), Tv�� �������̵���
			// TODO Auto-generated method stub
			//return super.toString();
			return "Tv";
		}
}

class Computer extends Product {//price, bP
	Computer(){
		super(200);
				
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Computer";
		}
}

class Buyer{ // money, bP, buy()
	int money = 1000;		//���� ��
	int bonusPoint = 0;		//���� ����Ʈ ����
	void buy(Product p) { //Product p = computer;
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;				//�޼��� ���� ���� �Ʒ� �ڵ� ���� �Ұ�
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+ " ��/�� �����Ͽ����ϴ�.");
	}
}

public class PolyEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		Product p = new Product();
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer computer = new Computer();
		
		Product p = tv;
		
		
		b.buy(tv);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
		b.buy(computer);
		
		Product tv2 = new Tv(200);
		
		
		
	}

}
