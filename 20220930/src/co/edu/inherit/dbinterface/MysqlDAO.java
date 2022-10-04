package co.edu.inherit.dbinterface;

public class MysqlDAO implements DaoService { //클래스를 통해 기능을 구현
	
	
//	public void insert() {
//
//	}
//	public void search() {
//
//	}
//	public void delete() {
//
//	}
//	public void update() {
//
//	}
	@Override
	public void modify() {
		System.out.println("mysql 수정");
		
	}
	@Override
	public void remove() {
		System.out.println("mysql 삭제");
		
		
	}
	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}
}
