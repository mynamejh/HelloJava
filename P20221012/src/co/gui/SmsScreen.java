package co.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.Context;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.gui.MailScreen.MyActionListener;

// 회원관리 창에서 사용하면 좋을듯!
public class SmsScreen extends JFrame {
	
	Dimension lbl1 = new Dimension(40,25);
	Dimension lbl2 = new Dimension(40,40);
	
	JPanel center, bottom; //라벨 묶기
	JLabel fromLbl, toLbl, contentLbl;
	JTextField fromTxt, toTxt;
	JTextArea contentTxt;
	JButton send, cancel;
	
	
	public SmsScreen() {
		setTitle("메시지 보내기!");
		setSize(350,300);
		setLayout(new BorderLayout());
	
		center = new JPanel();
		bottom = new JPanel();
		
		toLbl = new JLabel("받는 사람 ");
		fromLbl = new JLabel("보내는 사람 ");
		contentLbl = new JLabel("보낼 메시지");
		
		toLbl.setPreferredSize(lbl1);
		fromLbl.setPreferredSize(lbl1);
		contentLbl.setPreferredSize(lbl2);
		
		toTxt = new JTextField(22);
		fromTxt = new JTextField(22);
		contentTxt = new JTextArea(10,20);
		
		send = new JButton("보내기");
		send.addActionListener(new MyActionListener3());
		cancel = new JButton("취소");
		cancel.addActionListener(new MyActionListener3());
		
		center.add(fromLbl);
		center.add(fromTxt);
		center.add(toLbl);
		center.add(toTxt);
		center.add(contentLbl);
		center.add(contentTxt);
		
		bottom.add(send);
		bottom.add(cancel);
		
		add("Center",center);
		add("South",bottom);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // 화면 중앙에 윈도우 띄우기
		
	}
	
	class MyActionListener3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == send) {
				System.out.println("보내기");
				 String from = fromTxt.getText();
				 String to = toTxt.getText();
				 String content = contentTxt.getText();
				
			}else {
				System.out.println("실패!");
			}
			
		}
		
	}

}
