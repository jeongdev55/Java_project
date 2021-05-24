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
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField textFinal;
	int total;
	int total2;
	String totals;




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
		total2=total;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment_title = new JLabel("결제",	JLabel.CENTER);
		lblPayment_title.setBounds(24, 10, 77, 59);
		lblPayment_title.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		contentPane.add(lblPayment_title);
		
		JComboBox cmbox_payMethods = new JComboBox();
		cmbox_payMethods.setBounds(421, 213, 267, 40);
		cmbox_payMethods.setEditable(true);
		cmbox_payMethods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if (e1.getSource()==cmbox_payMethods) {
					if(cmbox_payMethods.getSelectedItem().equals("카드")) {
						 total2=(int) (total2*0.95);   //5퍼 할인 적용
						String totals=String.valueOf(total2);
						JOptionPane.showMessageDialog
				         (null,(String)cmbox_payMethods.getSelectedItem()+"를 선택하셨습니다"+"\n 5% 할인 적용");
						textFinal.setText(totals);
						if(cmbox_payMethods.getSelectedItem()!=null ) {
							cmbox_payMethods.enable(false);}
					}
					if(cmbox_payMethods.getSelectedItem().equals("현금")){
						 total2=(int) (total2*0.9);    //10퍼 할인 적용
						String totals=String.valueOf(total2);
					JOptionPane.showMessageDialog
			         (null,(String)cmbox_payMethods.getSelectedItem()+"를 선택하셨습니다"+"\n 10% 할인 적용");
					textFinal.setText(totals);
					if(cmbox_payMethods.getSelectedItem()!=null ) {
						cmbox_payMethods.enable(false);}
					}
				}
			}
		});
		cmbox_payMethods.setBackground(Color.WHITE);
		cmbox_payMethods.setModel(new DefaultComboBoxModel(new String[] {"선택","현금", "카드"}));
		contentPane.add(cmbox_payMethods);


		
		JComboBox cmbox_discount = new JComboBox();
		cmbox_discount.setBounds(421, 322, 267, 40);
		cmbox_discount.setEditable(true);
		cmbox_discount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				if (e2.getSource()==cmbox_discount) {
					if(cmbox_discount.getSelectedItem().equals("직원할인")) {
						 total2=(int) (total2*0.9);
						String totals=String.valueOf(total2);
					JOptionPane.showMessageDialog
			         (null,(String)cmbox_discount.getSelectedItem()+"를 선택하셨습니다"+"\n 10% 추가 할인 적용");
					textFinal.setText(totals);

					}
					if (cmbox_discount.getSelectedItem().equals("없음")) {
						JOptionPane.showMessageDialog
				         (null,(String)cmbox_discount.getSelectedItem()+"으로 하시겠습니까?");
					String all;
						 all = String.valueOf(total);
						textFinal.setText(all);
						cmbox_payMethods.enable(true);
						
					}
		
			}}
		});
		cmbox_discount.setBackground(Color.WHITE);
		cmbox_discount.setModel(new DefaultComboBoxModel(new String[] {"할인 선택", "직원할인","없음"}));
		contentPane.add(cmbox_discount);
		
		JButton btnPayment = new JButton("");
		btnPayment.setBounds(555, 491, 188, 44);
		btnPayment.setIcon(new ImageIcon(Payment.class.getResource("/images/\uACB0\uC81C.png")));
		btnPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e3) {
				if(cmbox_payMethods.getSelectedItem() != "카드" || cmbox_payMethods.getSelectedItem() != "현금" ) {
					JOptionPane.showMessageDialog(null, "결제수단을 선택해주세요.");
				}else {
				int choose = JOptionPane.showConfirmDialog(null, "영수증을 출력하시겠습니까?", "영수증 확인", JOptionPane.YES_NO_OPTION);
				if(choose == JOptionPane.YES_OPTION) {
					try {
						FileWriter filew = new FileWriter("D:/cash.txt");
						filew.write(str+"/n합계금액 "+total+"원");
						
						filew.close();
						dispose();
						setVisible(false);
					new Login().setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
						}
				}else {
					dispose();
					setVisible(false);
					new Login().setVisible(true);
				}
				dispose();
				setVisible(false);
				new Login().setVisible(true);
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
		label.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("적용할인");
		lblNewLabel.setBounds(421, 297, 57, 15);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
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
		String total1=String.valueOf(total);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(24, 78, 720, 365);
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 91, 328, 253);
		panel_2.add(panel);
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
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(371, 52, 11, 292);
			panel_2.add(separator_3);
			separator_3.setOrientation(SwingConstants.VERTICAL);
			
			JLabel lblPayment_total = new JLabel("총합 (원)");
			lblPayment_total.setBounds(279, 50, 103, 40);
			panel_2.add(lblPayment_total);
			lblPayment_total.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			
			JLabel lbltotal = new JLabel("100000");
			lbltotal.setBounds(202, 66, 65, 15);
			panel_2.add(lbltotal);
			lbltotal.setFont(new Font("굴림", Font.PLAIN, 13));
			lbltotal.setHorizontalAlignment(SwingConstants.RIGHT);
			lbltotal.setText(total1);
			
			JLabel lblPayment_local = new JLabel("JAVA coffee  종로점");
			lblPayment_local.setBounds(23, 10, 167, 28);
			panel_2.add(lblPayment_local);
			lblPayment_local.setFont(new Font("맑은 고딕", Font.BOLD, 14));
	}

	public Payment() {
		// TODO Auto-generated constructor stub
	}
}

