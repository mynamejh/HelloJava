package co.edu.common;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.book.BookVO;

public class BookDAO extends DAO {
	public List<BookVO> bookList() {
		// 도서목록을 반환하도록 구성.
		getConnect();
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from tbl_book order by book_code";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				BookVO book = new BookVO();
				book.setBookCode(rs.getString("book_code"));
				book.setBookName(rs.getString("book_name"));
				book.setBookAuthor(rs.getString("author"));
				book.setBookPress(rs.getString("press"));
				book.setBookPrice(rs.getString("price"));

				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public void insertBook(BookVO vo) {
		getConnect();
		String sql = "insert into tbl_book (book_code, book_name, author, press, price) "
				+ "values( ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBookCode());
			psmt.setString(2, vo.getBookName());
			psmt.setString(3, vo.getBookAuthor());
			psmt.setString(4, vo.getBookPress());
			psmt.setString(5, vo.getBookPrice());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public boolean deleteBook(String id) {
		getConnect();
		String sql = "delete from tbl_book where book_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}
}
