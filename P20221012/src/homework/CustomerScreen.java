package homework;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
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

public class CustomerScreen extends JFrame implements ActionListener, MouseListener {

	private String[] labels= {"고객이름","고객번호","가입날짜","휴대폰"};
	private JTextField[] fields = new JTextField[4];

	private JPanel topPanel;
	private JScrollPane centerPanel;
	private JPanel rightPanel;
	private JTable table;
	
	private JButton addBtn,delBtn,findBtn,deepBtn,modBtn;
	
//	CustomerDAO dao2 = new CustomerDAO();
//	List<Customer> list;
	
//	public CustomerScreen() {
//		setTitle("고객관리 화면");
//		setLayout(new BorderLayout(10,10));
//		
//		topPanel = new JPanel(new BorderLayout(6,2));
//		for(int i = 0; i<labels.length; i++) {
//			topPanel.add(new JLabel(labels[i]));
//			fields[i] = new JTextField(30);
//			topPanel.add(fields[i]);
//		}
//		String[] headers = {"고객이름","고객번호","가입날짜","휴대폰"};
//		DefaultTableModel model = new DefaultTableModel(headers,0);
//		
//		table = new JTable(model);
//		table.addMouseListener(this); 
//		centerPanel = new JScrollPane(table);
//		
//	rightPanel=new JPanel(new GridLayout(4,1));
//	addBtn = new JButton("회원 추가");
//	delBtn = new JButton("회원 삭제");
//	modBtn = new JButton("회원 수정");
//	findBtn = new JButton("회원 조회");
//	addBtn.addActionListener(this);
//	delBtn.addActionListener(this);
//	modBtn.addActionListener(this);
//	findBtn.addActionListener(this);
//	
	rightPanel.add(addBtn);
	rightPanel.add(delBtn);
	rightPanel.add(modBtn);
	rightPanel.add(findBtn);
	
	add("North", topPanel);
	add("Center",centerPanel);
	add("East", rightPanel);
	
	setSize(600,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation(null);
	setVisible(true);
	}
public void searchData() {
	DefaultTableModel model = (DefaultTableModel) table.getModel();
	
	int allCnt= model.getRowCount();
	for(int i=0; i<allCnt; i++) {
		model.removeRow(0);
		
	}
	String[] record = new String[4];
	list =dao2.find(new Customer(null,fields[1],null,null));
}
	
	
	
	
	public static void main(String[] args) {
		new CustomerScreen();
	}
	
	
}
