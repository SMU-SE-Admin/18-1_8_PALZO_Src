/**
 * title : MainUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 3.4.0.
 * since : 2018 - 05 - 07
 * brief : Main UI 및 메소드 클래스
 * -----------------------------------
 * history
 *   author  version     date                                                     brief
 *   안동주       0.0.0.   2018-05-25                                                 초안 작성
 *   김한동       1.0.0.   2018-05-25                                             패키지화 및 주석 추가
 *   안동주       1.1.0.   2018-05-25                                               MainUI 수정
 *   김한동       2.0.0.   2018-05-26                                           과목등록 버튼 기능 활성화
 *   김한동       2.1.0.   2018-05-26                              로그아웃 버튼 기능 활성화, to do 항목 등록 버튼 기능 활성화
 *   안동주       2.2.0.   2018-05-28                                             메인 UI 레이아웃 변경
 *   김한동       3.0.0.   2018-05-29                                        과목, Todo, 로그아웃 버튼 활성화
 *   김한동       3.1.0.   2018-05-29                                            색상 변경 이벤트 활성화
 *   김한동       3.2.0.   2018-05-29                                  반복문을 통해 데이터베이스에서 받아 과목 버튼 생성
 *   김한동       3.3.0.   2018-05-29                                  반복문을 통해 데이터베이스에서 받아 투두 버튼 생성
 *   김한동       3.4.0.   2018-05-30                                            과목 등록, 수정 기능 추가
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI extends JFrame {

	static String subjectBtnName;
	static String todoBtnName;
	private JPanel ContentBtn;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//MainUI 실험 시
					MainUI frame = new MainUI();
					frame.setVisible(true);
					//실제 실행할 때
					//LoginUI frame = new LoginUI();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 850, 600);
			ContentBtn = new JPanel();
			ContentBtn.setBackground(Color.WHITE);
			ContentBtn.setBorder(new EmptyBorder(5, 5, 5, 5));
			ContentBtn.setLayout(null);
			setContentPane(ContentBtn);
			
			JButton subRegiBtn = new JButton("+");
			subRegiBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			subRegiBtn.setBounds(60, 520, 45, 30);
			ContentBtn.add(subRegiBtn);
			subRegiBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					RegiSubjectUI regiSubject = new RegiSubjectUI();
					regiSubject.setVisible(true);
					dispose();
				}
			});
			
			JLabel textArea = new JLabel();
			textArea.setBackground(Color.DARK_GRAY);
			textArea.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
			textArea.setForeground(Color.WHITE);
			textArea.setText("\uC804\uCCB4 \uD560 \uC77C");
			textArea.setBounds(14, 12, 241, 41);
			ContentBtn.add(textArea);
			
			JButton LogoutbBtn = new JButton("\uB85C\uADF8\uC544\uC6C3");
			LogoutbBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			LogoutbBtn.setBounds(610, 520, 100, 30);
			ContentBtn.add(LogoutbBtn);
			LogoutbBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					LoginUI backToLogin = new LoginUI();
					backToLogin.setVisible(true);
					dispose();
				}
			});
			
			JButton regiTodoBtn = new JButton("+");
			regiTodoBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			regiTodoBtn.setBounds(750, 520, 45, 30);
			ContentBtn.add(regiTodoBtn);
			regiTodoBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					RegiListUI regiTodo = new RegiListUI();
					regiTodo.setVisible(true);
					dispose();
				}
			});
			
			Checkbox checkbox = new Checkbox("\uC644\uB8CC\uB41C \uD56D\uBAA9\uB3C4 \uD45C\uC2DC");
			checkbox.setFont(new Font("Dialog", Font.PLAIN, 18));
			checkbox.setBounds(153, 520, 180, 30);
			ContentBtn.add(checkbox);
			
			//여기가 색 변하는 부분
			JPanel panel = new JPanel();
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(0, 0, 832, 67);
			ContentBtn.add(panel);
			
			JComboBox ColorChange = new JComboBox();
			ColorChange.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			ColorChange.setModel(new DefaultComboBoxModel(new String[] {"black", "red", "green", "blue"}));
			ColorChange.setBounds(450, 520, 100, 30);
			ContentBtn.add(ColorChange);
			ColorChange.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JComboBox cb = (JComboBox)arg0.getSource();
					int index = cb.getSelectedIndex();
					
					if(index == 0) {
						panel.setBackground(Color.DARK_GRAY);
					}
					if(index == 1) {
						panel.setBackground(Color.RED);
					}
					if(index == 2) {
						panel.setBackground(Color.GREEN);
					}
					if(index == 3) {
						panel.setBackground(Color.BLUE);
					}
				}
			});
			
			JTextPane txtpnX = new JTextPane();
			txtpnX.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			txtpnX.setText("\uD14C\uB9C8\uC0C9 \uC120\uD0DD");
			txtpnX.setBounds(350, 520, 90, 30);
			ContentBtn.add(txtpnX);
			
			//정렬 콤보박스
			JComboBox comboBox_1 = new JComboBox();
			panel.add(comboBox_1);
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC911\uC694\uB3C4\uC21C \uC815\uB82C", "\uC2E4\uC81C\uB9C8\uAC10\uC77C \uC815\uB82C", "\uB9C8\uAC10\uAE30\uD55C \uC815\uB82C"}));
			comboBox_1.setForeground(Color.BLACK);
			comboBox_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			
			JLabel lblNewLabel = new JLabel("To-Do List");
			lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
			lblNewLabel.setBounds(15, 100, 150, 30);
			ContentBtn.add(lblNewLabel);
			
			try {
					String sQl;
					Connection cOnn = null;
					Statement st = null;
					ResultSet rs = null;
					int changePosition = 0;
					int i = 0;
					
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					
					st = cOnn.createStatement();
					sQl = "USE SubjectDB";
					st.execute(sQl);
					rs = st.executeQuery("SELECT Subject FROM SubjectData");
					
					while(rs.next()) {
						subjectBtnName = rs.getString("Subject");

						//과목 버튼 생성
						JButton subBtn = new JButton(subjectBtnName);//("\uC18C\uD504\uD2B8\uC6E8\uC5B4 \uACF5\uD559"); //todolist 첫번쨰버튼
						subBtn.setBackground(Color.WHITE);
						subBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
						subBtn.setBounds(15, 130+changePosition, 150, 40);
						changePosition+=40;
						ContentBtn.add(subBtn);
						subBtn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String buttonName  =arg0.getSource().toString().split("text=")[1].split(",")[0];
								ModSubjectUI modSubject = new ModSubjectUI(buttonName);
								modSubject.setVisible(true);
								dispose();
							}
						});
						
					}
					rs.close();
					st.close();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			
			/*
			JButton ToDoBtn2 = new JButton("\uC720\uB2C9\uC2A4\uD504\uB85C\uADF8\uB798\uBC0D");//두번쨰버튼
			ToDoBtn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			ToDoBtn2.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
			ToDoBtn2.setBackground(Color.WHITE);
			ToDoBtn2.setBounds(15, 170, 150, 40);
			ContentBtn.add(ToDoBtn2);
			
			JButton ToDoBtn3 = new JButton("\uC54C\uACE0\uB9AC\uC998");//세번째
			ToDoBtn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			ToDoBtn3.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
			ToDoBtn3.setBackground(Color.WHITE);
			ToDoBtn3.setBounds(15, 210, 150, 40);
			ContentBtn.add(ToDoBtn3);
			
			JButton ToDoBtn4 = new JButton("\uB370\uC774\uD130\uBCA0\uC774\uC2A4");//네번째
			ToDoBtn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			ToDoBtn4.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
			ToDoBtn4.setBackground(Color.WHITE);
			ToDoBtn4.setBounds(14, 250, 150, 40);
			ContentBtn.add(ToDoBtn4);
			
			JButton ToDoBtn5 = new JButton("\uC0AC\uD68C\uBD09\uC0AC");//다섯번째
			ToDoBtn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			ToDoBtn5.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
			ToDoBtn5.setBackground(Color.WHITE);
			ToDoBtn5.setBounds(15, 290, 150, 40);
			ContentBtn.add(ToDoBtn5);
			
			JButton ToDoBtn6 = new JButton("\uB304\uC2A4\uC2A4\uD3EC\uCE20");//여섯번째
			ToDoBtn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			ToDoBtn6.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
			ToDoBtn6.setBackground(Color.WHITE);
			ToDoBtn6.setBounds(15, 330, 150, 40);
			ContentBtn.add(ToDoBtn6);
			*/
			//todo목록 진행 중
			try {
				String todoSubject;
				int todoDeadLineYear;
				int todoDeadLineMonth;
				int todoDeadLineDay;
				int todoEndYear;
				int todoEndMonth;
				int todoEndDay;
				int todoComplete;
				int todoImportant;
				int todoAlarm;
				
				String sQl;
				Connection cOnn = null;
				Statement st = null;
				ResultSet rs = null;
				int changePosition = 0;
				int i = 0;
				
				Class.forName(DBConn.forName);
				cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
				
				st = cOnn.createStatement();
				sQl = "USE TodoDB";
				st.execute(sQl);
				rs = st.executeQuery("SELECT * FROM TodoData");
				
				while(rs.next()) {
					todoBtnName = rs.getString("TodoName");

					//과목 버튼 생성
					JButton ToDoBtn1 = new JButton(todoBtnName);//("\uC18C\uD504\uD2B8\uC6E8\uC5B4 \uACF5\uD559"); //todolist 첫번쨰버튼
					ToDoBtn1.setBackground(Color.WHITE);
					ToDoBtn1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
					ToDoBtn1.setBounds(200, 100+changePosition, 600, 60);
					changePosition+=60;
					ContentBtn.add(ToDoBtn1);
					ToDoBtn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							String buttonName  =arg0.getSource().toString().split("text=")[1].split(",")[0];
							EditListUI editList = new EditListUI(buttonName);
							editList.setVisible(true);
							dispose();
						}
					});
				}
				rs.close();
				st.close();
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
			/*
			JButton ContentBtn1 = new JButton("<\uC18C\uD504\uD2B8\uC6E8\uC5B4\uACF5\uD559> UI\uC124\uACC4\uC11C \uC791\uC131 \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
			ContentBtn1.setHorizontalAlignment(SwingConstants.LEFT);
			ContentBtn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			ContentBtn1.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			ContentBtn1.setBackground(Color.WHITE);
			ContentBtn1.setBounds(200, 100, 600, 60);
			ContentBtn.add(ContentBtn1);
			
			JButton ContentBtn4 = new JButton("<\uC54C\uACE0\uB9AC\uC998> greedy\uC54C\uACE0\uB9AC\uC998 \uACFC\uC81C \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.02 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.04 \uC911\uC694\uB3C4: 4 \uC644\uB8CC\uB3C4: 5");
			ContentBtn4.setHorizontalAlignment(SwingConstants.LEADING);
			ContentBtn4.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			ContentBtn4.setBackground(Color.WHITE);
			ContentBtn4.setBounds(200, 280, 600, 60);
			ContentBtn.add(ContentBtn4);
			
			JButton ContentBtn2 = new JButton("<\uB370\uC774\uD130\uBCA0\uC774\uC2A4> \uACFC\uC81C3 \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
			ContentBtn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			ContentBtn2.setHorizontalAlignment(SwingConstants.LEADING);
			ContentBtn2.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			ContentBtn2.setBackground(Color.WHITE);
			ContentBtn2.setBounds(200, 160, 600, 60);
			ContentBtn.add(ContentBtn2);
			
			JButton ContentBtn3 = new JButton("<\uC0AC\uD68C\uBD09\uC0AC> \uB178\uC778\uB3D5\uAE30 \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
			ContentBtn3.setHorizontalAlignment(SwingConstants.LEADING);
			ContentBtn3.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			ContentBtn3.setBackground(Color.WHITE);
			ContentBtn3.setBounds(200, 220, 600, 60);
			ContentBtn.add(ContentBtn3);
			
			JButton ContentBtn5 = new JButton("<\uC720\uB2C9\uC2A4\uD504\uB85C\uADF8\uB798\uBC0D> signal \uACFC\uC81C  \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 3 \uC644\uB8CC\uB3C4: 5");
			ContentBtn5.setHorizontalAlignment(SwingConstants.LEADING);
			ContentBtn5.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			ContentBtn5.setBackground(Color.WHITE);
			ContentBtn5.setBounds(200, 340, 600, 60);
			ContentBtn.add(ContentBtn5);
			
			JButton ContentBtn6 = new JButton("<\uC18C\uD504\uD2B8\uC6E8\uC5B4\uACF5\uD559> Class\uC124\uACC4\uC11C \uC791\uC131  \r\n\uB9C8\uAC10\uAE30\uD55C: 18.05.01 \uC2E4\uC81C\uB9C8\uAC10\uC77C: 18.05.02 \uC911\uC694\uB3C4: 1 \uC644\uB8CC\uB3C4: 3");
			ContentBtn6.setHorizontalAlignment(SwingConstants.LEADING);
			ContentBtn6.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
			ContentBtn6.setBackground(Color.WHITE);
			ContentBtn6.setBounds(200, 400, 600, 60);
			ContentBtn.add(ContentBtn6);*/
		}
}
