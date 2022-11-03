package co.edu.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.edu.member.ShopItem;


@WebServlet("/ShopItemListServlet")
public class ShopItemListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ShopItemListServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/json;charset=utf-8");
		
		ShopItem item1 = new ShopItem("item001","과테말라 안티구아",5000,4000,4.0,"과테말라 안티구아.jpg"); //shopitem.java 필드맞춰서 "" 넣어주기
		ShopItem item2 = new ShopItem("item002","니카라구아 더치핸드드립", 5000, 4000, 4.5,"니카라구아 더치핸드드립.jpg");
		ShopItem item3 = new ShopItem("item003","브라질산토스", 5000, 4000, 4.5,"브라질산토스.jpg");
		ShopItem item4 = new ShopItem("item004","에티오피아 예가체프", 5000, 4000, 4.5,"에티오피아 예가체프.jpg");
		ShopItem item5 = new ShopItem("item005","케냐 오크라톡신", 5000, 4000, 4.5,"케냐 오크라톡신.jpg");
		ShopItem item6 = new ShopItem("item006","코스타리카 따라주", 5000, 4000, 4.5,"코스타리카 따라주.jpg");
	
		List<ShopItem> itemList=new ArrayList<ShopItem>();
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);
		itemList.add(item6);
		
	
		
		Gson gson= new GsonBuilder().create();
		response.getWriter().print(gson.toJson(itemList));
		
	
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
