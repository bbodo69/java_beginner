package java191125;
// ������ ������ �����ִ� Ŭ����

class StringCount{
	private int count;					//����
	private String source = "";		//������ �ҽ�
	
	public StringCount(String source) {
		this.source = source;
	}
	public int stringCount(String s) {
		return stringCount(s);
	}
	public int StringCount(String s, int pos) {
		int index = 0;
		if(s==null || s.length()==0) return 0;
		if((index = source.indexOf(s, pos)) !=-1) {		
			count++;
			stringCount(s); //���ȣ��
		}
		return count;
	}
}

public class StringEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaaaabbbbbbccAAAABBBBCCCCC";
				System.out.println(str);
		StringCount sc = new StringCount(str);
		System.out.println("aa�� " + sc.stringCount("aa"));

	}

}
