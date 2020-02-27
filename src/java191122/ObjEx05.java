package java191122;
//int Ÿ����  width(����)�� height(����) �ʵ带 ������ Rect Ŭ������ �ۼ��ϰ�, 
//������ ������ �� Rect ��ü�� ���� ������ �Ǻ��ϴ� equals()�� �ۼ��϶�.
//�����ڿ��� ���ο� ���̸� �޾� width, height �ʵ带 �ʱ�ȭ �϶�.

class Rect{

	Rect(){
		
	}
	int width;
	int height;
	
	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) { // Object obj = new Rect(5,4)
		boolean result = false;
		if(obj instanceof Rect) {                  
			Rect r = (Rect)obj;
			if( r.width*r.height == width*height) result = true;
		}
		return result;
	}
	
	public boolean a(Rect r1) {
		boolean result1 = false;
		if(r1.width*r1.height == width*height) result1 = true;
		return result1;
	}
	
}
public class ObjEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rect a = new Rect(4,5);
		Rect b = new Rect(5,4);
		Rect c = new Rect(3,4);
		if(a.equals(b)) System.out.println("a is equals to b");
		if(a.equals(c)) System.out.println("a is equals to c");
		if(a.equals(c)) System.out.println("b is equals to c");
		
		if(a.a(b)) System.out.println("a is equals to b");
		if(a.a(c)) System.out.println("a is equals to c");
		if(a.a(c)) System.out.println("b is equals to c");
		
	}

}
