package java191114;

/*
�뷡 �Ѱ��� ��Ÿ���� Song Ŭ������ �ۼ��ϼ���. Song�� ���� �ʵ�� �����˴ϴ�. 
	- �뷡�� ������ ��Ÿ���� title
	- ������ ��Ÿ���� artist
	- �뷡�� ��ǥ�� ������ ��Ÿ���� year
	- ������ ��Ÿ���� country
����, SongŬ������ ���� �����ڿ� �޼ҵ带 �ۼ��ϼ���. 
	- ������ 2�� : �⺻ �����ڿ� �Ű������� ��� �ʵ带 �ʱ�ȭ�ϴ� ������ 
	- �뷡 ������ ����ϴ� show()�޼ҵ�
	- main() �޼ҵ忡���� 2017��, �ѱ������� Collective Arts�� �θ� "Alone"�� 
		Song��ü�� �����ϰ�, 
  		show()�� �̿��Ͽ� �뷡�� ������ �Ʒ��� ���� ����ϼ���. 
  		
�ܼ� ��¿� >> 2017�� �ѱ������� Collective Arts�� �θ� Alone
*/

class Song {
	String title;
	String artist;
	int year;
	String country;
	
	Song(){
				
	}
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year ;
		this.country = country;
	}
	
	void show() {
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+"'"+title+"'");
	}
}

public class ClassEx004 {
	public static void main(String[] args) {
		
		Song song = new Song("Alone", "Collective Art", 2017, "�ѱ�");
		song.show();
		
	}
}
