package co.edu.inherit.interfaces;

public class EmpServiceImp1 implements DaoService {
	private String db;
	public EmpServiceImp1() {}
	public EmpServiceImp1(String db) {
		this.db = db;
	}
	
	public void setDb(String db) {
		this.db = db;
	}
	public String getDb() {
		return this.db;
	}
	
	@Override
	public void insert() {
	System.out.println(db + "저장.");
	}

	@Override
	public void search() {
		System.out.println(db + "조회.");
	}

	@Override
	public void delete() {
		System.out.println(db + "삭제.");
		
	}
//DaoService 를 구현하고 있는 (구현클래스- 인터페이스를 상속하는 클래스)


}
