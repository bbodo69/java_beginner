package java1120;
//�߻�Ŭ���� (��ȭ)
/*
	�ؽ�Ʈ�� ������ϴ� ������ �׷��� ������ �����. 
	�Ʒ� �߻�Ŭ���� ShapeAbst�� ��ӹ��� Line, Rect, Circle Ŭ������ �����, 
	���� ����ó�� "����", "����", "��κ���", "����"�� 4���� �׷��� ���� 
	����� ���� Ŭ���� GraphicEditor�� �ۼ��ϼ���.
	���࿹�� : 
		�׷��� �����͸� �����մϴ�. ���ϴ� ����� ��ȣ�� �����ּ���.
		1.����  2.����  3.��κ���  4.���� >>  1 (����� �Է�)
		1.Line  2.Rect  3.Circle >>  2
		1.����  2.����  3.��κ���  4.���� >>  1
		1.Line  2.Rect  3.Circle >>  3
		1.����  2.����  3.��κ���  4.���� >>  3
		Rect
		Circle
		1.����  2.����  3.��κ���  4.���� >>  2
		������ ������ ��ġ >> 3
		������ �� �����ϴ�.
		1.����  2.����  3.��κ���  4.���� >>  4
		�����͸� �����մϴ�.
*/
abstract class ShapeAbst {
	private ShapeAbst next;
	public ShapeAbst() { next = null; }
	public void setNext(ShapeAbst obj) { next = obj; }	// ��ũ ����
	public ShapeAbst getNext() { return next; }
	abstract public void draw();						// �߻�޼��� : �����̸� ����ϴ� ����� ���� �ִ�.
}

public class ClassEx110 {
	public static void main(String[] args) {

	}
}
