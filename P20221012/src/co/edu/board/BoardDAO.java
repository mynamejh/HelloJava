package co.edu.board;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.jdbc.Employee;

//C(reate) R(ead) U(pdate) D(elete)

public class BoardDAO extends DAO {
	
		ArrayList<Board> list = new ArrayList<Board>();
		Connection conn ;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		public void insert(Board board) {
			System.out.println(board);
			String sql = "insert into board (board_num, board_content, board_writer)" + " values( "
					+ board.getBoard_num() + "', '" + board.getBoard_title() + "', '" + board.getBoard_content()+ "')";

			conn = getConnect();
			
			try {// 쿼리 실행할 객체 stmt
				stmt = conn.createStatement();
				int r = stmt.executeUpdate(sql);
				System.out.println(r + "건 입력됨");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}

		}	
		
		public List<Board> search() {
			conn = getConnect();
			List<Board> list = new ArrayList<Board>(); 

			try { 
				stmt = conn.createStatement();
				rs=stmt.executeQuery("select * from board");
				while (rs.next()) { //next(): 데이터 계속 읽어옴 다 읽어오면 false
					new board(rs.getInt("board_num") 
							, rs.getString("board_content") 
							, rs.getString("board_writer")
						);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
			return list;
		}
		
		
		

	public void modify(Board board) {
		try {
			Class.forName(null);
			String sql = "insert board_title = ?, "
					+ "board_content = ?, "
				    + "hire_date = ?, "
				    + "job_id =? "
				    + "where employee_id =?";

		
		
	
	
	}
	}
}	
	
