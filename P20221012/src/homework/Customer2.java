package homework;

public class Customer2 {
	private int CustNum;
	private String custName;
	private int CustAge;
	private String custTel;
	private String gender;
	


	public Customer2() {
	}


	public Customer2(int custNum, String custName, int custAge, String custTel, String gender) {
		this.CustNum = custNum;
		this.custName = custName;
		this.CustAge = custAge;
		this.custTel = custTel;
		this.gender = gender;
	}

	public int getCustNum() {
		return CustNum;
	}



	public void setCustNum(int custNum) {
		CustNum = custNum;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public int getCustAge() {
		return CustAge;
	}



	public void setCustAge(int custAge) {
		CustAge = custAge;
	}



	public String getCustTel() {
		return custTel;
	}



	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}


}