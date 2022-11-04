package co.edu.web;

import java.io.IOException;

import java.util.List;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/json;charset=utf-8");
		BookDAO dao = new BookDAO();
		List<BookVO> list = dao.bookList();
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("dopost");
		request.setCharacterEncoding("utf-8"); // 한글처리 인코딩을 utf-8로처리!
		response.setCharacterEncoding("utf-8"); // 응답처리 한글로 표시!
		response.setContentType("text/json;charset=utf-8");

		String job = request.getParameter("job");
		String id = request.getParameter("id");
		System.out.println(id);
		BookDAO dao = new BookDAO();
	
		if (job.equals("delete")) {
			if (dao.delBook(id)) {
				response.getWriter().print("success");
			} else {
				response.getWriter().print("fail");
			}

		} else if (job.equals("insert")) {
			
			String code = request.getParameter("bookCode");
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			String press = request.getParameter("press");
			int price =Integer.parseInt(request.getParameter("price")); 
					
			

			BookVO vo = new BookVO();
			
			vo.setBookCode(code);
			vo.setTitle(title);
			vo.setWriter(author);
			vo.setPress(press);
			vo.setPrice(price);

			dao.insertBook(vo);
			Gson gson = new GsonBuilder().create(); 
		
			response.getWriter().print(gson.toJson(vo)); 

		}

	}

	}
	
	