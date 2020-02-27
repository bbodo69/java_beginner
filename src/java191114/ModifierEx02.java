package java191114;

class Test{
	public static int a;
}

class Calc{
	public static int sum(int a, int b) {return a+b;}
	public static int mul(int a, int b) {return a*b;}
	public static int abs(int a) {return a>0 ? a: -a;}
}

public class ModifierEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = Calc.sum(10,  20);
		System.out.println(result);
		
	}

}
