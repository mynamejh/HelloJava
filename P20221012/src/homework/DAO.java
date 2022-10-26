package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs; 
	
	public Connection getConnect()  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.25:1521:xe", "hr", "hr");
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
	
	
	
	
	
	

