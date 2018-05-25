/**
 * title : MainUI.java
 * author : ±Ë«—µø (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : Main UI π◊ ∏ﬁº“µÂ ≈¨∑°Ω∫
 * -----------------------------------
 * history
 *   author  version     date                                                    brief
 *   æ»µø¡÷       0.0.0.   2018-05-25                                                √ æ» ¿€º∫
 *   ±Ë«—µø       1.0.0.   2018-05-25                                            ∆–≈∞¡ˆ»≠ π◊ ¡÷ºÆ √ﬂ∞°
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSplitPane;

public class MainUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 607);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("+");
		button.setBounds(41, 523, 41, 27);
		contentPane.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 30));
		textArea.setForeground(Color.WHITE);
		textArea.setText("\uC804\uCCB4 \uD560 \uC77C");
		textArea.setBounds(14, 12, 241, 41);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		btnNewButton.setBounds(498, 519, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		btnNewButton_1.setBounds(632, 519, 45, 30);
		contentPane.add(btnNewButton_1);
		
		Checkbox checkbox = new Checkbox("\uC644\uB8CC\uB41C \uD56D\uBAA9\uB3C4 \uD45C\uC2DC");
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox.setBounds(110, 520, 180, 30);
		contentPane.add(checkbox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"black", "red", "green", "blue"}));
		comboBox.setBounds(403, 520, 70, 30);
		contentPane.add(comboBox);
		
		JTextPane txtpnX = new JTextPane();
		txtpnX.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		txtpnX.setText("\uD14C\uB9C8\uC0C9 \uC120\uD0DD");
		txtpnX.setBounds(296, 520, 90, 30);
		contentPane.add(txtpnX);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 731, 67);
		contentPane.add(panel);
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC911\uC694\uB3C4\uC21C \uC815\uB82C", "\uC2E4\uC81C\uB9C8\uAC10\uC77C \uC815\uB82C", "\uB9C8\uAC10\uAE30\uD55C \uC815\uB82C"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 15));
		table_1 = new JTable();
		table_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		table_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "To-Do List", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC18C\uD504\uD2B8\uC6E8\uC5B4\uACF5\uD559"},
				{"\uB370\uC774\uD130\uBCA0\uC774\uC2A4"},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"To-Do List"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(116);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setBounds(14, 79, 90, 471);
		table_1.setRowHeight(40);
		contentPane.add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(108, 79, 623, 433);
		contentPane.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"<\uC18C\uD504\uD2B8\uC6E8\uC5B4 \uACF5\uD559> UI \uC124\uACC4\uC11C \uC791\uC131 \uB9C8\uAC10\uAE30\uD55C: 18.05.04 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.04 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5"},
				{"<\uB370\uC774\uD130\uBCA0\uC774\uC2A4> SQL\uACFC\uC81C \uB9C8\uAC10\uAE30\uD55C: 18.06.12 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.06.13 \uC911\uC694\uB3C4: 4 \uC644\uB8CC\uB3C4: 3"},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				""
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.setRowHeight(30);
		table_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 18));
		table_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		table_2.setRowHeight(60);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
