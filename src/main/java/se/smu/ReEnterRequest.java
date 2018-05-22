import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReEnterRequest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReEnterRequest frame = new ReEnterRequest();
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
	public ReEnterRequest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		textPane.setText("\uC591\uC2DD\uC744 \uBAA8\uB450 \uC785\uB825\uD574\uC8FC\uC2ED\uC2DC\uC624");
		textPane.setBounds(114, 85, 268, 54);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(300, 180, 100, 40);
		contentPane.add(btnNewButton);
	}

}
