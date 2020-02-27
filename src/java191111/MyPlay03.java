package java191111;

public class MyPlay03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =20;
		int sum=0;
	
		
		
		for(int i = 0; i <=20 ; i++) {
			int j = n%i;
			if(j==0) {
				sum=sum+i;
				
			}
		}
		System.out.println(n);
	}

}
