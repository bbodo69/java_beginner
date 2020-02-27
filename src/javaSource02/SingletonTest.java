final class Singleton {
	int x = 10;
	private static Singleton s = new Singleton(); // 클래스 참조
	private Singleton() {}	// 생성자 
	public static Singleton getInstance() {  // 클래스 메서드 
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}	
}

class SingletonTest {
	public static void main(String args[]) {
//		Singleton s = new Singleton();	// 에러! Singleton() has private access in Singleton	
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.x = 200;
		System.out.println(s1.x);
		System.out.println(s2.x);
	}
}









