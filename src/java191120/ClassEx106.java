package java191120;
//���, ������
/*
	Point3�� ��ӹ޾� ����� ���������� ���� ��Ÿ���� PositivePoint Ŭ������ �ۼ��ϼ���. 
	main()�޼ҵ� ���� �ڵ���� �����ϰ� �Ʒ��� ���� ������ ��µǰ� ���弼��. 
	������:
		(10,10)�� ���Դϴ�.
		(10,10)�� ���Դϴ�.
		(0,0)�� ���Դϴ�.
*/
class Point3 {
	private int x, y;
	Point3(){}
	public Point3(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class PositivePoint extends Point3{
	
	PositivePoint(int x, int y) {
		
		move((getX()+x), (getY()+y));
	}
	
	
	public PositivePoint() {
		super(0,0);
		
	}
	protected void move(int x, int y) {				//�˻� ���༭ - �� ���� ���ϰ�.
		if(x>=0 && y>=0) {
		super.move(x, y);
		}else {
			return;
		}
	}

			
	
	
	//public PositivePoint(int x, int y) {
//	}
	
	public String toString(){
		return "("+getX()+","+getY()+")�� ��";
	}
}

public class ClassEx106 {
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, 5);		// ��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}
}
