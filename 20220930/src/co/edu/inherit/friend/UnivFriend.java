package co.edu.inherit.friend;

public class UnivFriend extends Friend{

	private String univ;
	private String major;
	
	public UnivFriend(String name, String phoe, String univ, String major) {
		super(name, phone); //Friend(String name, String phone);
		this.univ = univ;
		this.major = major;
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
	public String setMajor(String major) {
		
	}
	
	@Override
	public String showInfo() {
		return "학교 친구의 이름은 " + getName()
		+ ", 연락처는 " + getPhone()
		+ ", 학교명은 " + this.univ
		+ ", 전공은 " + this.major;
	}
}
