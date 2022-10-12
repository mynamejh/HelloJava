package co.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDAO {

	public static void main(String[] args) {
//		search();
//		delete();
		update();
	}
	// *수정*
	public static void update() {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
	
			stmt = conn.createStatement();
			int r= stmt.executeUpdate("update from empl set Last_name = 'hi' where employee_id=500");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
//				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}	
	// *삭제*
	public static void delete() {
		Connection conn = null;
		Statement stmt = null;
//		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
			stmt = conn.createStatement();
			int r= stmt.executeUpdate("delete from empl where employee_id=700");// insert,delete,update때 executeUpdate 써야함!
			System.out.println(r+"건 삭제됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // resource close 꼭 있어야한다.
//				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	// *조회*
	public static void search() {
		// jdbc driver로드
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

			stmt = conn.createStatement();// 실행할 쿼리문을 전송, 결과 받아오도록 하는 객체.
			rs = stmt.executeQuery("select * from empl order by employee_id"); //select 쿼리 경우는 executequery 써야함!
			// Set 컬렉션
			// while rs를 한개씩 가져온다.
			while (rs.next()) {
				System.out.println("사원번호: " + rs.getInt("employee_id"));
				System.out.println("이름: " + rs.getString("first_name"));
				System.out.println("급여: " + rs.getInt("salary"));
				System.out.println("==================================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 예외발생될때 정상 처리
			try { // resource close 꼭 있어야한다.
//				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		System.out.println("프로그램 종료");
	}
}
