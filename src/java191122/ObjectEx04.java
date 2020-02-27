package java191122;

class Point{
	
	Point(){
		
	}
	
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	//Object Ŭ������ equals()�� ��ǥ�� x, y�� ��������
	//���ϴ� �޼���� �������̵� �ϰڴ�.
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Point) { // ���� obj�� ����Ű�� ��ü�� Point Ÿ������ ��Ȯ��
			Point p = (Point)obj;
			if(x == p.x && y == p.y) result = true;
		}
		return result;
	}
	
	
	public boolean a(Point p1) {
		boolean result1 = false;
			p1 = new Point();
			
			if(x ==p1.x && y == p1.y) { result1 = true;
			}
			return result1;	
	}
	
}

public class ObjectEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a = new Point(2, 5);
		Point b = new Point(2, 5);
		Point c = new Point(3, 10);
		
		if(a.equals(b)) System.out.println("a is equals to b");
		if(a.equals(c)) System.out.println("a is equals to c");
		if(a.equals(c)) System.out.println("b is equals to c");
		
		if(a.a(b)) System.out.println("a is equals to b");
		if(a.a(c)) System.out.println("a is equals to c");
		if(a.a(c)) System.out.println("b is equals to c");
			

	}

}
