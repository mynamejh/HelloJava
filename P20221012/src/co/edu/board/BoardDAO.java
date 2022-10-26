package co.edu.board;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.jdbc.Employee;

//C(reate) R(ead) U(pdate) D(elete)

public class BoardDAO extends DAO {

	Connection conn;
	Statement stmt = null;
//	ResultSet rs = null;
	PreparedStatement ps = null;
	
	public boolean login(String id, String pwd) {
		
		String sql = "select * from users where id=? ";
		conn=getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs= psmt.executeQuery();
			while(rs.next()) {
				if(pwd.equals(rs.getString("passwd"))){
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
	
	
	
	

	public void insert(Board brd) {
		String sql = "insert into board (board_num, board_title, board_content, board_writer)" + " values(?,?,?,?)";
		conn = getConnect();

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, brd.getBno());
			psmt.setString(2, brd.getTitle());
			psmt.setString(3, brd.getContent());
			psmt.setString(4, brd.getWriter());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public List<Board> getBoardList(String searchField) {
		String sql = "select * from board";
		List<Board> list = new ArrayList<Board>();

		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				list.add(new Board(rs.getInt("board_num"), rs.getString("board_title"), rs.getString("board_content"),
						rs.getString("board_writer"),rs.getString("creation_date"), rs.getInt("cnt")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public void modify(Board brd) {
		String sql = "update board set board_content = ?, creation_date= sysdate where board_num=?";

		conn = getConnect(); //실행
//		for(Board board: brd ) {
//			if(board.brd == getBno())
//		}
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, brd.getContent());
			psmt.setInt(2,brd.getBno());
			
//			psmt.setString(2, brd.getContent());
//			psmt.setString(3, brd.getWriter());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경됨");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public List<Board> search() { //전체
		conn = getConnect();
		List<Board> list = new ArrayList<Board>();
		
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery("select * from board");
			while(rs.next()) {
				list.add(new Board(rs.getInt("board_num"),
						rs.getString("board_title"),
						rs.getString("board_content"),
						rs.getString("board_writer"),
						rs.getString("creation_date"),
						rs.getInt("cnt")));
				
			}
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	public Board getBoard(int num) {// 1개 조회
		
		Board newboard= null;
		
		String sql = "select * from board where board_num=?";
		String scn = "update from board set cnt = cnt+1 where board_num=?";

		conn=getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				newboard=new Board(rs.getInt("board_num"),
						rs.getString("board_title"),
						rs.getString("board_content"),
						rs.getString("board_writer"),
						rs.getString("creation_date"),
						rs.getInt("cnt"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
			return newboard;
	}

	public void delete(int num) {

		String sql = "delete from board where board_num =? ";
		conn = getConnect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);

			int rs = psmt.executeUpdate();
			System.out.println(rs + "건 삭제됨");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
		
	}
}
