package java191113;

class OneRoom{
	int sm;
	int distance;
	
	OneRoom(int sm, int distance){
		this.sm = sm;
		this.distance = distance;
	}
	
}



public class Surmary01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OneRoom [] room = new OneRoom[3];
		int [] sm = {50, 60, 70};
		int [] distance = {1, 2, 3};
		
		for(int i = 0 ; i < room.length ; i++) {
			room[i] = new OneRoom(sm[i], distance[i]);
			System.out.print(room[i].sm+"  ");
			System.out.println(room[i].distance);
		}
	
		
	}

}
