package co.edu.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// DB연결 Connection 생성
public class DAO {
	public Connection conn;
	public Statement stmt;
	public ResultSet rs;
	public PreparedStatement psmt;
	
	//Connection getConnect
	public Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hjh", "hjh");
//		System.out.println("연결성공");
		
		}catch(Exception e) {
			System.out.println("연결실패");
			e.printStackTrace();
		}
		return conn;
	}
	//Resource 해제하는 disconnect
	public void disconnect() {
		try {
		if(rs!= null) rs.close();
		if(stmt != null) stmt.close();
		if(psmt != null) psmt.close();
		if(conn != null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
