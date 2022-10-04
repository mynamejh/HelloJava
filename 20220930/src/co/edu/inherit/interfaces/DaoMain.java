package co.edu.inherit.interfaces;

public class DaoMain {
	public static void main(String[] args) {
		EmpServiceImp1 service = new EmpServiceImp1();
		service.setDb("인사");
		service.insert();
		service.delete();
		
		DeptServerviceImp1 service2 = new DeptServerviceImp1();
		service2.insert();
		service2.delete();
		
		DaoService dao = new DeptServiceImp1(); //구현 클래스
//		dao = new DeptServiceImp1();
		dao.insert();
		dao.search();
		dao.delete();
		
	}
}
