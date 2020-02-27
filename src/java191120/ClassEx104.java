package java191120;
//���, ������
/*
	Point1�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint1 Ŭ������ �ۼ��ϼ���. 
	main()�޼ҵ� ���� �ڵ���� �����ϰ� �Ʒ��� ���� ������ ��µǰ� ���弼��. 
	������:
		BLACK���� (0,0)�� ���Դϴ�. 
		RED���� (5,5)�� ���Դϴ�.
*/
class Point1 {
	private int x, y;
	public Point1(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint1 extends Point1{
	String color;
	
	void setColor(String color) {
		this.color = color;
	}
	public ColorPoint1(int x, int y) {
		super(x, y);
	}
	
	ColorPoint1() {
		super(0,0);
		color = "BLACK";
	}
	public String toString() {												//Object �� �⺻ �޼ҵ� toString() �� �������ذ�.
		return color+"���� ("+getX()+","+getY()+")�� ��";
	}
	void setXY(int x, int y) {
		super.move(x, y);
	}
	
}

public class ClassEx104 {
	public static void main(String[] args) {

		ColorPoint1 zeroPoint = new ColorPoint1();	// (0,0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoint1 cp = new ColorPoint1(10,10);	// (10,10) ��ġ�� BLACK �� ��
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
		
		
	}
}
