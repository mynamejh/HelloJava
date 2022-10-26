package co.edu.variable;

public class Account {
		private String accNo; // 계좌번호 두 단어 조합: 2번째 단언에 첫번째 글짜는 대문자!
		private String owner; // 예금주
		private int balance; // 예금액
		
		//setter, getter 정의
		
		public Account(){
			this.owner ="홍길동";
			this.accNo ="000-000";
		}
		public Account(String owner, String accNo) {
			this.accNo = accNo;
			this.owner = owner;
		}

		

		void setAccNo(String accNo) {
			this.accNo = accNo;
		}
		String getAccNo(String accNo) {
			return this.accNo;
		}
		
		void setOwner(String owner) {
			this.owner = owner;
		}
		String getOwner(String owner) {
			return this.owner;
		}
		
		void setBalance(int balance) {
			this.balance = balance;
		}
		int getBalance(){
			return this.balance;
		}
		
		
		public String showInfo() {
			return "00은행 " + this.owner+ "의 계좌번호는 " +this.accNo +"이며 잔액은"+
		this.balance + "원 입니다";
		}
		
		
		
		
		
		
	}
		


