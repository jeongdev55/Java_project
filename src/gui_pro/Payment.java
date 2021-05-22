package gui_pro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.border.TitledBorder;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField textFinal;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param total 
	 * @param price 
	 * @param str 
	 */
	//String str, String price, int total
	public Payment(String str, String price, int total) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment_title = new JLabel("결제",	JLabel.CENTER);
		lblPayment_title.setBounds(163, 24, 77, 59);
		lblPayment_title.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		contentPane.add(lblPayment_title);
		
		JLabel lblPayment_local = new JLabel("JAVA coffee 종로점");
		lblPayment_local.setBounds(34, 120, 167, 28);
		lblPayment_local.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		contentPane.add(lblPayment_local);
		
		JLabel lblPayment_total = new JLabel("총합 (원)");
		lblPayment_total.setBounds(290, 129, 103, 40);
		lblPayment_total.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		contentPane.add(lblPayment_total);
		
		JComboBox cmbox_payMethods = new JComboBox();
		cmbox_payMethods.setBounds(421, 213, 267, 40);
		cmbox_payMethods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if (e1.getSource()==cmbox_payMethods) {
					if(cmbox_payMethods.getSelectedItem().equals("카드")) {
						int total2=(int) (total*0.95);   //5퍼 할인 적용
						String totals=String.valueOf(total2);
						JOptionPane.showMessageDialog
				         (null,(String)cmbox_payMethods.getSelectedItem()+"를 선택하셨습니다"+"\n 5% 할인 적용");
						textFinal.setText(totals);
					}
					if(cmbox_payMethods.getSelectedItem().equals("현금")){
						int total2=(int) (total*0.9);   //10퍼 할인 적용
						String totals=String.valueOf(total2);
					JOptionPane.showMessageDialog
			         (null,(String)cmbox_payMethods.getSelectedItem()+"를 선택하셨습니다"+"\n 10% 할인 적용");
					textFinal.setText(totals);
					}
				}
			}
		});
		cmbox_payMethods.setBackground(Color.WHITE);
		cmbox_payMethods.setModel(new DefaultComboBoxModel(new String[] {"현금", "카드"}));
		cmbox_payMethods.setBounds(421, 213, 267, 40);
		contentPane.add(cmbox_payMethods);


		
		JComboBox cmbox_discount = new JComboBox();
		cmbox_discount.setBounds(421, 322, 267, 40);
		cmbox_discount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				if (e2.getSource()==cmbox_discount) {
					JOptionPane.showMessageDialog
			         (null,(String)cmbox_discount.getSelectedItem()+"를 선택하셨습니다");
					/*금액 변경 기록 */
			}}
		});
		cmbox_discount.setBackground(Color.WHITE);
		cmbox_discount.setModel(new DefaultComboBoxModel(new String[] {"없음", "직원할인"}));
		contentPane.add(cmbox_discount);
		
		JButton btnPayment = new JButton("\uACB0\uC81C");
		btnPayment.setBounds(575, 484, 154, 51);
		btnPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e3) {
				if(e3.getSource()!=null) {
					JOptionPane.showMessageDialog(null,"결제가 완료되었습니다." +"\n"+"영수증을 출력하시겠습니까?");
					dispose();
					setVisible(false);
				new LogIn().setVisible(true);
					}
				
				
			}
		});
		btnPayment.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		contentPane.add(btnPayment);
		
		JLabel lblPayment_lastTitle = new JLabel("최종 금액");
		lblPayment_lastTitle.setBounds(62, 484, 135, 51);
		lblPayment_lastTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 28));
		contentPane.add(lblPayment_lastTitle);
		
		JLabel label = new JLabel("결제수단");
		label.setBounds(421, 188, 57, 15);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("적용할인");
		lblNewLabel.setBounds(421, 297, 57, 15);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		textFinal = new JTextField();
		textFinal.setBounds(209, 482, 267, 49);
		textFinal.setFont(new Font("굴림", Font.BOLD, 30));
		textFinal.setBackground(Color.LIGHT_GRAY);
		contentPane.add(textFinal);
		textFinal.setColumns(10);
		textFinal.setOpaque(false);
		textFinal.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 455, 720, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(395, 78, -12, 365);
		contentPane.add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(387, 151, 11, 292);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 173, 328, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(-6, -17, 340, 276);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textlist = new JTextArea();
		textlist.setBounds(6, 17, 328, 253);
		panel_1.add(textlist);
	
		textlist.append(str);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(317, 17, 17, 253);
		panel_1.add(scrollBar);
		
		JLabel lbltotal = new JLabel("100000");
		lbltotal.setFont(new Font("굴림", Font.PLAIN, 13));
		lbltotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltotal.setBounds(213, 145, 65, 15);
		contentPane.add(lbltotal);
		String total1=String.valueOf(total);
		lbltotal.setText(total1);
	}

	public Payment() {
		// TODO Auto-generated constructor stub
	}
}
