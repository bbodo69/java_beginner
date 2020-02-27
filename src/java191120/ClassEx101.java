package java191120;
//��ӹ���
/*
	#1. 
	�Ʒ� main()�޼ҵ� #1���� �Ʒ� �������� �����Ͽ� 
	TVClass�� ��ӹ��� ColorTVŬ������ �ۼ��ϼ���. 
	������ : 32��ġ 1024�÷�
	
	#2. �� 1�� ������ Ǭ��, main()�޼ҵ� #2���� 
	�Ʒ� �������� �����Ͽ� ColorTV�� ��ӹ޴� IPTVŬ������ �ۼ��ϼ���.
	������ : ���� IPTV�� 192.1.1.2 �ּ��� 32��ġ 2048�÷�
*/
class TVClass {
	private int size;
	public TVClass(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TVClass{

	int inch;
//	public ColorTV(int size) {
//		super(size);
//	}
	public ColorTV(int size, int inch) {
		super(size);
		this.inch = inch;
	}
	void printProperty() {
		System.out.println(getSize()+"��ġ "+inch+"�÷�");
	}
}

class IPTV extends ColorTV{
	String IP;
	public IPTV(String IP, int size, int inch) {
		super(size, inch);
		this.IP=IP;
	}
	void printProperty() {
		System.out.println("���� IPTV�� "+IP+" �ּ��� "+getSize()+"��ġ "+inch+"�÷�");
	}
}

public class ClassEx101 {
	public static void main(String[] args) {

		//#1. 
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();		
		//#2. 
		IPTV iptv = new IPTV("192.1.1.2 ", 32, 2048);
		iptv.printProperty();
		
		
	}
}
