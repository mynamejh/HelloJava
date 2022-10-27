package co.edu.dao;

import java.sql.SQLException;

import co.edu.board.MemberVO;
import co.edu.common.DAO;

public class SignupDAO extends DAO{

	public MemberVO insertMem() {
		conn=getConnect();
		String sql ="select board_seq.nextval from dual";
		String sql2 = "insert into member(name, id, pwd, signup_date, auth)"
					+ "values(?,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
		
			
		}
		
	
}
