package java191119;

class Product{			//price, bP, 생성자
	int price;				//제품의 가격
	int bonusPoint;		//제품 구매시 제공하는 포인트
	// 제품가격 던져주고 생성시, 제품가격 저장
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);	//포인트는 제품가격의 10%
	}
}

class Tv extends Product{	//price = 100 , bP = 10
	Tv(){
		//부모클래스의 생성자 호출
		//자식클래스로 new Tv() 생성 불가능하니 자식 생성자 만들어주자.
		super(100);		//Tv 가격을 100만원으로 한다.
	}
	@Override
		public String toString() { // 조상인 Object 클래스가 만든 toString(), Tv가 오버라이딩함
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
	int money = 1000;		//고객의 돈
	int bonusPoint = 0;		//고객의 포인트 점수
	void buy(Product p) { //Product p = computer;
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;				//메서드 강제 종료 아래 코드 실행 불가
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+ " 을/를 구입하였습니다.");
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
