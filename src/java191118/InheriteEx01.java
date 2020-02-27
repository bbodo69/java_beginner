package java191118;

class Super{
	static int a = 100;
	int x = 10;
}
class Sub extends Super{
	int y = 20;
}


public class InheriteEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub s = new Sub();
		System.out.println(s.x);
		System.out.println(s.a);
		
	}

}
