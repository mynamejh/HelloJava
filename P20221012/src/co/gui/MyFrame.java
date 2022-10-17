package co.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; // 모든 import 다 가능하게 함!
import javax.swing.JFrame;

public class MyFrame extends JFrame { // JFram 상속받음(임포트한ㄷ)

	public MyFrame() {// 윈도우 하나 만들기
		setTitle("윈도우 UI"); // ->윈도우 타이틀 지정
		setSize(300, 250); // ->윈도우 사이즈지정

		setLayout(new FlowLayout()); // -> 넣고 싶은 배치관리자를 지정
		JButton btn = new JButton("확인"); // 버튼(import)-> 이름"확인"
		JButton btn2 = new JButton("취소");

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인 버튼 클릭!-> 출력");

			}
		}); // 어떤 이벤트가 발생하면 인터페이스(=동작) 구현해주며 메소드 실행 작업을 한다
	
		//# 람다식 표현법 위에 btn이나 아래 btn2 아무거나 사용 가능!
		btn2.addActionListener((e) -> {
				System.out.println("취소버튼 클릭-> 출력");
				System.exit(0); // 0 누르면 종료!
			
		});
		
		
		
		add(btn); // 컨트롤 등록
		add(btn2); // 컨트롤 등록

		setVisible(true); // -> 화면에 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// -> 화면을 종료시킴!

	}

	public static void main(String[] args) {
		new MyFrame(); // 생성자 호출해주기! -실행

	}
}
