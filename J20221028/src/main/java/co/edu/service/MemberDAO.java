package co.edu.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.common.DAO;
import co.edu.member.MemberVO;
import co.edu.member.ScheduleVO;

public class MemberDAO extends DAO {
	
	//한건삭제!
	public boolean deleteMember(String id) {
		getConnect();
		String sql ="delete from members where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			int r =  psmt.executeUpdate();
			if(r>0) 
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return false;
	}
	

	//한건 등록
	public void insertMember(MemberVO vo) {
		getConnect();
		String sql ="insert into members(id,passwd,email,name,responsibility) values(?,?,?,?,'user')";

		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPasswd());
			psmt.setString(3, vo.getEmail());
			psmt.setString(4, vo.getName());
			
			System.out.println(vo.getEmail());
			
			psmt.executeUpdate();
			
			vo.setResponsibility("user");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	
	
	//전체 목록 보기
	 public List<MemberVO> memberList(){
		 List<MemberVO> list = new ArrayList<>();
		 getConnect();
		 String sql ="select * from members";
		 try {
		 psmt = conn.prepareStatement(sql);
		 rs = psmt.executeQuery();
		 while(rs.next()) {
			 MemberVO vo = new MemberVO();
			 vo.setId(rs.getString("id"));
			 vo.setName(rs.getString("name"));
			 vo.setEmail(rs.getString("email"));
			 vo.setResponsibility(rs.getString("responsibility"));
			 
			 list.add(vo); 
		 }
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }finally {
		 disconnect();
	 }
 return list;
}
	 
	 public List<ScheduleVO> List(){
		 List<ScheduleVO> list2 = new ArrayList<>();
		 getConnect();
		 String sql ="select * from full_calendar";
		 try {
		 psmt = conn.prepareStatement(sql);
		 rs = psmt.executeQuery();
		 while(rs.next()) {
			 ScheduleVO co = new ScheduleVO();
			 co.setTitle(rs.getString("title"));
			 co.setStart(rs.getString("start_date"));
			 co.setStart(rs.getString("end_date"));
			 
			 list2.add(co); 
		 }
	 }catch(SQLException e) {
		 e.printStackTrace();
	 }finally {
		 disconnect();
	 }
 return list2;
}
	 
		public void insertSch(ScheduleVO vo) {
			getConnect();
			String sql ="insert into full_calendar(title,start_date,end_date) values(?,?,?)";

			try {
				psmt=conn.prepareStatement(sql);
				psmt.setString(1, vo.getTitle());
				psmt.setString(2, vo.getStart());
				psmt.setString(3, vo.getEnd());
				
				psmt.executeUpdate();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			
		}
		
}