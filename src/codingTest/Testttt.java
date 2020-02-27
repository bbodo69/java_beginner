package codingTest;

public class Testttt {
	
	static int max(int a, int b) {
		return a < b ? b : a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 5;
		int c = 3;
		
		System.out.println(Testttt.max(a, Testttt.max(b, c)));
		
		
		
	}

}
