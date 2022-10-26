package co.gui.dao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmpScreen extends JFrame implements ActionListener, MouseListener {

	// 입력항목
	private String[] labels = { "사원번호", "이름", "성씨", "이메일", "입사일자", "직무" }; // 화면에 보여질 라벨 만들었음
	private JTextField[] fields = new JTextField[6]; // 입력하기 위한 필드 만들었다

	// 배치하기 위한 컨테이너
	private JPanel topPanel;
	private JScrollPane centerPanel;
	private JPanel rightPanel;
	private JTable table; // 테이블형식

	// 이벤트 처리 버튼 컨테이너
	private JButton addBtn, delBtn, findBtn, initBtn;

	EmpDAO dao = new EmpDAO(); // DB처리하기 위해 만든것
	List<EmployeeVO> list;

	public EmpScreen() {// 1.생성자 만들어주기
		setTitle("사원정보 관리화면"); // 팝업창 이름
		setLayout(new BorderLayout(10, 10)); // 배치관리자 생성 - 좌우여백 10

		// topPanel 추가할 컴포넌트
		topPanel = new JPanel(new GridLayout(6, 2)); // 배치관리자를 그리드타입으로 , 라인이 6개 줄 2개

		for (int i = 0; i < labels.length; i++) { // 라벨 길이만큼 반복
			topPanel.add(new JLabel(labels[i]));
			fields[i] = new JTextField(30);
			topPanel.add(fields[i]);
		}

		// centerPanel 추가
		String[] headers = { "사원번호", "이름", "성씨", "이메일", "입사일자", "직무" };
		DefaultTableModel model = new DefaultTableModel(headers, 0); // 테이블모델

		table = new JTable(model);
		table.addMouseListener(this); // empscreen this -인터페이스 -> implements뒤에 추가해주기
		centerPanel = new JScrollPane(table);

		// 오른쪽 버튼
		rightPanel = new JPanel(new GridLayout(4, 1)); // 4개항목 1줄
		addBtn = new JButton("레코드 추가");
		delBtn = new JButton("레코드 삭제");
		findBtn = new JButton("레코드 조회");
		initBtn = new JButton("초기화");
		addBtn.addActionListener(this); // 리스너에 인터페이스 역할this
		delBtn.addActionListener(this);
		findBtn.addActionListener(this);
		initBtn.addActionListener(this);

		// 마우스 버튼 클릭할때 액션

		rightPanel.add(addBtn);
		rightPanel.add(delBtn);
		rightPanel.add(findBtn);
		rightPanel.add(initBtn);

		add("North", topPanel); // 위쪽에 있는 입력항목들을 배치
		add("Center", centerPanel); // 중간에 배치
		add("East", rightPanel);

		// 배치
		setSize(620, 500); // 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true); // 가운데 배치

	}// end of EmpScreen(); 생성자 끝부분

	// DB조회 후 table 결과를 반영.
	public void searchData() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		//화면에 조회된 결과 있으면 clear
		int allCnt = model.getRowCount();
		for(int i=0; i<allCnt; i++) {
			model.removeRow(0); //첫번째 카운트 만큼 삭제하겠다
		}
		String[] record = new String[6];
//		list = dao.empList(null); // 초기값을 null로 주겠다// 이렇게 설정하면 화면에 안보여짐
		list = dao.empList(new EmployeeVO(0, fields[1].getText(), null, null, null, null)); // 사원번호는 int 타입이라서 0 -> 이렇게하면 목록 다 나옴~!
//배열 첫번째: 사원번호 2번째 이름
		for (int i = 0; i < list.size(); i++) {
			record[0] = String.valueOf(list.get(i).getEmployeeId()); // 리스트 0번째 값을 스트링 타입으로 바꾸겠다
			record[1] = list.get(i).getFirstName();
			record[2] = list.get(i).getLastname();
			record[3] = list.get(i).getEmail();
			record[4] = list.get(i).getHiredate();
			record[5] = list.get(i).getJobId();
			model.addRow(record);
		} // record가 가지고 있는

		model.addRow(record);

	}

	// 삭제하기 위한 메소드
	public void removeData() {
		int selectedRow = table.getSelectedRow(); // 선택된 row반환. 인덱스값 반환해줌
		if (selectedRow < 0) {
			return; // 메소드 종료
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int empId = Integer.parseInt((String) model.getValueAt(selectedRow, 0)); // 선택된 인덱스값을 기준으로

		dao.deleteEmp(empId);
		model.removeRow(selectedRow); // 화면삭제.
	}

	//등록
	public void addData() {
		String[] records = new String[6];
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for(int i=0; i<fields.length; i++) {
			records[i] = fields[i].getText(); // 반복해서 필드값을 담겠다
			
		}
		EmployeeVO emp = new EmployeeVO(0,records[1],records[2],records[3],records[4],records[5]);
		dao.insertEmp(emp);
		records[0] = String.valueOf(emp.getEmployeeId()); //string 타입을 int타입을 변경!
		dao.insertEmp(emp);
		
		model.addRow(records);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// addBtn, delBtn, findBtn.. 어떤 버튼을 눌렀는지 넣어줘야함
		Object src = e.getSource();

		if (src == addBtn) {
			addData();

		} else if (src == delBtn) {
			removeData();

		} else if (src == findBtn) {
			searchData();

		} else if (src == initBtn) {

		}

	}// end of actionPerformed(ActionEvent e)

	// 마우스 이벤트 처리
	@Override
	public void mouseClicked(MouseEvent e) {
		// table 이벤트
		int selectedRow = table.getSelectedRow(); // 선택된 row반환.
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int empId = Integer.parseInt((String) model.getValueAt(selectedRow, 0)); // 선택된 인덱스값을 기준으로

		dao.deleteEmp(empId);
	}

	// 프로그램의 시작
	public static void main(String[] args) {
		new EmpScreen(); // EmpScreen()스크린 실행
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}// end of class
