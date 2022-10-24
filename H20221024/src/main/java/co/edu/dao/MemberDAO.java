package co.edu.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.common.DAO;
import co.edu.vo.MemberVO;



public class MemberDAO extends DAO {
	//조회 후 수정
	public void searchAndUpdate() {
		//1.조회
		//2.수정
		
	}
	
	//조회 후 삭제
	public void searchAndDelete() {
		
	}
	
	
	
	
	
	// 생성, 수정, 삭제, 한건 조회, 목록조회

	public void memberInsert(MemberVO vo) {
		String sql = "insert into members (id, passwd, name, email)	values (?,?,?,?)";
		
		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getEmail());

			int rs = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}
	
	
	

	public MemberVO memberSearch(String id) 
	{ 

		MemberVO mem = null;
		String sql = "select * from members where id=?";

		conn = getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				mem = new MemberVO(rs.getString("id"), rs.getString("passwd"),
						rs.getString("name"), rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return mem;
	}

	public void memberUpdate(MemberVO vo) {
		String sql = "update members set id=? passwd=? name=? email=? where=id";
		conn = getConnect();
		try {
			psmt=conn.prepareStatement(sql);
			rs=psmt.executeQuery();
			
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getEmail());
			
			int rs= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	
		
	}

	public void memberDelete(String id) {
		String sql = "delete from members where id=?";
		
		try {
			conn= getConnect();
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			int rs= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}

	public List<MemberVO> memberList() {
		List<MemberVO> list = new ArrayList<>();
		conn = getConnect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from members");
			while (rs.next()) {
				list.add(new MemberVO(rs.getString("id"), rs.getString("passwd"), rs.getString("name"),
						rs.getString("email")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

		

		
		
	}

