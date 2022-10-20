package homework;
//회원정보
public class Customer {
	String custName; //회원이름
	int custNum;	//회원번호
	String cDate; 	//등록일자
	String custTel;	//연락처
	
	public Customer() {}
	
	
	
	public Customer(String custName, int custNum) {
		this.custName = custName;
		this.custNum = custNum;
	}



	public Customer(String custName, int custNum, String cDate, String custTel) {
		this.custName = custName;
		this.custNum = custNum;
		this.cDate = cDate;
		this.custTel = custTel;
	}
	

	public Customer(int custNum,String custName) {
		this.custNum = custNum;
		this.custName = custName;
	}

	public Customer(String custName, String custTel, int custNum) {
		this.custName = custName;
		this.custTel = custTel;
		this.custNum = custNum;
	}

	public String getcustName() {
		return custName;
	}

	public void setcustName(String custName) {
	this.custName = custName;
	}

	public int getcustNum() {
		return custNum;
	}

	public void setcustNum(int custNum) {
		this.custNum = custNum;
	}

	public String getStartDate() {
		return cDate;
	}

	public void setStartDate(String cDate) {
		this.cDate = cDate;
	}


	public String getcustTel() {
		return custTel;
	}

	public void setcustTel(String custTel) {
		this.custTel = custTel;
	}

	@Override
	public String toString() {
		return "회원 이름: " + custName + "\t회원 번호: " + custNum + "\t 등록 날짜: " + cDate;
	}
	
	public String getString() {
	return "회원 번호: "+ custNum + "\t회원 이름: " + custName + "\t가입 일자 : "+ cDate + "\t회원 휴대전화 :"+ custTel;
	}
}
