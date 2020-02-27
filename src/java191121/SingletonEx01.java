package java191121;
//싱글톤
class SingleT{
	
	//인스턴스 변수
	int a = 100;
	
	private static SingleT instance = new SingleT();
	private SingleT() {}
	public static SingleT getInstance() {
		return instance;
	}
	
	void func() {
		System.out.println("싱글턴");
	}
	
}


public class SingletonEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SingleT s = new SingleT();
		SingleT s1 = SingleT.getInstance(); //객체 생성 된 것을 가져옴.
		s1.func();
		System.out.println(s1.a);
		s1.a = 200;
		System.out.println(s1.a);
		SingleT s2 = SingleT.getInstance();
		System.out.println(s2.a);							//heap 가 하나라서 a에 200이 들어가 있음.
		
	}

}
