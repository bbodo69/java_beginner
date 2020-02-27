package java191122;

class EqClass{
	int x, y;
	public EqClass(int x , int y) {
		this.x = x; this.y = y;
				
	}
}

public class ObjEx02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EqClass a = new EqClass(1, 10);
		EqClass b = new EqClass(1, 10);
		EqClass c = a;
		if(a==b) {
			System.out.println("a==b");
		}
		System.out.println("-----------");
		if(a==c) {
			System.out.println("a==c");
		}
	}

}
