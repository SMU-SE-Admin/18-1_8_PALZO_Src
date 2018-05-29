/**
 * title : RegiListUI.java
 * author : ±èÇÑµ¿ (aggsae@gmail.com)
 * version : 1.1.0.
 * since : 2018 - 05 - 07
 * brief : ÅõµÎ Ç×¸ñ µî·Ï UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   ¾Èµ¿ÁÖ       0.0.0.   2018-05-22                      ÃÊ¾È ÀÛ¼º
 *   ±èÇÑµ¿       1.0.0.   2018-05-25                  ÆÐÅ°Áö Ãß°¡, ÁÖ¼® ÀÛ¼º
 *   ±èÇÑµ¿       1.1.0.   2018-05-29                  µî·Ï ¹× Ãë¼Ò ¹öÆ° È°¼ºÈ­
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RegiListUI extends JFrame {
	
	static String TodoName;
	static String Subject;
	static int DeadLineYear;
	static int DeadLineMonth;
	static int DeadLineDay;
	static int EndYear;
	static int EndMonth;
	static int EndDay;
	static int CompleteRate;
	static int ImportantRate;
	static int AlarmCheck;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField subjectTextField;

	public RegiListUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700,500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 682, 80);
		contentPane.add(panel);
		
		JLabel lblTodo = new JLabel("TO-DO \uB4F1\uB85D");
		lblTodo.setForeground(Color.WHITE);
		lblTodo.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 45));
		panel.add(lblTodo);
		
		textField = new JTextField();
		textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField.setBounds(250, 120, 210, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		subjectTextField = new JTextField();
		subjectTextField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		subjectTextField.setBounds(250, 160, 210, 30);
		contentPane.add(subjectTextField);
		subjectTextField.setColumns(10);
		
		JLabel txtrTt = new JLabel();
		txtrTt.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtrTt.setText("To-do \uBA85");
		txtrTt.setBounds(100, 120, 109, 24);
		contentPane.add(txtrTt);
		
		JLabel textArea_1 = new JLabel();
		textArea_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textArea_1.setText("\uACFC\uBAA9\uC120\uD0DD");
		textArea_1.setBounds(100, 160, 109, 24);
		contentPane.add(textArea_1);
		
		JLabel textArea_2 = new JLabel();
		textArea_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textArea_2.setText("\uB9C8\uAC10\uAE30\uD55C");
		textArea_2.setBounds(100, 200, 109, 24);
		contentPane.add(textArea_2);
		
		JLabel textArea_3 = new JLabel();
		textArea_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textArea_3.setText("\uC2E4\uC81C\uB9C8\uAC10\uC77C");
		textArea_3.setBounds(100, 240, 109, 24);
		contentPane.add(textArea_3);
		
		JLabel textArea_4 = new JLabel();
		textArea_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textArea_4.setText("\uC911\uC694\uB3C4");
		textArea_4.setBounds(100, 280, 109, 24);
		contentPane.add(textArea_4);
		
		JLabel textArea_5 = new JLabel();
		textArea_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textArea_5.setText("\uC644\uB8CC\uB3C4");
		textArea_5.setBounds(100, 320, 109, 24);
		contentPane.add(textArea_5);
		
		JLabel textArea_6 = new JLabel();
		textArea_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textArea_6.setText("\uC54C\uB9BC\uC124\uC815");
		textArea_6.setBounds(100, 360, 109, 24);
		contentPane.add(textArea_6);
		
		//Áß¿äµµ ÄÞº¸¹Ú½º
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u2606\u2606\u2606\u2606\u2606", "\u2605\u2606\u2606\u2606\u2606", "\u2605\u2605\u2606\u2606\u2606", "\u2605\u2605\u2605\u2606\u2606", "\u2605\u2605\u2605\u2605\u2606", "\u2605\u2605\u2605\u2605\u2605"}));
		comboBox.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(250, 280, 135, 24);
		contentPane.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		
		//¿Ï·áµµ ÄÞº¸¹Ú½º
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u2606\u2606\u2606\u2606\u2606", "\u2605\u2606\u2606\u2606\u2606", "\u2605\u2605\u2606\u2606\u2606", "\u2605\u2605\u2605\u2606\u2606", "\u2605\u2605\u2605\u2605\u2606", "\u2605\u2605\u2605\u2605\u2605"}));
		comboBox_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(250, 320, 135, 24);
		contentPane.add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		
		//¾Ë¶÷¿©ºÎ ÄÞº¸¹Ú½º
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uC788\uC74C", "\uC5C6\uC74C"}));
		comboBox_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(250, 360, 60, 24);
		contentPane.add(comboBox_2);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		
		JButton todoRegiBtn = new JButton("\uB4F1\uB85D");
		todoRegiBtn.setForeground(Color.WHITE);
		todoRegiBtn.setBackground(Color.DARK_GRAY);
		todoRegiBtn.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		todoRegiBtn.setBounds(502, 313, 109, 30);
		contentPane.add(todoRegiBtn);
		
		JButton cancelBtn = new JButton("\uCDE8\uC18C");
		cancelBtn.setForeground(Color.WHITE);
		cancelBtn.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		cancelBtn.setBackground(Color.DARK_GRAY);
		cancelBtn.setBounds(502, 354, 109, 30);
		contentPane.add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainUI backToMain = new MainUI();
				backToMain.setVisible(true);
				dispose();
			}
		});
		
		//¸¶°¨±âÇÑ ÄÞº¸¹Ú½º
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022"}));
		comboBox_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(250, 200, 60, 30);
		contentPane.add(comboBox_3);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(340, 200, 45, 30);
		contentPane.add(comboBox_4);
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(415, 200, 45, 30);
		contentPane.add(comboBox_5);
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		
		JLabel textArea = new JLabel();
		textArea.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea.setText("\uB144");
		textArea.setBounds(310, 200, 30, 30);
		contentPane.add(textArea);
		
		JLabel textArea_7 = new JLabel();
		textArea_7.setText("\uC6D4");
		textArea_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_7.setBounds(385, 200, 30, 30);
		contentPane.add(textArea_7);
		
		JLabel textArea_8 = new JLabel();
		textArea_8.setText("\uC77C");
		textArea_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_8.setBounds(470, 200, 30, 30);
		contentPane.add(textArea_8);
		
		//½ÇÁ¦¸¶°¨ÀÏ ÄÞº¸¹Ú½º
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022"}));
		comboBox_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(250, 240, 60, 30);
		contentPane.add(comboBox_6);
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		
		JLabel textArea_9 = new JLabel();
		textArea_9.setText("\uB144");
		textArea_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_9.setBounds(310, 240, 30, 30);
		contentPane.add(textArea_9);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_7.setBackground(Color.WHITE);
		comboBox_7.setBounds(340, 240, 45, 30);
		contentPane.add(comboBox_7);
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		
		JLabel textArea_10 = new JLabel();
		textArea_10.setText("\uC6D4");
		textArea_10.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_10.setBounds(385, 240, 30, 30);
		contentPane.add(textArea_10);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_8.setBackground(Color.WHITE);
		comboBox_8.setBounds(415, 240, 45, 30);
		contentPane.add(comboBox_8);
		comboBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JComboBox cb = (JComboBox)arg0.getSource();
				int index = cb.getSelectedIndex();
			}
		});
		JLabel textArea_11 = new JLabel();
		textArea_11.setText("\uC77C");
		textArea_11.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_11.setBounds(470, 240, 30, 30);
		contentPane.add(textArea_11);
		
		todoRegiBtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			TodoName = textField.getText();
			Subject = subjectTextField.getText();
			DeadLineYear = comboBox_3.getSelectedIndex();
			DeadLineMonth = comboBox_4.getSelectedIndex();
			DeadLineDay = comboBox_5.getSelectedIndex();
			EndYear = comboBox_6.getSelectedIndex();
			EndMonth = comboBox_7.getSelectedIndex();
			EndDay = comboBox_8.getSelectedIndex();
			CompleteRate = comboBox_1.getSelectedIndex();
			ImportantRate = comboBox.getSelectedIndex();
			AlarmCheck = comboBox_2.getSelectedIndex();
			
//			//ÀÔ·Â°ª Áß null°ªÀÌ ¾øÀ» °æ¿ì °ú¸ñÀ» µ¥ÀÌÅÍº£ÀÌ½º¿¡ µî·ÏÇÏ°í ¸ÞÀÎÈ­¸éÀ¸·Î µ¹¾Æ°¨
//			if(InputSubject.length() == 0 | InputProfessor.length() == 0 | InputSubjectYear.length() == 0 | InputSubjectSem.length() == 0 | InputSubjectStart.length() == 0 | InputSubjectEnd.length() == 0 | InputRoom.length() == 0 ) {
//				ReEnterRequest noNull = new ReEnterRequest();
//				noNull.setVisible(true);
//			}
//			else {
//				// ÇÐ±â°¡ 1~4, ½Ã°£ÀÌ 0~24½Ã ¹üÀ§¾È¿¡ ¾øÀ» °æ¿ì, ½ÃÀÛ½Ã°£ÀÌ Á¾·á½Ã°£º¸´Ù ºü¸¥ °æ¿ì ¿¹¿ÜÃ³¸®
//				if((Integer.parseInt(InputSubjectSem) < 1 || Integer.parseInt(InputSubjectSem) > 4) ||
//						(Integer.parseInt(InputSubjectStart) < 0 || Integer.parseInt(InputSubjectStart) > 24) ||
//						(Integer.parseInt(InputSubjectEnd) < 0 || Integer.parseInt(InputSubjectEnd) > 24) ||
//						(Integer.parseInt(InputSubjectStart) > Integer.parseInt(InputSubjectEnd))) {
//					InputTypeErrorUI typeError = new InputTypeErrorUI();
//					typeError.setVisible(true);
//					dispose();
//				}
//				else {
					TodoDB todoDB = new TodoDB();
					todoDB.TodoData(TodoName, Subject, DeadLineYear+2018, DeadLineMonth+1, DeadLineDay+1, EndYear+2018, EndMonth+1, EndDay+1, CompleteRate*2, ImportantRate*2, AlarmCheck);

					//RegiSuccess successMessage = new RegiSuccess();
					//successMessage.setVisible(true);
					//dispose();
					
					MainUI backToMain = new MainUI();
					backToMain.setVisible(true);
					dispose();
				}
			//}
		//}
	});
		
		/*°ú¸ñ¼±ÅÃ ÄÞº¸¹Ú½º
		try {
			int dbSize = 0;
			int dbCount = 0;
			String sQl;
			Connection cOnn = null;
			Statement st = null;
			ResultSet rs = null;
			
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
			
			st = cOnn.createStatement();
			sQl = "USE SubjectDB";
			st.execute(sQl);
			rs = st.executeQuery("SELECT Subject FROM SubjectData");
			
			while(rs.next()) {
				Subject = rs.getString("Subject");
				JComboBox comboBox_9 = new JComboBox();//(new String [dbCount]);
				for( ; dbCount < dbSize ; dbCount++) {
					comboBox_9.addItem(subject[dbCount] = Subject);
				}
				comboBox_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
				comboBox_9.setBackground(Color.WHITE);
				comboBox_9.setBounds(250, 160, 210, 30);
				contentPane.add(comboBox_9);
			
//				rs.close();
//				st.close();
			}
		} catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}*/
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegiListUI frame = new RegiListUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}