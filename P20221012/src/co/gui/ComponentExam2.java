package co.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

//*로그인 화면 만들기*
public class ComponentExam2 extends JFrame {

	public ComponentExam2() {
		setTitle("입력필드 UI");
		setSize(350,150); // 가로, 높이!
		Dimension iblDim = new Dimension(60,16);
		
		setLayout(new BorderLayout());
		
		JPanel center = new JPanel(new FlowLayout());
		JPanel bottom = new JPanel();
		
		JPanel panel = new JPanel(new BorderLayout());
		
		JLabel idLbl =new JLabel("id");
		idLbl.setPreferredSize(iblDim);
		JLabel pwLbl = new JLabel("password");
		pwLbl.setPreferredSize(iblDim);
		JTextField idTxt = new JTextField(23);
		JPasswordField pwTxt = new JPasswordField(23); // 비밀번호는 jpasswordfield로 선언해야 안보임!
		
		center.add(idLbl);
		center.add(idTxt);
		center.add(pwLbl);
		center.add(pwTxt);
		
		JButton btn= new JButton("확인");
		bottom.add(btn);
		
		add("Center", center);
		add("South", bottom);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new ComponentExam2();
	}
}
