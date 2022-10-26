package test_1014;

import java.io.Serializable;

public class Member  {

	String id;
	String name;
	int price;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Member(String id, String name, int price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}

	
}
