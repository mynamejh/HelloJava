package co.gui;

import java.awt.FlowLayout;

import javax.swing.*;

public class BetchFrame extends JFrame { //상속 꼭 받아야함!

	public BetchFrame() {
		setTitle("배치관리자 UI"); //->윈도우 타이틀 지정
		//화면 구성.
		setSize(300,250);
		setLayout(new FlowLayout()); // 넣고 싶은 배치관리자를 지정. 배치관리자 FlowLayout();
		// 배치 관리해줌~ flowlayout이!
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		JButton btn3 = new JButton("추가");
		JButton btn4 = new JButton("수정");
		JButton btn5 = new JButton("삭제");
		JButton btn6 = new JButton("조회");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setVisible(true); // 여태까지 만든 메소드를 화면에 보여주도록 하겠다!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //-> X버튼 누르면 종료하겠다!
		
	
	}

	public static void main(String[] args) {
		new BetchFrame();
	}
}
