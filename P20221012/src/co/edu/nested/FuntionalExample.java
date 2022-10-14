package co.edu.nested;

import java.util.List;
import java.util.function.Consumer;

import co.edu.jdbc.Employee;
import co.edu.jdbc.EmployeeDAO;

//데이터 베이스 연결할때 많이 쓰임!
public class FuntionalExample {
	public static void main(String[] args) {

		Consumer<String> consumer = (String t) -> {
			System.out.println(t + "는 흥미롭습니다");
		};
		consumer.accept("자바");
		// #함수적 프로그래밍 -> 데이터 처리.
		EmployeeDAO dao = new EmployeeDAO(); // jdbc 패키지 dao클래스에 있음
		List<Employee> list = dao.search();

		// 시냇물이 흘러가는 것처럼 데이터가 흘러가는 흐름(통로)라고 생각하라~// 반복문에 forEach(모든요소에 대해) 써야하고~ 기능을 던져넣겠다.
		list.stream().forEach((t) -> System.out.println(t.toString()));
		}
}