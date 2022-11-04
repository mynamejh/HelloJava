package co.edu.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.edu.book.BookVO;
import co.edu.common.BookDAO;

@WebServlet("/BookAddServlet")
public class BookAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookAddServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=UTF-8");

		String bc = request.getParameter("bookCode");
		String bn = request.getParameter("bookName");
		String ba = request.getParameter("bookAuthor");
		String bPs = request.getParameter("bookPress");
		String bPc = request.getParameter("bookPrice");

		BookDAO dao = new BookDAO();

		BookVO b = new BookVO();
		b.setBookCode(bc);
		b.setBookName(bn);
		b.setBookAuthor(ba);
		b.setBookPress(bPs);
		b.setBookPrice(bPc);

		dao.insertBook(b);

		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(b));
	}

}
