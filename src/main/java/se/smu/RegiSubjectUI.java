/**
 * title : RegiSubjectUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 2.1.0.
 * since : 2018 - 05 - 07
 * brief : 과목 항목 등록 UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   안동주       0.0.0.   2018-05-22                      초안 작성
 *   김한동       1.0.0.   2018-05-25                  패키지 추가, 주석 작성
 *   김한동       2.0.0.   2018-05-26           버튼 기능 활성화, 중복확인 버튼 및 기능 추가
 *   김한동       2.1.0.   2018-05-26                 입력값들에 대한 예외처리
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class RegiSubjectUI extends JFrame {
	
	static String Subject;
	static String Professor;
	static String subjectYear;
	static String subjectSem;
	static String subjectDate;
	static String subjectStart;
	static String subjectEnd;
	static String room;
	
	static String InputSubject;
	static String InputProfessor;
	static String InputSubjectYear;
	static String InputSubjectSem;
	static String InputSubjectDate;
	static String InputSubjectStart;
	static String InputSubjectEnd;
	static String InputRoom;

	/*null 입력 확인 변수
	static Boolean subjectNullCheck = false;
	static Boolean professorNullCheck = false;
	static Boolean subjectYearNullCheck = false;
	static Boolean subjectDateNullCheck = false;
	static Boolean subjectStartNullCheck = false;
	static Boolean subjectEndNullCheck = false;
	static Boolean roomNullCheck = false;
	*/
	
	private JPanel contentPane;
	private JTextField subjectTextField;
	private JTextField professorTextField;
	private JTextField subjectYearTextField;
	private JTextField subjectSemTextField;
	private JTextField subjectDateTextField;
	private JTextField subjectStartTextField;
	private JTextField subjectEndTextField;
	private JTextField roomTextField;

	public RegiSubjectUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton checkSubjectButton = new JButton("\uC911\uBCF5\uD655\uC778");
		checkSubjectButton.setForeground(Color.WHITE);
		checkSubjectButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		checkSubjectButton.setBackground(Color.DARK_GRAY);
		checkSubjectButton.setBounds(430, 90, 100, 30);
		contentPane.add(checkSubjectButton);
		
		JButton regiButton = new JButton("\uB4F1\uB85D");
		regiButton.setBackground(Color.DARK_GRAY);
		regiButton.setForeground(Color.WHITE);
		regiButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		regiButton.setBounds(430, 210, 100, 30);
		contentPane.add(regiButton);
		
		JButton cancelButton = new JButton("\uCDE8\uC18C");
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		cancelButton.setBackground(Color.DARK_GRAY);
		cancelButton.setBounds(430, 280, 100, 30);
		contentPane.add(cancelButton);
		
		JLabel subjectLabel = new JLabel();
		subjectLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectLabel.setText("\uACFC\uBAA9\uBA85");
		subjectLabel.setBounds(50, 90, 80, 30);
		contentPane.add(subjectLabel);
		
		JLabel professorLabel = new JLabel();
		professorLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		professorLabel.setText("\uB2F4\uB2F9\uAD50\uC218");
		professorLabel.setBounds(50, 130, 87, 27);
		contentPane.add(professorLabel);
		
		JLabel subjectYearSem = new JLabel();
		subjectYearSem.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectYearSem.setText("\uAC15\uC758\uB144\uB3C4");
		subjectYearSem.setBounds(50, 170, 87, 27);
		contentPane.add(subjectYearSem);
		
		JLabel subjectTime = new JLabel();
		subjectTime.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectTime.setText("\uAC15\uC758\uC2DC\uAC04");
		subjectTime.setBounds(50, 210, 87, 27);
		contentPane.add(subjectTime);
		
		JLabel subjectRoom = new JLabel();
		subjectRoom.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectRoom.setText("\uAC15\uC758\uC2E4");
		subjectRoom.setBounds(50, 250, 87, 27);
		contentPane.add(subjectRoom);
		
		subjectTextField = new JTextField();
		subjectTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectTextField.setBounds(150, 90, 184, 24);
		contentPane.add(subjectTextField);
		subjectTextField.setColumns(10);
		
		professorTextField = new JTextField();
		professorTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		professorTextField.setColumns(10);
		professorTextField.setBounds(150, 130, 184, 24);
		contentPane.add(professorTextField);
		
		subjectYearTextField = new JTextField();
		subjectYearTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectYearTextField.setColumns(10);
		subjectYearTextField.setBounds(150, 170, 56, 24);
		contentPane.add(subjectYearTextField);
		
		JLabel textPane_5 = new JLabel();
		textPane_5.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_5.setText("\uB144\uB3C4");
		textPane_5.setBounds(211, 170, 45, 24);
		contentPane.add(textPane_5);
		
		subjectSemTextField = new JTextField();
		subjectSemTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectSemTextField.setColumns(10);
		subjectSemTextField.setBounds(260, 170, 35, 24);
		contentPane.add(subjectSemTextField);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_6.setText("\uD559\uAE30");
		textPane_6.setBounds(300, 170, 45, 24);
		contentPane.add(textPane_6);
		
		subjectStartTextField = new JTextField();
		subjectStartTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectStartTextField.setColumns(10);
		subjectStartTextField.setBounds(232, 210, 35, 30);
		contentPane.add(subjectStartTextField);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_7.setText("\uC2DC");
		textPane_7.setBounds(269, 210, 24, 24);
		contentPane.add(textPane_7);
		
		JLabel textPane_8 = new JLabel();
		textPane_8.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_8.setText("\uC2DC");
		textPane_8.setBounds(349, 210, 34, 24);
		contentPane.add(textPane_8);
		
		subjectEndTextField = new JTextField();
		subjectEndTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectEndTextField.setColumns(10);
		subjectEndTextField.setBounds(314, 210, 35, 30);
		contentPane.add(subjectEndTextField);
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_9.setText("~");
		textPane_9.setBounds(291, 210, 26, 24);
		contentPane.add(textPane_9);
		
		roomTextField = new JTextField();
		roomTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		roomTextField.setColumns(10);
		roomTextField.setBounds(150, 250, 56, 24);
		contentPane.add(roomTextField);
		
		subjectDateTextField = new JTextField();
		subjectDateTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectDateTextField.setBounds(150, 210, 80, 30);
		contentPane.add(subjectDateTextField);
		
		/*
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC6D4\uC694\uC77C", "\uD654\uC694\uC77C", "\uC218\uC694\uC77C", "\uBAA9\uC694\uC77C", "\uAE08\uC694\uC77C", "\uD1A0\uC694\uC77C", "\uC77C\uC694\uC77C"}));
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		comboBox.setBounds(150, 210, 80, 30);
		contentPane.add(comboBox);
		*/
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 600, 70);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uACFC\uBAA9\uB4F1\uB85D");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 35));
		panel.add(label);
		
		checkSubjectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cOnn = null;
					String sQl;
					Statement st = null;
					ResultSet rs = null;
					
					String subjectCheck = null;
					InputSubject = subjectTextField.getText();
					
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					st = cOnn.createStatement();
					sQl = "USE SubjectDB";
					st.executeQuery(sQl);
					rs = st.executeQuery("SELECT Subject FROM SubjectData WHERE Subject = '" + InputSubject + "'");
					
					while(rs.next())
						subjectCheck = rs.getString("Subject");
					
					if(InputSubject.length() == 0) {
						ReEnterRequest noNull = new ReEnterRequest();
						noNull.setVisible(true);
					}
					
					else {
						if(InputSubject.equals(subjectCheck)) {
							NameOverlap usedSubject = new NameOverlap();
							usedSubject.setVisible(true);
							dispose();
						}
						
						else {
							System.out.println("등록가능한 과목입니다.");
							//메세지 UI 구축 후 추가
						}
					}
												
				} catch(ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		regiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputSubject = subjectTextField.getText();
				InputProfessor = professorTextField.getText();
				InputSubjectYear = subjectYearTextField.getText();
				InputSubjectSem = subjectSemTextField.getText();
				InputSubjectDate = subjectDateTextField.getText();
				InputSubjectStart = subjectStartTextField.getText();
				InputSubjectEnd = subjectEndTextField.getText();
				InputRoom = roomTextField.getText();
				
				//입력값 중 null값이 없을 경우 과목을 데이터베이스에 등록하고 메인화면으로 돌아감
				if(InputSubject.length() == 0 | InputProfessor.length() == 0 | InputSubjectYear.length() == 0 | InputSubjectSem.length() == 0 | InputSubjectStart.length() == 0 | InputSubjectEnd.length() == 0 | InputRoom.length() == 0 ) {
					ReEnterRequest noNull = new ReEnterRequest();
					noNull.setVisible(true);
				}
				else {
					// 학기가 1~4, 시간이 0~24시 범위안에 없을 경우, 시작시간이 종료시간보다 빠른 경우 예외처리
					if((Integer.parseInt(InputSubjectSem) < 1 || Integer.parseInt(InputSubjectSem) > 4) ||
							(Integer.parseInt(InputSubjectStart) < 0 || Integer.parseInt(InputSubjectStart) > 24) ||
							(Integer.parseInt(InputSubjectEnd) < 0 || Integer.parseInt(InputSubjectEnd) > 24) ||
							(Integer.parseInt(InputSubjectStart) > Integer.parseInt(InputSubjectEnd))) {
						System.out.println("학기는 1~4학기, 시간은 0~24시, 시작시간은 종료시간보다 작게 설정하십시오.");
						//메세지 UI 구현 후 추가
					}
					else {
						SubjectDB subjectDB = new SubjectDB();
						subjectDB.SubjectData(InputSubject, InputProfessor, InputSubjectYear, InputSubjectSem, InputSubjectDate, InputSubjectStart, InputSubjectEnd, InputRoom);
					
						MainUI backToMain = new MainUI();
						backToMain.setVisible(true);
						dispose();
					}
				}
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainUI backToMain = new MainUI();
				backToMain.setVisible(true);
				dispose();
			}
		});
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegiSubjectUI frame = new RegiSubjectUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

