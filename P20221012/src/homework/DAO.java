package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	Connection conn; //getConnection() 메소드를 통해 db연결
	PreparedStatement psmt; //작성된 것을  연결
	ResultSet rs; //쿼리 결과 담은 객체! 
	
	public Connection getConnect()  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이브 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("연결 성공");
	} catch (Exception e) {
			System.out.println("연결 실패");
		}
		return conn;
		
	}
	
	public void disconnect() {
			try {
				if(rs !=null) 
				rs.close();
				if(psmt !=null)
				psmt.close();
				if(conn !=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	

