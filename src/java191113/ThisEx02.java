package java191113;

class Circle2{
	int radius;
	
	Circle2(int radius){
		this.radius = radius;
	}
	
	void setRadius(int radius) {
		this.radius =radius;
		
	}
	
}

public class ThisEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle2 c1 = new Circle2(100);
		
		System.out.println(c1.radius);

		c1.setRadius(200);
		System.out.println(c1.radius);
		
	}

}
