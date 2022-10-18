package co.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//메일 발송 화면
public class MailScreen extends JFrame {

	Dimension lbl1 = new Dimension(65, 15);
	Dimension lbl2 = new Dimension(45, 15);

	JPanel center, bottom; // 컴포넌트를 모아두기 위한 컨테이너
	JLabel fromLbl, toLbl, subjectLbl, contentLbl; // 레이블
	JTextField fromTxt, toTxt, subjectTxt; // 입력하기 위한 텍스트 필드
	JTextArea contentTxt; // 여러곳에 넣어야 하니까 area로 지정
	JButton send, cancel; // 버튼 : 보내기, 취소

	MailApp app = new MailApp();

	public MailScreen() {
		setTitle("메일 보내기 UI");
		setSize(350, 300);
		setLayout(new BorderLayout());// 배치관리자 선언(어디에 배치할지)

		// panel 세팅
		center = new JPanel();
		bottom = new JPanel();

		// label 세팅
		toLbl = new JLabel("받는 사람 주소");
		fromLbl = new JLabel("보내는 사람 주소");
		subjectLbl = new JLabel("제목");
		contentLbl = new JLabel("내용");
		toLbl.setPreferredSize(lbl1);
		fromLbl.setPreferredSize(lbl1);
		subjectLbl.setPreferredSize(lbl1);
		contentLbl.setPreferredSize(lbl2);

		// textfield 세팅
		toTxt = new JTextField(22);
		fromTxt = new JTextField(22);
		subjectTxt = new JTextField(22);
		contentTxt = new JTextArea(10, 23);

		// button 세팅
		send = new JButton("보내기");
		send.addActionListener(new MyActionListener()); // ActionListener 인터페이스-> 구현 객체 만들어서 넣어야함
		cancel = new JButton("취소");
		cancel.addActionListener(new MyActionListener()); // 버튼누르면 이벤트 실행

		// container 세팅
		center.add(fromLbl); // 보내는사람
		center.add(fromTxt);
		center.add(toLbl);
		center.add(toTxt);
		center.add(subjectLbl);
		center.add(subjectTxt);
		center.add(contentLbl);
		center.add(contentTxt);

		// 컨테이너에 컴포넌트 배치하는것 ▽
		bottom.add(send);
		bottom.add(cancel);

		// 윈도우에 컨테이너를 배치하는것▽
		add("Center", center);
		add("South", bottom);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 화면 중앙에 윈도우를 띄우겠다.
	}

	// 기능을 실행하는 클래스
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource(); // 어떤 이벤트가 발생했는지 알려줌
			if (src == send) {
				System.out.println("보내기 버튼 - actionperformed");
				String from = fromTxt.getText();//
				String to = toTxt.getText();
				String subject = subjectTxt.getText();
				String content = contentTxt.getText();

				if (app.sendMail(from, to, subject, content).equals("success")) {
					// 콘솔에 "성공"; -> 값을 지워주도록
				JOptionPane.showMessageDialog(null,"발송성공!!", "전송결과", JOptionPane.DEFAULT_OPTION);
			
				} else {
					// 콘솔에 "실패";
					JOptionPane.showMessageDialog(null,"발송실패!!", "에러", JOptionPane.WARNING_MESSAGE);
				}
			} else if (src == cancel) {
				System.out.println("취소 버튼 - actionperformed");
			}
		}

	}

	// 화면시작
	public static void main(String[] args) {
		new MailScreen();
	}
}
