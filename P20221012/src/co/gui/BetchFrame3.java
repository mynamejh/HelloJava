package co.gui;

import java.awt.GridLayout;

import javax.swing.*;

public class BetchFrame3 extends JFrame {

	public BetchFrame3() {
		setTitle("GridLayout 배치"); //->윈도우 타이틀 지정
		setSize(350,250);
		
		setLayout(new GridLayout(2,3)); //그리드 레이아웃 형태에. 줄 2개 칼럼은 3개 만든다
		JButton btn1 = new JButton("확인1");
		JButton btn2 = new JButton("확인2");
		JButton btn3 = new JButton("확인3");
		JButton btn4 = new JButton("확인4");
		JButton btn5 = new JButton("확인5");
		JButton btn6 = new JButton("확인6");
		
		//버튼 추가
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		//화면 출력
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료
		setLocationRelativeTo(null);//화면 중앙에 배치한다
	}
	
	public static void main(String[] args) {
		new BetchFrame3();
	}
}
