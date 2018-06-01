/**
 * title : EditListUI.java
 * author : ±èÇÑµ¿ (aggsae@gmail.com)
 * version : 4.0.0.
 * since : 2018 - 05 - 07
 * brief : ÅõµÎ Ç×¸ñ ¼öÁ¤ UI
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   ¾Èµ¿ÁÖ       0.0.0.   2018-05-22                      ÃÊ¾È ÀÛ¼º
 *   ±èÇÑµ¿       1.0.0.   2018-05-25                  ÆÐÅ°Áö Ãß°¡, ÁÖ¼® ÀÛ¼º
 *   ±èÇÑµ¿       2.0.0.   2018-05-29          textpane ºÎºÐ label·Î ¼öÁ¤, ±â´É ±¸Çö
 *   ±èÇÑµ¿       2.1.0.   2018-05-30            ±âÁ¸ Ç×¸ñÀÇ Á¤º¸¸¦ ÀÐ¾îµéÀÌ´Â ºÎºÐ Ãß°¡
 *   ±èÇÑµ¿       2.2.0.   2018-05-30                    »èÁ¦ ±â´É ±¸Çö
 *   ±èÇÑµ¿       3.0.0.   2018-06-01              NULL ¹× Æ¯¼ö¹®ÀÚ¿¡ ´ëÇÑ ¿¹¿ÜÃ³¸®
 *   ±èÇÑµ¿       3.1.0.   2018-06-01      to do Ç×¸ñ ¼öÁ¤ÇÏÁö ¸øÇÏµµ·Ï Ã³¸®, ¿Ï·áµµ Ç¥½Ã Ç×¸ñ ¼öÁ¤
 *   ±èÇÑµ¿       4.0.0.   2018-06-01                     ÃÖÁ¾º» ÀÛ¼º
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class EditListUI extends JFrame {
	static String todoBtnName;
	
	static String todoName;
	static String subjectName;
	static int deadLineYear;
	static int deadLineMonth;
	static int deadLineDay;
	static int endYear;
	static int endMonth;
	static int endDay;
	static int completeRate;
	static int importantRate;
	static int alarmCheck;
	
	static String inputtodoName;
	static String inputsubjectName;
	static int inputdeadLineYear;
	static int inputdeadLineMonth;
	static int inputdeadLineDay;
	static int inputendYear;
	static int inputendMonth;
	static int inputendDay;
	static int inputcompleteRate;
	static int inputimportantRate;
	static int inputalarmCheck;
	
	private JPanel contentPane;
//	private JTextField textField;
	private JTextField textField_2;

	public EditListUI(String todoBtnName) {
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
		
		JLabel lblTodo = new JLabel("TO-DO \uBCC0\uACBD");
		lblTodo.setForeground(Color.WHITE);
		lblTodo.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 45));
		panel.add(lblTodo);
		
		//DB¿¬°áÇØ¼­ subjectBtnNameÀÏ ¶§ÀÇ °ªµéÀ» setText
		try {
			String sQl;
			Connection cOnn = null;
			Statement st = null;
			ResultSet rs = null;
			
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
			
			st = cOnn.createStatement();
			sQl = "USE TodoDB";
			st.execute(sQl);
			rs = st.executeQuery("SELECT * FROM TodoData");
			
			while(rs.next()) {
				todoName = rs.getString("TodoName");
				if(todoName.equals(todoBtnName)) {
					subjectName = rs.getString("Subject");
					deadLineYear = Integer.parseInt(rs.getString("DeadLineYear"));
					deadLineMonth = Integer.parseInt(rs.getString("DeadLineMonth"));
					deadLineDay = Integer.parseInt(rs.getString("DeadLineDay"));
					endYear = Integer.parseInt(rs.getString("EndYear"));
					endMonth = Integer.parseInt(rs.getString("EndMonth"));
					endDay = Integer.parseInt(rs.getString("EndDay"));
					completeRate = Integer.parseInt(rs.getString("CompleteRate"));
					importantRate = Integer.parseInt(rs.getString("ImportantRate"));
					alarmCheck = Integer.parseInt(rs.getString("AlarmCheck"));

				}
			}

			rs.close();
			st.close();
		} catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}

		JLabel textField = new JLabel();
		textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField.setText(todoBtnName);
		textField.setBounds(250, 120, 210, 25);
		contentPane.add(textField);
//		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_2.setText(subjectName);
		textField_2.setBounds(250, 160, 210, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
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
		comboBox.setSelectedIndex(importantRate/2);
		comboBox.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(250, 280, 135, 24);
		contentPane.add(comboBox);
		
		//¿Ï·áµµ ÄÞº¸¹Ú½º
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u2606\u2606\u2606\u2606\u2606", "\u2605\u2606\u2606\u2606\u2606", "\u2605\u2605\u2606\u2606\u2606", "\u2605\u2605\u2605\u2606\u2606", "\u2605\u2605\u2605\u2605\u2606", "\u2605\u2605\u2605\u2605\u2605"}));
		comboBox_1.setSelectedIndex(completeRate/2);
		comboBox_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(250, 320, 135, 24);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uC788\uC74C", "\uC5C6\uC74C"}));
		comboBox_2.setSelectedIndex(alarmCheck);
		comboBox_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(250, 360, 60, 24);
		contentPane.add(comboBox_2);
		
		//º¯°æ ¹öÆ°
		JButton btnNewButton = new JButton("\uBCC0\uACBD");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		btnNewButton.setBounds(500, 320, 100, 30);
		contentPane.add(btnNewButton);
		
		//Ãë¼Ò ¹öÆ°
		JButton button = new JButton("\uCDE8\uC18C");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(500, 360, 100, 30);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainUI backToMain = new MainUI();
				backToMain.setVisible(true);
				dispose();
			}
		});
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022"}));
		comboBox_3.setSelectedIndex(deadLineYear-2018);
		comboBox_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(250, 200, 60, 30);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_4.setSelectedIndex(deadLineMonth-1);
		comboBox_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(340, 200, 45, 30);
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_5.setSelectedIndex(deadLineDay-1);
		comboBox_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(415, 200, 45, 30);
		contentPane.add(comboBox_5);
		
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
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022"}));
		comboBox_6.setSelectedIndex(endYear-2018);
		comboBox_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(250, 240, 60, 30);
		contentPane.add(comboBox_6);
		
		JLabel textArea_9 = new JLabel();
		textArea_9.setText("\uB144");
		textArea_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_9.setBounds(310, 240, 30, 30);
		contentPane.add(textArea_9);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_7.setSelectedIndex(endMonth-1);
		comboBox_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_7.setBackground(Color.WHITE);
		comboBox_7.setBounds(340, 240, 45, 30);
		contentPane.add(comboBox_7);
		
		JLabel textArea_10 = new JLabel();
		textArea_10.setText("\uC6D4");
		textArea_10.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_10.setBounds(385, 240, 30, 30);
		contentPane.add(textArea_10);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_8.setSelectedIndex(endDay-1);
		comboBox_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_8.setBackground(Color.WHITE);
		comboBox_8.setBounds(415, 240, 45, 30);
		contentPane.add(comboBox_8);
		
		JLabel textArea_11 = new JLabel();
		textArea_11.setText("\uC77C");
		textArea_11.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textArea_11.setBounds(470, 240, 30, 30);
		contentPane.add(textArea_11);
		
		/*
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox_9.setBackground(Color.WHITE);
		comboBox_9.setBounds(250, 160, 210, 30);
		contentPane.add(comboBox_9);
		*/
		
		//»èÁ¦ ¹öÆ°
		JButton button_1 = new JButton("\uC0AD\uC81C");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(500, 280, 100, 30);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sQl;					
					Connection cOnn = null;
					Statement st = null;
					PreparedStatement pst = null;
					ResultSet rs = null;
					
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					
					st = cOnn.createStatement();
					sQl = "USE TodoDB";
					st.execute(sQl);
					rs = st.executeQuery("SELECT * FROM TodoData");
					
					while(rs.next()) {
						todoName = rs.getString("TodoName");
					
						if(todoBtnName.equals(todoName)) {
							sQl = "DELETE FROM TodoData WHERE TodoName =" + "\'" + todoName + "\'";
							st.execute(sQl);
						}
					}
					
					rs.close();
					st.close();
				} catch(ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				MainUI backToMain = new MainUI();
				backToMain.setVisible(true);
				dispose();
			}
		});
		
		//º¯°æ ¹öÆ°
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						String sQl;					
						Connection cOnn = null;
						Statement st = null;
						PreparedStatement pst = null;
						ResultSet rs = null;
						
						Class.forName(DBConn.forName);
						cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
						
						st = cOnn.createStatement();
						sQl = "USE TodoDB";
						st.execute(sQl);
						rs = st.executeQuery("SELECT * FROM TodoData");
						
						while(rs.next()) {
							inputtodoName = textField.getText();
							inputsubjectName = textField_2.getText();
							inputdeadLineYear = comboBox_3.getSelectedIndex();
							inputdeadLineMonth = comboBox_4.getSelectedIndex();
							inputdeadLineDay = comboBox_5.getSelectedIndex();
							inputendYear = comboBox_6.getSelectedIndex();
							inputendMonth = comboBox_7.getSelectedIndex();
							inputendDay = comboBox_8.getSelectedIndex();
							inputcompleteRate = comboBox_1.getSelectedIndex();
							inputimportantRate = comboBox.getSelectedIndex();
							inputalarmCheck = comboBox_2.getSelectedIndex();
							
							if(inputtodoName.length() == 0 || inputsubjectName.length() == 0) {
								ReEnterRequest noNull = new ReEnterRequest();
								noNull.setVisible(true);
								dispose();
							}
							else {
								if(inputtodoName.contains("\\") || inputtodoName.contains(":") || inputtodoName.contains(";") || inputtodoName.contains("|") || inputtodoName.contains("<") || inputtodoName.contains(",") || inputtodoName.contains("?") || inputtodoName.contains("\"") || inputtodoName.contains("'")) {
									InputTypeErrorUI noNull = new InputTypeErrorUI();
									noNull.setVisible(true);
								}
								else {
									new EditListActive(inputtodoName, inputsubjectName, inputdeadLineYear+2018, inputdeadLineMonth+1, inputdeadLineDay+1, inputendYear+2018, inputendMonth+1, inputendDay+1, inputcompleteRate*2, inputimportantRate*2, inputalarmCheck);
									MainUI successMessage = new MainUI();
									successMessage.setVisible(true);
									dispose();
								}
							}
							
							
							rs.close();
							st.close();
														
						}
				} catch(ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditListUI frame = new EditListUI(todoBtnName);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
