package co.edu.inherit.friend;

public class ComFriend extends Friend{
	private String company;
	private String dept;
	
	public ComFriend() {
		super();
	}
	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dpet = dept;
	
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setDept(Stirng dept) {
		this.dept = dept;
	}
	public String getCompany() {
		return this.company;
	}
	public String getDept() {
		return this.dept;
	}
	@Overriding
	public String showInfo() {
		// 회사 친구의 정보
		return "회사친구 이름은 " + getName()
		+ ", 연락처는" + getPhone() 
		+ ", 회사명은 " + this.company 
		+ ", 부서는 " + this.dept + " 입니다" ;
	}
}
