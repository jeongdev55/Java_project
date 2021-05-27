package version2;

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

public class Login extends JFrame {

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
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800,350, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("LOG-IN");
		btnNewButton.setBounds(85, 186, 269, 45);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String userName = textField.getText();
				String  userPw = passwordField.getText();
				
				if(userName.equals("admin")&& userPw.equals("123456")) {
					JOptionPane.showMessageDialog(null,"Weclome"+"\n"+"userName:  "+userName);
					dispose();
					setVisible(false);
					new POS_Main_2(userName).setVisible(true);}
				else {JOptionPane.showMessageDialog(null, "아이디, 비밀번호가 일치하지 않습니다.\r\n" + 
						"다시 시도해주세요.");}
				/*메인창 이동 작성 */
					
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		textField = new JTextField(	textField.CENTER);
		textField.setBounds(67, 71, 304, 42);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 123, 304, 40);
		passwordField.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/LOGO.png")));
		lblNewLabel.setBounds(93, -22, 230, 113);
		contentPane.add(lblNewLabel);
	}
}

