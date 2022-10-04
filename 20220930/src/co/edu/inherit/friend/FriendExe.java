package co.edu.inherit.friend;

public class FriendExe {
	private static FriendExe
	private FriendExe() {
		public static FriendExe getInstance()
		return instance;
	}
	
	
	Scanner scn = new Scanner(system.in);
	board[] myBoards = new board[100];
	
	//친구등록 - 학교/ 회사
	public void addComfirned() {
		System.out.println("친구 등록 기능");
		System.out.print(">> ");
		int subMenu = scn.nextInt();
		scn.nextline();
		System.out.print("친구 이름 입력>> ");
		string frd=scn.nextLine();
		String friend = scn.nextLine();

	1.회사친구 2.학교친구 3.친구
	public void addUnivFriend() {
	board brd = new board()
			board brd = new board(name, phone);
			//배열등록
			for(int i = 0; i <myBoards.length; i++) {
				if(myBoards[i] ==null) {
					myBoards[i] = brd;
					break;			
	
				}
			}
			
	public void searchFriend() {
		System.out.println("친구 이름 입력>> ");
		for(int i=0; i<myBoards.length;i++) {
			System.out.println(myBoards[i].toString());
			for(int i=0; i<myBoards.lengtn; i++.getBoardNo()==(submenu))) {
				System.out.println(myBoards[i].toString());
			}
		}
	
		
//		public void searchFriend() {
//			//권수미, 권미현, 강민기 => like조건
//	  		if(str.matches(".*권.*")){
//		System.out.println();
//		}else{
//		System.out.println();}
				
	
//	 전체 메뉴
	public void exe() {
		
		while(true) {
			System.out.println("1.친구등록 2. 친구조회 3.종료");
			System.out.println("선택>> ");
			
			int menu = scn.nextInt();
			if(menu==1) {
				System.out.println("1.회사친구 2.학교친구 3.친구");
				int subMenu = scn.nextInt();
				if(subMenu==1) {
					addComFriend();
				}else if(subMenu==2) {
					addUnivFriend();
				}else if(subMenu==3) {
					addFriend();
				}
			}else if(menu==2) {
				searchFriend();
			}else if(menu==3) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("잘못된 메뉴를 선택했습니다");
				
			}
			
		}
		System.out.println("프로그램 종료");
	}// end of exe()
//추가메소드
}

