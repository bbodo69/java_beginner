package java191113;

class Book2{
	String title;
	String author;
	
	Book2(){
		this("unknown title","unknown");    //������ �� �ҽ��ڵ尡 ���� ��� 
														//�ߺ��Ǵ� ���� ����, �ڵ尡 �ٿ���
		System.out.println("������1 ȣ��");;
	}
	
	Book2(String title){
		//this.title = title;
		this(title, "unknown"); // �ٷ� �ؿ� �ִ� �����ڸ� ȣ��, this �� ������ ù�ٿ�
		System.out.println("������2");;
	}
	
	Book2(String title, String author){
		this.title = title;
		this.author = author;
		System.out.println("������3");
	}
	
	void test() {
		//this(); �����ڿ����� ����� �� ����.
	}
}



public class ThisEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book2 b = new Book2("old man");
		Book2 b2 = new Book2("Harry Poter","�η�");
		
		Book2 b3 = new Book2();
		
	}

}
