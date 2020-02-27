package java191113;

class Book2{
	String title;
	String author;
	
	Book2(){
		this("unknown title","unknown");    //생성자 안 소스코드가 같은 경우 
														//중복되는 것을 방지, 코드가 줄여듬
		System.out.println("생성자1 호출");;
	}
	
	Book2(String title){
		//this.title = title;
		this(title, "unknown"); // 바로 밑에 있는 생성자를 호출, this 는 무조건 첫줄에
		System.out.println("생성자2");;
	}
	
	Book2(String title, String author){
		this.title = title;
		this.author = author;
		System.out.println("생성자3");
	}
	
	void test() {
		//this(); 생성자에서만 사용할 수 있음.
	}
}



public class ThisEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book2 b = new Book2("old man");
		Book2 b2 = new Book2("Harry Poter","로렝");
		
		Book2 b3 = new Book2();
		
	}

}
