package java191125;
// 문자의 개수를 세어주는 클래스

class StringCount{
	private int count;					//개수
	private String source = "";		//문자의 소스
	
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
			stringCount(s); //재귀호출
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
		System.out.println("aa는 " + sc.stringCount("aa"));

	}

}
