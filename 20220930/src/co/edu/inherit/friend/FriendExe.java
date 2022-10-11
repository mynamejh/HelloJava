package co.edu.inherit.friend;

import java.util.Scanner;

public class FriendExe {
	Scanner scn = new Scanner(System.in);
	ArrayList[] friends = new ArrayList();

	// 친구등록 - 학교/ 회사
	public void addFriend() {
		System.out.println("친구 등록 기능");
		String name= scn.nextLine();
		System.out.println("연락처 등록");
		String phone = scn.nextLine();
		Friend friend = new Friend(name,phone);
		
		String[] friends = new friends[10];
		
		Arraylist friends = new ArrayList();
		friends.add(friend);
	
		
		
		
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().contains(searchKey))
				System.out.println(friends[i].showInfo());
		}
	}
		
		
//	1.회사친구 2.학교친구 3.친구
//
//	public void addUnivFriend() {
//	board brd = new board();
//			board friends = new board(name, phone);
//			//배열등록
//			
//		
	public void searchFriend() {
		System.out.println("친구 이름 입력>> ");
		String searchKey= scn.nextLine(); //"미"
		
		for(int i=0; i<friends.size(); i++) {
			//friend 클래스의 상속. friend, Comfriend, UnivFrand,
			Object frnd =friends.get(i); // object
			
			if(frnd instanceof Friend) {
				Friend friend = (Friend)frnd;
				System.out.println(frnd.showInfo());
			}else if(frnd instanceof ComFriend) {
				ComFriend friend = (ComFriend) frnd;
				System.out.println(frnd.showInfo());
			}else if(frnd instanceof UnivFriend) {
				UnivFriend friend = (UnivFriend) frnd;
				System.out.println(friend.showInfo());
			}
			
		}
	}

		public void searchFriend() {
			//권수미, 권미현, 강민기 => like조건
	  		if(str.matches(".*권.*")){
		System.out.println();
		}else{
		System.out.println();}

//	 전체 메뉴
	public void exe() {

		while (true) {
			System.out.println("1.친구등록 2. 친구조회 3.종료");
			System.out.println("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("1.회사친구 2.학교친구 3.친구");
				int subMenu = scn.nextInt();
				if (subMenu == 1) {
					addFriend();
				} else if (subMenu == 2) {
					addFriend();
				} else if (subMenu == 3) {
					addFriend();
				}
			} else if (menu == 2) {
				searchFriend();
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다");

			}

		}
		System.out.println("프로그램 종료");
	}// end of exe()
//추가메소드
}
