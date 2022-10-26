package co.edu.inherit.interfaces;


//필드X, 생성자X
//쓰는 모든 메소드는 추상메소드
//상수값(변하지 않는값)을 정의
//

public interface DaoService {

	
	public abstract void insert(); //추상 메소드 (abstract안붙여도)
	public void search(); // 
	public void delete();
}
