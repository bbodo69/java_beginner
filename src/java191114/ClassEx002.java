package java191114;

/*
	main()�޼ҵ带 �����Ͽ����� ���ÿ� ���� ��µǵ��� TvClassŬ������ �ۼ��ϼ���. 
	�ܼ���¿� >> LG���� ���� 2018���� 32��ġ TV
*/

class TvClass{
	String name;
	int year;
	int inch;
	
	TvClass(String name, int year, int inch){
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(name+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
}

public class ClassEx002 {
	
	public static void main(String[] args) {
		
		TvClass myTV = new TvClass("LG", 2018, 32);
		myTV.show();

	}
}
