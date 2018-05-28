/**
 * title : MainUI.java
 * author : ±èÇÑµ¿ (aggsae@gmail.com)
 * version : 2.1.0.
 * since : 2018 - 05 - 07
 * brief : Main UI ¹× ¸Þ¼Òµå Å¬·¡½º
 * -----------------------------------
 * history
 *   author  version     date                                                    brief
 *   ¾Èµ¿ÁÖ       0.0.0.   2018-05-25                                                ÃÊ¾È ÀÛ¼º
 *   ±èÇÑµ¿       1.0.0.   2018-05-25                                            ÆÐÅ°ÁöÈ­ ¹× ÁÖ¼® Ãß°¡
 *   ¾Èµ¿ÁÖ       1.1.0.   2018-05-25                                              MainUI ¼öÁ¤
 *   ±èÇÑµ¿       2.0.0.   2018-05-26                                          °ú¸ñµî·Ï ¹öÆ° ±â´É È°¼ºÈ­
 *   ±èÇÑµ¿       2.1.0.   2018-05-26                              ·Î±×¾Æ¿ô ¹öÆ° ±â´É È°¼ºÈ­, to do Ç×¸ñ µî·Ï ¹öÆ° ±â´É È°¼ºÈ­
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
<<<<<<< HEAD

=======
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
>>>>>>> branch 'master' of https://github.com/SMU-SE-Admin/18-1_8_PALZO_Src.git
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.Scrollbar;
import java.awt.Checkbox;
import java.awt.Font;
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
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
<<<<<<< HEAD
import com.jgoodies.forms.factories.DefaultComponentFactory;
=======
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
>>>>>>> branch 'master' of https://github.com/SMU-SE-Admin/18-1_8_PALZO_Src.git
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI extends JFrame {

	private JPanel ContentBtn;
	private JTable table;

<<<<<<< HEAD
	/**
	 * Launch the application.
	 */
=======
	public MainUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 607);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton regiSubButton = new JButton("+");
		regiSubButton.setBounds(41, 523, 41, 27);
		contentPane.add(regiSubButton);
		
		JLabel titleArea = new JLabel();
		titleArea.setBackground(Color.DARK_GRAY);
		titleArea.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
		titleArea.setForeground(Color.WHITE);
		titleArea.setText("To do List");
		titleArea.setBounds(14, 12, 241, 41);
		contentPane.add(titleArea);
		
		JButton logoutButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		logoutButton.setBounds(498, 519, 100, 30);
		contentPane.add(logoutButton);
		
		JButton regiListButton = new JButton("+");
		regiListButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		regiListButton.setBounds(632, 519, 45, 30);
		contentPane.add(regiListButton);
		
		Checkbox checkbox = new Checkbox("\uC644\uB8CC\uB41C \uD56D\uBAA9\uB3C4 \uD45C\uC2DC");
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox.setBounds(110, 520, 180, 30);
		contentPane.add(checkbox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"black", "red", "green", "blue"}));
		comboBox.setBounds(403, 520, 70, 30);
		contentPane.add(comboBox);
		
		JTextPane txtpnX = new JTextPane();
		txtpnX.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
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
		comboBox_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		
		
		table_1 = new JTable(); //ToDoList ÁÂÃø
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"To-DO List"},
				{"\uB370\uC774\uD130\uBCA0\uC774\uC2A4"},
				{"\uC18C\uD504\uD2B8\uC6E8\uC5B4\uACF5\uD559"},
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
		table_1.setBounds(14, 90, 90, 460);
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
		table_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		table_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		table_2.setRowHeight(60);
		
		regiSubButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegiSubjectUI regiSubUI = new RegiSubjectUI();
				regiSubUI.setVisible(true);
				dispose();
			}
		});
		
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginUI backToLogin = new LoginUI();
				backToLogin.setVisible(true);
				dispose();
			}
		});
		
		regiListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegiListUI regiTodoUI = new RegiListUI();
				regiTodoUI.setVisible(true);
				dispose();
			}
		});
	}
	
>>>>>>> branch 'master' of https://github.com/SMU-SE-Admin/18-1_8_PALZO_Src.git
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

	/**
	 * Create the frame.
	 */
public MainUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 850, 600);
	ContentBtn = new JPanel();
	ContentBtn.setBackground(Color.WHITE);
	ContentBtn.setBorder(new EmptyBorder(5, 5, 5, 5));
	ContentBtn.setLayout(null);
	setContentPane(ContentBtn);
	
	JButton TodoBtn = new JButton("+");
	TodoBtn.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
	TodoBtn.setBounds(60, 520, 45, 30);
	ContentBtn.add(TodoBtn);
	
	JTextArea textArea = new JTextArea();
	textArea.setBackground(Color.DARK_GRAY);
	textArea.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
	textArea.setForeground(Color.WHITE);
	textArea.setText("\uC804\uCCB4 \uD560 \uC77C");
	textArea.setBounds(14, 12, 241, 41);
	ContentBtn.add(textArea);
	
	JButton LogoutbBtn = new JButton("\uB85C\uADF8\uC544\uC6C3");
	LogoutbBtn.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
	LogoutbBtn.setBounds(610, 520, 100, 30);
	ContentBtn.add(LogoutbBtn);
	
	JButton btnNewButton_1 = new JButton("+");
	btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
	btnNewButton_1.setBounds(750, 520, 45, 30);
	ContentBtn.add(btnNewButton_1);
	
	Checkbox checkbox = new Checkbox("\uC644\uB8CC\uB41C \uD56D\uBAA9\uB3C4 \uD45C\uC2DC");
	checkbox.setFont(new Font("Dialog", Font.PLAIN, 18));
	checkbox.setBounds(153, 520, 180, 30);
	ContentBtn.add(checkbox);
	
	JComboBox ColorChange = new JComboBox();
	ColorChange.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
	ColorChange.setModel(new DefaultComboBoxModel(new String[] {"black", "red", "green", "blue"}));
	ColorChange.setBounds(450, 520, 100, 30);
	ContentBtn.add(ColorChange);
	
	JTextPane txtpnX = new JTextPane();
	txtpnX.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
	txtpnX.setText("\uD14C\uB9C8\uC0C9 \uC120\uD0DD");
	txtpnX.setBounds(350, 520, 90, 30);
	ContentBtn.add(txtpnX);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.DARK_GRAY);
	panel.setBounds(0, 0, 832, 67);
	ContentBtn.add(panel);
	
	JComboBox comboBox_1 = new JComboBox();
	panel.add(comboBox_1);
	comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC911\uC694\uB3C4\uC21C \uC815\uB82C", "\uC2E4\uC81C\uB9C8\uAC10\uC77C \uC815\uB82C", "\uB9C8\uAC10\uAE30\uD55C \uC815\uB82C"}));
	comboBox_1.setForeground(Color.BLACK);
	comboBox_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		
		JButton ToDoBtn1 = new JButton("\uC18C\uD504\uD2B8\uC6E8\uC5B4 \uACF5\uD559"); //todolist Ã¹¹ø¤Š¹öÆ°
		ToDoBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ToDoBtn1.setBackground(Color.WHITE);
		ToDoBtn1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ToDoBtn1.setBounds(15, 130, 150, 40);
		ContentBtn.add(ToDoBtn1);
		
		JLabel lblNewLabel = new JLabel("To-Do List");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		lblNewLabel.setBounds(15, 100, 150, 30);
		ContentBtn.add(lblNewLabel);
		
		JButton ToDoBtn2 = new JButton("\uC720\uB2C9\uC2A4\uD504\uB85C\uADF8\uB798\uBC0D");//µÎ¹ø¤Š¹öÆ°
		ToDoBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToDoBtn2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ToDoBtn2.setBackground(Color.WHITE);
		ToDoBtn2.setBounds(15, 170, 150, 40);
		ContentBtn.add(ToDoBtn2);
		
		JButton ToDoBtn3 = new JButton("\uC54C\uACE0\uB9AC\uC998");//¼¼¹øÂ°
		ToDoBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToDoBtn3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ToDoBtn3.setBackground(Color.WHITE);
		ToDoBtn3.setBounds(15, 210, 150, 40);
		ContentBtn.add(ToDoBtn3);
		
		JButton ToDoBtn4 = new JButton("\uB370\uC774\uD130\uBCA0\uC774\uC2A4");//³×¹øÂ°
		ToDoBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToDoBtn4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ToDoBtn4.setBackground(Color.WHITE);
		ToDoBtn4.setBounds(14, 250, 150, 40);
		ContentBtn.add(ToDoBtn4);
		
		JButton ToDoBtn5 = new JButton("\uC0AC\uD68C\uBD09\uC0AC");//´Ù¼¸¹øÂ°
		ToDoBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToDoBtn5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ToDoBtn5.setBackground(Color.WHITE);
		ToDoBtn5.setBounds(15, 290, 150, 40);
		ContentBtn.add(ToDoBtn5);
		
		JButton ToDoBtn6 = new JButton("\uB304\uC2A4\uC2A4\uD3EC\uCE20");//¿©¼¸¹øÂ°
		ToDoBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ToDoBtn6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ToDoBtn6.setBackground(Color.WHITE);
		ToDoBtn6.setBounds(15, 330, 150, 40);
		ContentBtn.add(ToDoBtn6);
		
		
		
		JButton ContentBtn1 = new JButton("<\uC18C\uD504\uD2B8\uC6E8\uC5B4\uACF5\uD559> UI\uC124\uACC4\uC11C \uC791\uC131 \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
		ContentBtn1.setHorizontalAlignment(SwingConstants.LEFT);
		ContentBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ContentBtn1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		ContentBtn1.setBackground(Color.WHITE);
		ContentBtn1.setBounds(200, 100, 600, 60);
		ContentBtn.add(ContentBtn1);
		
		JButton ContentBtn4 = new JButton("<\uC54C\uACE0\uB9AC\uC998> greedy\uC54C\uACE0\uB9AC\uC998 \uACFC\uC81C \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.02 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.04 \uC911\uC694\uB3C4: 4 \uC644\uB8CC\uB3C4: 5");
		ContentBtn4.setHorizontalAlignment(SwingConstants.LEADING);
		ContentBtn4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		ContentBtn4.setBackground(Color.WHITE);
		ContentBtn4.setBounds(200, 280, 600, 60);
		ContentBtn.add(ContentBtn4);
		
		JButton ContentBtn2 = new JButton("<\uB370\uC774\uD130\uBCA0\uC774\uC2A4> \uACFC\uC81C3 \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
		ContentBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ContentBtn2.setHorizontalAlignment(SwingConstants.LEADING);
		ContentBtn2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		ContentBtn2.setBackground(Color.WHITE);
		ContentBtn2.setBounds(200, 160, 600, 60);
		ContentBtn.add(ContentBtn2);
		
		JButton ContentBtn3 = new JButton("<\uC0AC\uD68C\uBD09\uC0AC> \uB178\uC778\uB3D5\uAE30 \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
		ContentBtn3.setHorizontalAlignment(SwingConstants.LEADING);
		ContentBtn3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		ContentBtn3.setBackground(Color.WHITE);
		ContentBtn3.setBounds(200, 220, 600, 60);
		ContentBtn.add(ContentBtn3);
		
		JButton ContentBtn5 = new JButton("<\uC720\uB2C9\uC2A4\uD504\uB85C\uADF8\uB798\uBC0D> signal \uACFC\uC81C  \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
		ContentBtn5.setHorizontalAlignment(SwingConstants.LEADING);
		ContentBtn5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		ContentBtn5.setBackground(Color.WHITE);
		ContentBtn5.setBounds(200, 340, 600, 60);
		ContentBtn.add(ContentBtn5);
		
		JButton ContentBtn6 = new JButton("<\uC18C\uD504\uD2B8\uC6E8\uC5B4\uACF5\uD559> Class\uC124\uACC4\uC11C \uC791\uC131  \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 1 \uC644\uB8CC\uB3C4: 3");
		ContentBtn6.setHorizontalAlignment(SwingConstants.LEADING);
		ContentBtn6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		ContentBtn6.setBackground(Color.WHITE);
		ContentBtn6.setBounds(200, 400, 600, 60);
		ContentBtn.add(ContentBtn6);
	}
}
