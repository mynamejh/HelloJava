package homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.board.Board;

public class SubjectDAO extends DAO {
	Connection conn;
	Statement stmt = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public void insert(Subject sub) {
		String sql = "insert into subject(subject,manager_id, time)" + "values (?,?,?)";

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sub.subject);
			psmt.setString(2, sub.managerName);
			psmt.setString(3, sub.time);

			int rs = psmt.executeUpdate();
			System.out.println(rs + "수업 입력 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void update(Subject sub) {
		String sql = "update subject " + "	set subject =?, " + "	manager_id	=?, " + "	time =?"
				+ "	where subject =? ";

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sub.subject);
			psmt.setString(2, sub.managerName);
			psmt.setString(3, sub.time);

			int rs = psmt.executeUpdate();
			System.out.println(rs + "수업 변경 완료");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void delete(String managerName) {
		String sql = "delete from subject where managerName=?";
		conn = getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(2, managerName);

			int rs = psmt.executeUpdate();
			System.out.println(rs + "수업 삭제 완료!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public Subject getSub(String managerName) { // 1개조회

		Subject swim = null;
		String sql = "select * from subject where manager_id=?";
		

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, managerName);

			rs = psmt.executeQuery();
			if (rs.next()) {
				swim = new Subject(rs.getString("subject"), rs.getString("manager_id"), rs.getString("time"),
						rs.getInt("click"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return swim;
	}

	public void getadd(String teacher,int answer) {
		String sql = "update from subject set click = click+1 where manager_name=?";
		conn= getConnect();
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, teacher);
			psmt.executeUpdate();
			
			if(answer==1) {
				psmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	
	}
}
		