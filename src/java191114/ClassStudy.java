package java191114;
import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////////////////////
class PersonRsv{
	
	private String seatType;
	private String name;
	private int seatNumber;
	
	PersonRsv(String seatType, String name, int seatNumber){
		this.seatType = seatType;
		this.name = name;
		this.seatNumber = seatNumber;
	}
	PersonRsv(){
		
	}
			
	
	void setSeatType(String seatType) {
		this.seatType= seatType;
	}
	void setName(String name) {
		this.name= name;
	}
	void setSeatNumber(int seatNumber) {
		this.seatNumber= seatNumber;
	}
	
	String getSeatType() {
		return seatType;
		System.out.println(seatType);
	}
	String getName() {
		return name;
	}
	int	 getSeatNumber() {
		return seatNumber;
	}	
}
//class S extends PersonRsv{
//	
//}
//class A extends PersonRsv{
//	
//}
//class B extends PersonRsv{
//	
//}
class arr{

}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Reservation{
	 
	
	Scanner sc = new Scanner(System.in);
	int num = Integer.parseInt(sc.nextLine());			//����:1, ��ȸ:2, ���:3, ������:4 �� �Է�
	
	void reservation() {
		
		PersonRsv [] s = new PersonRsv[10];
		PersonRsv [] a = new PersonRsv[10];
		PersonRsv [] b = new PersonRsv[10];
		
		
		
		if(num == 1) {
			System.out.println("�¼�Ÿ���Է�");
			int seatType = Integer.parseInt(sc.nextLine());
			if(seatType == 1) {
				System.out.println("������ : ");
				String seatName = sc.nextLine();
				System.out.println("��Ʈ��ȣ : ");
				int seatNumber = Integer.parseInt(sc.nextLine());
				s[seatNumber-1] = new PersonRsv("s", seatName, seatNumber);
				System.out.println(s[seatNumber-1].getName());
			}
		}
	}
}


//class run{
//	System.out.println("����:1, ��ȸ:2, ���:3, ������:4");
//}




public class ClassStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation r = new Reservation();
		r.reservation();
		System.out.println(s[0].name);
	}

}
/*
�ܼ�Ʈ ���� ���α׷�. 
- ������ �Ϸ翡 �ѹ�
- �¼��� S��, A��, B������ ������, ���� 10���� �¼��� �ִ�. 
- ���� �ý����� �޴��� "����", "��ȸ", "���", "������"�� �ִ�. 
- ������ ���ڸ��� �����ϰ�, �¼�Ÿ��, �������̸�, �¼���ȣ�� �Է¹޾� �����Ѵ�.
- ��ȸ�� ��� �¼��� ����Ѵ�.
- ��Ҵ� �������� �̸��� �Է¹޾� ����Ѵ�.
- ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��ҵ ���ؼ�
  ���� �޼����� ����ϰ� ����ڰ� �ٽ� �õ��ϵ��� �Ѵ�.
  
# ���࿹�� #
�ڹ��ܼ�ƮȦ ����ý����Դϴ�.
����:1, ��ȸ:2, ���:3, ������:4 >> 1
�¼����� S(1), A(2), B(3) >> 1
S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___ 
�̸� >> ��ī��
��ȣ >> 1
<<����Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 1
�¼����� S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
�̸� >> ������
��ȣ >> 5
<<����Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 2
S >> ��ī�� ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ ������ ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<��ȸ�Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 3
�¼����� S(1), A(2), B(3) >> 2
A >> ___ ___ ___ ___ ������ ___ ___ ___ ___ ___
�̸� >> ������
<<��ҿϷ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 2
S >> ��ī�� ___ ___ ___ ___ ___ ___ ___ ___ ___
A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
<<��ȸ�Ϸ�>>

����:1, ��ȸ:2, ���:3, ������:4 >> 4
<<���α׷� ����>>
*/