package java191125;

public class StringEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Hello.java";
		
		int idx = fullName.indexOf('.');
		String fileName = fullName.substring(0, idx);
		String ext = fullName.substring(idx);
		System.out.println(idx);
		
		fullName.substring(idx+1);
		System.out.println("Ȯ���ڸ� ������ ���� �̸� : " + fileName);
		System.out.println("Ȯ����" + ext);
		

	}

}
