package homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends DAO { // 기능 넣는 테이블
	
	Connection conn;
	Statement stmt = null;
	PreparedStatement psmt = null;
	ResultSet rs= null;
	

	public boolean login(String id, String passwd) {
		String sql = "select * from manBoard where manager_id = ?";
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			

			while (rs.next()) {
				if (passwd.equals(rs.getString("manager_pwd"))) {
				return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		disconnect();
		}
		return false;

	}

	public void insert(Customer cust) { // 먼저 sql문 변수 생성!~
		String sql = "insert into custBoard (customer_name, customer_num, customer_date, customer_tel) values(?,?,?,?)";

		conn = getConnect(); // 추가
		
		try {// psmt는 conn=getConnection() 하고나서 생성 할 수 있음~
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, cust.getcustName());
			psmt.setInt(2, cust.getcustNum());
			psmt.setString(3, cust.getStartDate());
			psmt.setString(4, cust.getcustTel());

			int rs = psmt.executeUpdate();
			System.out.println(rs + " 건 입력 완료했습니다!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public void update(Customer cust) { // 수정
			String sql = "update custBoard"
					+ "	set customer_name=?," //바꾸는것만 set적고
					+ "	customer_tel =?, "
					+ "	customer_date =sysdate" 
					+ "	where customer_num =?";

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, cust.getcustName());
			psmt.setString(2, cust.getcustTel());
			psmt.setInt(3, cust.getcustNum());

			
			int rs = psmt.executeUpdate(); // 실제 업데이트 되는 값!
			System.out.println(rs + "건 수정되었습니다!");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public boolean delete(int custNum) { // 삭제
		String sql = "delete from custBoard where customer_num =? ";
		conn = getConnect();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, custNum);
			
			int rs = psmt.executeUpdate();
			System.out.println(rs + " 님이 삭제되었습니다!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public List<Customer> search() { // 전체 목록
//		String sql = "select * from custBoard order by customer_num";
		conn = getConnect();
		List<Customer> list = new ArrayList<>();

		try {
			stmt=conn.createStatement();
			rs = stmt.executeQuery("select * from custBoard");

			while (rs.next()) {
				list.add(new Customer(rs.getString("customer_name"), 
						rs.getInt("customer_num"),
						rs.getString("customer_date"),
						rs.getString("customer_tel")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	}

	public Customer getCust(int custNum) { //1개조회
		
		Customer csbrd = null;
		String sql = "select * from custBoard where customer_num=?";
		
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, custNum);
			
			rs = psmt.executeQuery();
			if (rs.next()) {
				csbrd = new Customer(rs.getString("customer_name"), 
						rs.getInt("customer_num"),
						rs.getString("customer_date"), 
						rs.getString("customer_tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return csbrd;
	}


	public List <Subject> find(){

		conn = getConnect();
		List<Subject> list = new ArrayList<Subject>();
		try {
			stmt=conn.createStatement();
			rs= stmt.executeQuery("select * from Subject");
			while(rs.next()) {
				list.add(new Subject(rs.getString("subject"),
						rs.getString("manager_id"),
						rs.getString("time"),
						rs.getInt("click")));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
		
	}
	

	

}