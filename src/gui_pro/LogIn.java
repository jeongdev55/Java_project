package gui_pro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("LOG-IN");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userName = textField.getText();
				String  userPw = passwordField.getText();
				
				if(userName.equals("name")&& userPw.equals("123456")) {
					JOptionPane.showMessageDialog(null,"Weclome"+"\n"+"user:  "+userName);}
				else {JOptionPane.showMessageDialog(null, "아이디, 비밀번호가 일치하지 않습니다.\r\n" + 
						"다시 시도해주세요.");}
				/*메인창 이동 작성 */
				
				new POS_Main_1().setVisible(true);
					
				
			}
		});
		btnNewButton.setBounds(85, 186, 269, 45);
		contentPane.add(btnNewButton);
		
		textField = new JTextField(	textField.CENTER);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(67, 71, 304, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.inactiveCaptionBorder);
		passwordField.setBounds(67, 123, 304, 40);
		contentPane.add(passwordField);
	}
}

