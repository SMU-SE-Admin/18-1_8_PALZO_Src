/**
 * title : MainUI.java
 * author : ±èÇÑµ¿ (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : Main UI ¹× ¸Þ¼Òµå Å¬·¡½º
 * -----------------------------------
 * history
 *   author  version     date                                                    brief
 *   ¾Èµ¿ÁÖ       0.0.0.   2018-05-25                                                ÃÊ¾È ÀÛ¼º
 *   ±èÇÑµ¿       1.0.0.   2018-05-25                                            ÆÐÅ°ÁöÈ­ ¹× ÁÖ¼® Ãß°¡
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI extends JFrame {

	private JPanel ContentBtn;
	private JTable table;

	/**
	 * Launch the application.
	 */
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
		setBounds(100, 100, 749, 607);
		ContentBtn = new JPanel();
		ContentBtn.setBackground(Color.WHITE);
		ContentBtn.setBorder(new EmptyBorder(5, 5, 5, 5));
		ContentBtn.setLayout(null);
		setContentPane(ContentBtn);
		
		JButton TodoBtn = new JButton("+");
		TodoBtn.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		TodoBtn.setBounds(41, 523, 45, 30);
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
		LogoutbBtn.setBounds(498, 519, 100, 30);
		ContentBtn.add(LogoutbBtn);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton_1.setBounds(632, 519, 45, 30);
		ContentBtn.add(btnNewButton_1);
		
		Checkbox checkbox = new Checkbox("\uC644\uB8CC\uB41C \uD56D\uBAA9\uB3C4 \uD45C\uC2DC");
		checkbox.setFont(new Font("Dialog", Font.PLAIN, 18));
		checkbox.setBounds(110, 520, 180, 30);
		ContentBtn.add(checkbox);
		
		JComboBox ColorChange = new JComboBox();
		ColorChange.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		ColorChange.setModel(new DefaultComboBoxModel(new String[] {"black", "red", "green", "blue"}));
		ColorChange.setBounds(403, 520, 70, 30);
		ContentBtn.add(ColorChange);
		
		JTextPane txtpnX = new JTextPane();
		txtpnX.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		txtpnX.setText("\uD14C\uB9C8\uC0C9 \uC120\uD0DD");
		txtpnX.setBounds(296, 520, 90, 30);
		ContentBtn.add(txtpnX);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 731, 67);
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
		
		JButton ContentBtn1 = new JButton("\uB0B4\uC6A9");
		ContentBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ContentBtn1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ContentBtn1.setBackground(Color.WHITE);
		ContentBtn1.setBounds(200, 100, 500, 60);
		ContentBtn.add(ContentBtn1);
		
		JButton ContentBtn2 = new JButton("\uB0B4\uC6A9");
		ContentBtn2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ContentBtn2.setBackground(Color.WHITE);
		ContentBtn2.setBounds(200, 160, 500, 60);
		ContentBtn.add(ContentBtn2);
		
		JButton ContentBtn3 = new JButton("");
		ContentBtn3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ContentBtn3.setBackground(Color.WHITE);
		ContentBtn3.setBounds(200, 220, 500, 60);
		ContentBtn.add(ContentBtn3);
		
		JButton ContentBtn4 = new JButton("");
		ContentBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ContentBtn4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ContentBtn4.setBackground(Color.WHITE);
		ContentBtn4.setBounds(200, 280, 500, 60);
		ContentBtn.add(ContentBtn4);
		
		JButton ContentBtn5 = new JButton("");
		ContentBtn5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		ContentBtn5.setBackground(Color.WHITE);
		ContentBtn5.setBounds(200, 340, 500, 60);
		ContentBtn.add(ContentBtn5);
	}
}
