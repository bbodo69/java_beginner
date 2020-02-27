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
		System.out.println("확장자를 제외한 파일 이름 : " + fileName);
		System.out.println("확장자" + ext);
		

	}

}
