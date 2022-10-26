package co.edu.api;

import java.util.ArrayList;
import java.util.List;

class Box<T>{ // T(제너릭) 아직 타입이 정해지지 않았다 오브젝트처럼 다 사용하겠다 
	Object obj;
	void set(Object obj) {
		this.obj = obj;
	}
	Object get() {
		return obj;
	}

}
class Member{
	private String name;
	private String id;
	private int point;

	
	public Member(String name, String id, int point) {
		super();
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}


class Employee {
	private String empName;
	private String empId;
	private int salary;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String id) {
	}
	
}

public class StringExe3 {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		box.set("Hello");
//		box.set(200); error 발생(빨간줄 안뜨는데)
		Integer result = (Integer) box.get();
		System.out.println(result);
		
		String[] stAry;
		List<String> list=new ArrayList<String>();
		list.add("Hello");
//		list.add(200); // List<타입>을 string으로 설정해놔서 컴파일 에러
	
		List<Member> members = new ArrayList<Member>(); // members가 <Meber> 의 인스턴스만 담겠다
		members.add(new Member("홍길동","hong",10000));
		members.add(new Member("김민기","kim",20000));
		members.add(new Member("박인기","park",3000));
		
		List<Employee> employees = changeType(members); // Member => Employee (변경해서 리턴해주는것)
		for(Employee emp: employees) {
			System.out.println("name:" + emp.getEmpName()+",id:"+emp.getEmpId());
		}
		
	}// List<Member> : 매개변수 / List<Employee> : 반환값
	public static List<Employee> changeType(List<Member> collect){
		//3개 -> 3개 담기
		// coding
		List<Employee> empls = new ArrayList<Employee>();
		for(Member member : collect) {
			Employee emp = new Employee();
			emp.setEmpId(member.getId());
			emp.setEmpName(member.getName());
			emp.setSalary(member.getPoint());
			empls.add(emp);
		}
		return empls;
	}
}

