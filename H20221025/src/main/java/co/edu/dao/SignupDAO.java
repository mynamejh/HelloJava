package co.edu.dao;

import java.sql.SQLException;

import co.edu.board.MemberVO;
import co.edu.common.DAO;

public class SignupDAO extends DAO{

	public MemberVO login(String id, String passwd) {
		conn=getConnect();
	String sql ="select * from member where id=? and passwd=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, passwd);

			
			
			rs=psmt.executeQuery();
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setName(rs.getString("name"));
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("pwd"));
				vo.setDate(rs.getString("signup_date"));
				vo.setResponsibility(rs.getString("responsibility"));
				
				return vo;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return null; // 값이 없는 리턴!
	}
		

		
		
	}

