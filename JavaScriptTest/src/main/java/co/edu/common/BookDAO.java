package co.edu.common;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import co.edu.book.BookVO;


public class BookDAO extends DAO{
	
	public boolean delBook(String id) {
		getConnect();
		String sql ="delete from tbl_book where book_name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "book_name");
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
	

	
	public List<BookVO> bookList() {
		List<BookVO> list = new ArrayList<>();
		getConnect();
		String sql ="select * from tbl_book";
		try {
			psmt= conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookCode(rs.getString("book_code"));
				vo.setTitle(rs.getString("book_name"));
				vo.setWriter(rs.getString("author"));
				vo.setPress(rs.getString("press"));
				vo.setPrice(rs.getInt("price"));
				
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		 return list;
	}



	public void insertBook(BookVO vo) {
			getConnect();
			String sql ="insert into tbl_book(book_code,book_name,author,press,price) values(?,?,?,?,?)";

			try {
				psmt=conn.prepareStatement(sql);
				psmt.setString(1, vo.getBookCode());
				psmt.setString(2, vo.getTitle());
				psmt.setString(3, vo.getWriter());
				psmt.setString(4, vo.getPress());
				psmt.setInt(5, vo.getPrice());
				
		
				
				psmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			
		}
		
	}
