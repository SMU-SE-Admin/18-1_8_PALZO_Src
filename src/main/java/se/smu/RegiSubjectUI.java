/**
 * title : RegiSubjectUI.java
 * author : ±èÇÑµ¿ (aggsae@gmail.com)
 * version : 3.0.1.
 * since : 2018 - 05 - 07
 * brief : °ú¸ñ Ç×¸ñ µî·Ï UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   ¾Èµ¿ÁÖ       0.0.0.   2018-05-22                      ÃÊ¾È ÀÛ¼º
 *   ±èÇÑµ¿       1.0.0.   2018-05-25                  ÆÐÅ°Áö Ãß°¡, ÁÖ¼® ÀÛ¼º
 *   ±èÇÑµ¿       2.0.0.   2018-05-26           ¹öÆ° ±â´É È°¼ºÈ­, Áßº¹È®ÀÎ ¹öÆ° ¹× ±â´É Ãß°¡
 *   ±èÇÑµ¿       2.1.0.   2018-05-26                 ÀÔ·Â°ªµé¿¡ ´ëÇÑ ¿¹¿ÜÃ³¸®
 *   ±èÇÑµ¿       2.2.0.   2018-05-28                  °ú¸ñ µî·Ï ¼º°ø ¹öÆ° Ãß°¡
 *   ±èÇÑµ¿       3.0.0.   2018-05-29                    ºÒÇÊ¿äÇÑ ÁÖ¼® Á¤¸®
 *   ±èÇÑµ¿       3.0.1.   2018-05-29                    ºÒÇÊ¿äÇÑ º¯¼ö Á¤¸®
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
	
//	static String Subject;
//	static String Professor;
//	static String subjectYear;
//	static String subjectSem;
//	static String subjectDate;
//	static String subjectStart;
//	static String subjectEnd;
//	static String room;
	
	static String InputSubject;
	static String InputProfessor;
	static String InputSubjectYear;
	static String InputSubjectSem;
	static String InputSubjectDate;
	static String InputSubjectStart;
	static String InputSubjectEnd;
	static String InputRoom;
	
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
		checkSubjectButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		checkSubjectButton.setBackground(Color.DARK_GRAY);
		checkSubjectButton.setBounds(430, 90, 100, 30);
		contentPane.add(checkSubjectButton);
		
		JButton regiButton = new JButton("\uB4F1\uB85D");
		regiButton.setBackground(Color.DARK_GRAY);
		regiButton.setForeground(Color.WHITE);
		regiButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		regiButton.setBounds(430, 210, 100, 30);
		contentPane.add(regiButton);
		
		JButton cancelButton = new JButton("\uCDE8\uC18C");
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		cancelButton.setBackground(Color.DARK_GRAY);
		cancelButton.setBounds(430, 280, 100, 30);
		contentPane.add(cancelButton);
		
		JLabel subjectLabel = new JLabel();
		subjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectLabel.setText("\uACFC\uBAA9\uBA85");
		subjectLabel.setBounds(50, 90, 80, 30);
		contentPane.add(subjectLabel);
		
		JLabel professorLabel = new JLabel();
		professorLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		professorLabel.setText("\uB2F4\uB2F9\uAD50\uC218");
		professorLabel.setBounds(50, 130, 87, 27);
		contentPane.add(professorLabel);
		
		JLabel subjectYearSem = new JLabel();
		subjectYearSem.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectYearSem.setText("\uAC15\uC758\uB144\uB3C4");
		subjectYearSem.setBounds(50, 170, 87, 27);
		contentPane.add(subjectYearSem);
		
		JLabel subjectTime = new JLabel();
		subjectTime.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectTime.setText("\uAC15\uC758\uC2DC\uAC04");
		subjectTime.setBounds(50, 210, 87, 27);
		contentPane.add(subjectTime);
		
		JLabel subjectRoom = new JLabel();
		subjectRoom.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectRoom.setText("\uAC15\uC758\uC2E4");
		subjectRoom.setBounds(50, 250, 87, 27);
		contentPane.add(subjectRoom);
		
		subjectTextField = new JTextField();
		subjectTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectTextField.setBounds(150, 90, 184, 24);
		contentPane.add(subjectTextField);
		subjectTextField.setColumns(10);
		
		professorTextField = new JTextField();
		professorTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		professorTextField.setColumns(10);
		professorTextField.setBounds(150, 130, 184, 24);
		contentPane.add(professorTextField);
		
		subjectYearTextField = new JTextField();
		subjectYearTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectYearTextField.setColumns(10);
		subjectYearTextField.setBounds(150, 170, 56, 24);
		contentPane.add(subjectYearTextField);
		
		JLabel textPane_5 = new JLabel();
		textPane_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textPane_5.setText("\uB144\uB3C4");
		textPane_5.setBounds(211, 170, 45, 24);
		contentPane.add(textPane_5);
		
		subjectSemTextField = new JTextField();
		subjectSemTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectSemTextField.setColumns(10);
		subjectSemTextField.setBounds(260, 170, 35, 24);
		contentPane.add(subjectSemTextField);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textPane_6.setText("\uD559\uAE30");
		textPane_6.setBounds(300, 170, 45, 24);
		contentPane.add(textPane_6);
		
		subjectStartTextField = new JTextField();
		subjectStartTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectStartTextField.setColumns(10);
		subjectStartTextField.setBounds(232, 210, 35, 30);
		contentPane.add(subjectStartTextField);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textPane_7.setText("\uC2DC");
		textPane_7.setBounds(269, 210, 24, 24);
		contentPane.add(textPane_7);
		
		JLabel textPane_8 = new JLabel();
		textPane_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textPane_8.setText("\uC2DC");
		textPane_8.setBounds(349, 210, 34, 24);
		contentPane.add(textPane_8);
		
		subjectEndTextField = new JTextField();
		subjectEndTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectEndTextField.setColumns(10);
		subjectEndTextField.setBounds(314, 210, 35, 30);
		contentPane.add(subjectEndTextField);
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textPane_9.setText("~");
		textPane_9.setBounds(291, 210, 26, 24);
		contentPane.add(textPane_9);
		
		roomTextField = new JTextField();
		roomTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		roomTextField.setColumns(10);
		roomTextField.setBounds(150, 250, 56, 24);
		contentPane.add(roomTextField);
		
		subjectDateTextField = new JTextField();
		subjectDateTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectDateTextField.setBounds(150, 210, 80, 30);
		contentPane.add(subjectDateTextField);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 600, 70);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uACFC\uBAA9\uB4F1\uB85D");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 35));
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
							CanUseSubjectUI canUseSubject = new CanUseSubjectUI();
							canUseSubject.setVisible(true);
							dispose();
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
				
				//ÀÔ·Â°ª Áß null°ªÀÌ ¾øÀ» °æ¿ì °ú¸ñÀ» µ¥ÀÌÅÍº£ÀÌ½º¿¡ µî·ÏÇÏ°í ¸ÞÀÎÈ­¸éÀ¸·Î µ¹¾Æ°¨
				if(InputSubject.length() == 0 | InputProfessor.length() == 0 | InputSubjectYear.length() == 0 | InputSubjectSem.length() == 0 | InputSubjectStart.length() == 0 | InputSubjectEnd.length() == 0 | InputRoom.length() == 0 ) {
					ReEnterRequest noNull = new ReEnterRequest();
					noNull.setVisible(true);
				}
				else {
					// ÇÐ±â°¡ 1~4, ½Ã°£ÀÌ 0~24½Ã ¹üÀ§¾È¿¡ ¾øÀ» °æ¿ì, ½ÃÀÛ½Ã°£ÀÌ Á¾·á½Ã°£º¸´Ù ºü¸¥ °æ¿ì ¿¹¿ÜÃ³¸®
					if((Integer.parseInt(InputSubjectSem) < 1 || Integer.parseInt(InputSubjectSem) > 4) ||
							(Integer.parseInt(InputSubjectStart) < 0 || Integer.parseInt(InputSubjectStart) > 24) ||
							(Integer.parseInt(InputSubjectEnd) < 0 || Integer.parseInt(InputSubjectEnd) > 24) ||
							(Integer.parseInt(InputSubjectStart) > Integer.parseInt(InputSubjectEnd))) {
						InputTypeErrorUI typeError = new InputTypeErrorUI();
						typeError.setVisible(true);
						dispose();
					}
					else {
						SubjectDB subjectDB = new SubjectDB();
						subjectDB.SubjectData(InputSubject, InputProfessor, InputSubjectYear, InputSubjectSem, InputSubjectDate, InputSubjectStart, InputSubjectEnd, InputRoom);

						//RegiSuccess successMessage = new RegiSuccess();
						//successMessage.setVisible(true);
						//dispose();
						
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