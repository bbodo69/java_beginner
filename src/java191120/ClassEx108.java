package java191120;
//�߻� Ŭ���� (��ȭ)
/*
	Ű�� ���� �ϳ��� ���������� �����ϰ� �˻� ������ ������ 
	PairMap �߻� Ŭ������ �ֽ��ϴ�.
	PairMap�� ��ӹ޴� DictionaryŬ������ �����ϰ�, 
	main()�޼��� ����� �Ʒ��� ���� ����� �������� �ϼ���.
	������ : 
		�������� ���� ������
		��Ƹ��� ���� �ڹ�
		��Ƹ��� ���� null
*/

abstract class PairMap {
	protected String [] keyArray;		// key���� �����ϴ� �迭
	protected String [] valueArray;		// value���� �����ϴ� �迭
	abstract String get(String key);	// key���� ���� value����. ������ null����
	abstract void put(String key, String value);	// key�� value�� ������ ����, ������ key�� ������, ���� value�� ����
	abstract String delete(String key);	// key���� ���� ������(value�� �Բ�) ����. ������ value�� ����
	abstract int length();				// ���� ����� �������� ���� ����
}
public class ClassEx108 {
	public static void main(String[] args) {

		//Dictionary dic = new Dictionary(10);
		//dic.put("������", "�ڹ�");
		//dic.put("������", "jsp");
		//dic.put("�迵��", "�ȵ���̵�");
		//dic.put("�迵��", "������");							// �迵���� ���� �����ͷ� ����
		//System.out.println("�迵���� ���� "+dic.get("�迵��"));
		//System.out.println("�������� ���� "+dic.get("������"));
		//dic.delete("������");										// ������ ������ ����
		//System.out.println("�������� ���� "+dic.get("������"));	// ������ ������ ����

	}
}
