package java191119;

class ShapeClass{
	public ShapeClass  next;					//������ ����� ��ü�� �ּҸ� ����
	public ShapeClass() { next = null;}	// null�� ó��.(���� ��� �Ǵ� ������
	public void draw() {						
		System.out.println("Shape");
	}
}
class LineClass extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class RectClass extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class CircleClass extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}


public class PolyEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeClass start, last, obj;			//��ü ����
		// start : ��ũ�帮��Ʈ ���� ��ü �ּ� ���
		// last : �������� ����� ��ü �ּ� ���
		// obj : ���ο� ��ü ���鶧 ���
		
		start = new LineClass();
		last = start;				//ó������ start�Ӱ� ���ÿ� last ��ü�̹Ƿ�
		
		obj = new RectClass();
		last.next = obj;
		last = obj;
		obj = new LineClass();
		last.next = obj;
		last = obj;
		
		//��� ���� ���
		ShapeClass s = start;		//start�� �ּҰ� ȸ���� ��������
		//������ ShapeClass Ÿ�� ������ ����� �ݺ������� ���
		while(s!=null) {
			s.draw();
			s=s.next;
		}
	}

}
