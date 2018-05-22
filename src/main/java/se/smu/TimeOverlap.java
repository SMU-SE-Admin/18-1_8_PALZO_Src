import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class TimeOverlap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeOverlap frame = new TimeOverlap();
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
	public TimeOverlap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uC2DC\uAC04\uC774 \uC911\uBCF5\uB418\uB294 \uACFC\uBAA9\uC774 \uC874\uC7AC\uD569\uB2C8\uB2E4.");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		lblNewLabel.setBounds(60, 86, 309, 47);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		btnNewButton.setBounds(300, 180, 100, 30);
		contentPane.add(btnNewButton);
	}
}
