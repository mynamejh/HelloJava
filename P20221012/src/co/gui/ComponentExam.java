package co.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class ComponentExam extends JFrame {

		public ComponentExam() {
			setTitle("라벨 예제"); 
			setSize(300,250);//방법1.너비와 높이 지정 
//			setSize(new Dimension(300,250)); // 2.너비 높이 지정
		
			JPanel panel= new JPanel(); // 라벨 묶음(container역할)
			
			JLabel label1 = new JLabel("Color Label");
			label1.setFont(new Font("Arial", Font.ITALIC, 20)); //new font 꼭 써주기!
			label1.setForeground(Color.yellow); // 색 지정!
			label1.setText("Yellow Font"); // 변경하고 싶은 값을 매개값으로 지정!
			
			
			JLabel label2 = new JLabel("font Label");
			label2.setFont(new Font("Arial", Font.BOLD, 25)); // 글꼴, 굵게, 크기: 15로 지정함
			label2.setForeground(Color.green); // setForeground(색 지정)
			
			JLabel label3 = new JLabel();
			ImageIcon icon = new ImageIcon("c:/Temp/origin.jpg");// 이미지 불러오기!
			//이미지 크기 지정??
			label3.setIcon(icon);
			label3.setPreferredSize(new Dimension(180,150)); // 라벨 크기 지정
			
			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			
			add(panel);
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);//화면 중앙에 배치한다
			
		}
		
		public static void main(String[] args) {
			new ComponentExam();
			
		}
}
