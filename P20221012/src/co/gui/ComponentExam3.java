package co.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//*계산기 만들기*//
public class ComponentExam3 extends JFrame {
	// 계산기에 들어갈 숫자 배열 생성!
	String[] keys = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "=", "C", "/" };
	// 16개 버튼이 들어갈 수 있는 변수 생성!
	JButton[] keyBtn = new JButton[16]; // 16개공간 생성
	String displayText = ""; // 입력이 누적됨 , 초기값
	String left, right; // 계산 필드 지정

	public ComponentExam3() {
		setTitle("계산기 UI"); // 팝업창 이름
		setBounds(100, 100, 300, 220); // 위치,윈도우크기(창) 지정

		setLayout(new FlowLayout());

		// display 정보를 출력하기 위한 panel
		JPanel displayPanel = new JPanel(); // jpanel은 묶음집!
		JTextField display = new JTextField("0", 20); // 크기 지정
		display.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽 정렬!
		displayPanel.add(display);

		// 버튼을 생성하기 위한 panel.
		JPanel keyPanel = new JPanel();
		keyPanel.setLayout(new GridLayout(4, 4, 5, 5)); // 각각 가로4개 세로4개 씩 생성
		for (int i = 0; i < keyBtn.length; i++) {
			keyBtn[i] = new JButton(keys[i]); // keys[인덱스값]으로 버튼을 순서대로 넣기!
			// *버튼 이벤트 만들기 - 액션(버튼 누를때마다)이 발생하면 new actionlistner(인터페이스) 을 실행하겠다!*
			keyBtn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(((JButton) e.getSource()).getText()); // 버튼이가지고 있는데 겟텍스트(라벨정보)를 가지고 온다
					String keyOper = ((JButton) e.getSource()).getText(); // 누르는 키값!
					// getText() : 값을 가져옴!

					display.setText(keyOper);// setText(): 값을지정. 누를때마다 생성!
					// * 누적된 값_ 값 더하기 *//
					if (keyOper.equals("=")) {
						left = displayText.substring(0, displayText.indexOf("+")); // 더하기가 가지고 있는 인덱스값을 레프트에 담겠다~!
						right = displayText.substring(displayText.indexOf("+") + 1);
						displayText = String.valueOf(Integer.parseInt(left) + Integer.parseInt(right));
						// 그값을 디스플레이에다가 셋텍스트 하겠다~
						display.setText(displayText);
						return; // 액션종료함 (actionlister 메소드)

					}
					displayText += keyOper; // 누르는 값을 누적
					display.setText(displayText);

				}
				
				
			});
			keyPanel.add(keyBtn[i]); // 각각 키 버튼(16개)를 keypanel에 넣겠다!

		}

		add(displayPanel); // 윈도우
		add(keyPanel); //

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ComponentExam3();
	}
}
