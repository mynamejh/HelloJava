package co.edu.emp.list;

import java.util.ArrayList;

import co.edu.emp.Employee;

public class ListApp {
	public static void main(String[] args) {
		// 배열 => 컬렉션(ArrayList, HashSet, HashMap)
		String[] strAtry = new String[10]; // 10개를 담는 배열
		//object 클래스를 선언하면 모든 클래스 자식은 오브젝트 변수를 갖을수있다
		ArrayList<String> list = new ArrayList<String>(); // 문자열<타입쓰기>만 담겠다는 규칙!
		list.add("Hello");
		list.add("Employee");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
//		intList.add("100");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100,"홍길동",1000));
		empList.add(new Employee(200,"김민수",2000));
		empList.add(new Employee(300,"박인기",3000));
		empList.add(new Employee(400,"황석용",4000));
//		empList.add(100);
		
//		size = 배열크기
		String result = null;
		int salary = 0;
		for(int i=0; i<empList.size(); i++) {
			if(empList.get(i).getEmployeeId()==200) {
				result= empList.get(i).getName(); // 해당 사원 이름 가져오기
				salary = empList.get(i).getSalary(); // 해당 금액 가져오기
			}
		}
		System.out.println("이름은 " + result +"이고 급여는 " + salary + "입니다.");
	}
}
