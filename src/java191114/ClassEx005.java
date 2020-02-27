package java191114;

/*
���簢���� ǥ���ϴ� Rectangle Ŭ������ �ۼ��ϼ���. 
- int Ÿ���� x, y, width, heigth �ʵ� : �簢���� �����ϴ� ���� ũ�� ����
- x, y, width, height ���� �Ű������� �޾� �ʵ带 �ʱ�ȭ�ϴ� ������
- int squareArea() : �簢�� ���� �������ִ� �޼���
- void show() : �簢���� ��ǥ�� ���� ���
- boolean contains(Rectangle r) : �Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����
- �ܼ���°��:
	(2,2)���� ũ�Ⱑ 8x7�� �簢��
	b�� ������ 36
	c�� a�� �����մϴ�.
*/
class Rectangle{
	
	int x;
	int y;
	int width;
	int heigth;
	
	Rectangle(int x, int y, int width, int heigth){
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
	}
	
	int squareArea() {
		return width*heigth;
	}
	
	void show() {
		System.out.println("("+x+","+y+") ���� ũ�Ⱑ "+width+"x"+heigth+"�� �簢��");
	}
	int square() {
		return this.width * this.heigth;
	}
	
	boolean contains(Rectangle r) {
		if(this.x < r.x && this.y < r.y && this.width+this.x > r.width+r.x 
									&& this.heigth+this.y > r.heigth+r.y) {
			return true;
		}else return false;
		
		
	}
}

public class ClassEx005 {
	public static void main(String[] args) {

		
		Rectangle a = new Rectangle(2, 2, 8, 7); 
		Rectangle b = new Rectangle(5, 5, 6, 6); 
		Rectangle c = new Rectangle(1, 1, 10, 10); 
		
		a.show();
		System.out.println("b�� ������ "+ b.square());
		if(c.contains(a)) System.out.println("c�� a�� �����մϴ�.");
		if(c.contains(b)) System.out.println("c�� b�� �����մϴ�.");
		
		
	}
}
