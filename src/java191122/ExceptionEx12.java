package java191122;

class SpaceException extends Exception{
	public SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception{
	public MemoryException(String msg) {
		super(msg);
	}
}
		

public class ExceptionEx12 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		startInstall();	//설치
		copyFiles();		//설치파일 템프로 복사
		}catch(SpaceException s){
			System.out.println("에러메세지 : " + s.getMessage());
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		}catch(MemoryException m) {
			System.out.println("에러메세지 : " + m.getMessage());
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		}finally {
			System.out.println("템프파일 삭제");
			deleteTempFiles(); 	//템프파일 삭제
		}
		
				
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("설치공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
		
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		//............
		return true;
	}
	static boolean enoughMemory() {
		//..............
		return true;
	}

}
