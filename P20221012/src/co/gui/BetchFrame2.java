package co.gui;

import java.awt.BorderLayout;

import javax.swing.*;

// 1.상속 2.생성자 3.메인에서 호출
public class BetchFrame2 extends JFrame {

	public BetchFrame2() {
	setTitle("BorderLayout 관리자"); 
	setSize(300,250);
	// 여백을 주고 싶으면 BorderLayout(가로, 세로); 숫자 지정!
	setLayout(new BorderLayout(10,10)); // 형태를 borderlayout(구역나눔) 처럼 만든다
	JButton top = new JButton("top");
	JButton left = new JButton("left"); // 변수이름 = 라벨
	JButton center = new JButton("center");
	JButton right = new JButton("right");
	JButton bottom = new JButton("bottom");
	
	add("North", top) ; //top 버튼을 위쪽에 배치! "위치" 지정 가능!
	add("West", left);
	add("Center", center);
	add("East", right);
	add("South",bottom);
	
	
	setVisible(true); // 이후에 배치한것은 화면에 안보인다!
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //-> X버튼 누르면 종료!
	setLocationRelativeTo(null); //화면 중앙에 배치한다
	}

	public static void main(String[] args) {
		new BetchFrame2();

	}

}
