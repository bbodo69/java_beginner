package java191113;

public class ConstEx02 {
	//����
	double d;

	//������
	ConstEx02(){
		d = Math.random(); 
	}
	
	ConstEx02(double a){
		d = a;
	}
	
	//�޼���
	int getSum(int a, int b) {
		return a+b ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstEx02 c2 = new ConstEx02();
		System.out.println(c2.d);
		
		ConstEx02 c1 = new ConstEx02(3.14);
		System.out.println(c1.d);
		
		
	}

}
