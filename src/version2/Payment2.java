package version2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

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

public class Payment2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFinal;
	//할인 항목 위해 에리어 전역 변수 선언 (5/26수정)
	JTextArea textlist = new JTextArea();
	int total2, total3;
	String totals;
	String str;
	String textEx;
	int flag = 0;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment2 frame = new Payment2();
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
	//String str, int total
	public Payment2(String str, int total) {
		total2 = total; //0526. 지워져있지 않은지 체크
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,250, 800, 600);   //위치 변경
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment_title = new JLabel("결제",	JLabel.CENTER);
		lblPayment_title.setBounds(24, 20, 77, 59);
		lblPayment_title.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		contentPane.add(lblPayment_title);
		
		JLabel lblPayment_total = new JLabel("총합 (원)");
		lblPayment_total.setBounds(290, 129, 103, 40);
		lblPayment_total.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		contentPane.add(lblPayment_total);
		
		JComboBox cmbox_payMethods = new JComboBox();
		cmbox_payMethods.setEditable(true);
		cmbox_payMethods.setBounds(421, 213, 267, 40);
		cmbox_payMethods.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				if (e1.getSource()==cmbox_payMethods) {
					if(cmbox_payMethods.getSelectedItem().equals("카드")) {
						total2=(int) (total2*0.95);   //5퍼 할인 적용 + total2가 total로 되있는지 한번씩 체크
						JOptionPane.showMessageDialog
				         (null,(String)cmbox_payMethods.getSelectedItem()+"를 선택하셨습니다"+"\n 5% 할인 적용");
			
						textFinal.setText(total2+"");
						textlist.append("카드    5%할인 적용\r\n");
						total3 = total2;
						textEx = textlist.getText();
						if(cmbox_payMethods.getSelectedItem()!=null ) {
							cmbox_payMethods.enable(false);}
					}
					if(cmbox_payMethods.getSelectedItem().equals("현금")){
						total2=(int) (total2*0.9);   //10퍼 할인 적용 + total2가 total로 되있는지 한번씩 체크
					JOptionPane.showMessageDialog
			         (null,(String)cmbox_payMethods.getSelectedItem()+"를 선택하셨습니다"+"\n 10% 할인 적용");
					textFinal.setText(total2+"");
					textlist.append("현금     10%할인 적용\r\n");
					total3 = total2;
					textEx = textlist.getText();
					if(cmbox_payMethods.getSelectedItem()!=null ) {
						cmbox_payMethods.enable(false);}
					}
				}
			}
		});

		cmbox_payMethods.setBackground(Color.WHITE);
		cmbox_payMethods.setModel(new DefaultComboBoxModel(new String[] {"선택", "현금", "카드"}));
		contentPane.add(cmbox_payMethods);

	
		JComboBox cmbox_discount = new JComboBox();
		cmbox_discount.setEditable(true);
		cmbox_discount.setBounds(421, 322, 267, 40);
		cmbox_discount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				if (e2.getSource()==cmbox_discount) {
					if(cmbox_discount.getSelectedItem().equals("없음")) {
						textFinal.setText(""+total3);
						textlist.setText(textEx);
						total2 = total3;
						flag = 0;
					}
					if(cmbox_discount.getSelectedItem().equals("직원할인")) {
						if(flag == 1) {
							JOptionPane.showMessageDialog(null, "이미 선택한 항목입니다.");
						}else {
						 total2=(int) (total2*0.9);  //직원할인 10퍼 적용  + total2가 total로 되있는지 한번씩 체크
					JOptionPane.showMessageDialog
			         (null,(String)cmbox_discount.getSelectedItem()+"를 선택하셨습니다"+"\n 10% 추가 할인 적용");
					textFinal.setText(""+total2); 
					textlist.append("직원할인     10%할인 적용\r\n");
					flag = 1;
					}}
					if (cmbox_discount.getSelectedItem().equals("취소")) {
						JOptionPane.showMessageDialog
				         (null,(String)cmbox_discount.getSelectedItem()+"하시겠습니까?");
						String all;
						
						 all = String.valueOf(total);
						textFinal.setText(all);
						total2 = total;
						flag = 0;
						
						cmbox_payMethods.enable(true);
						
						//텍스트 에리어 할인 사할 지워주는 작업
						// 텍스트 없는 값으로 밀어주고, 기존str재배치 (5/26수정)
						textlist.setText("");
						textlist.append(str);
						
					}
		
			}}
		});
		cmbox_discount.setBackground(Color.WHITE);
		cmbox_discount.setModel(new DefaultComboBoxModel(new String[] {"없음", "직원할인","취소"}));
		contentPane.add(cmbox_discount);
		
		JButton btnPayment = new JButton("");
		btnPayment.setIcon(new ImageIcon(Payment2.class.getResource("/images/\uACB0\uC81C.png")));
		btnPayment.setBounds(575, 484, 188, 44);
		btnPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e3) {
				if(cmbox_payMethods.getSelectedItem() != "현금" && cmbox_payMethods.getSelectedItem() != "카드" ) {
					JOptionPane.showMessageDialog(null, "결제수단을 선택해주세요.");
				}else {
				int choose = JOptionPane.showConfirmDialog(null, "영수증을 출력하시겠습니까?", "영수증 확인", JOptionPane.YES_NO_OPTION);
				if(choose == JOptionPane.YES_OPTION) {
					try {
						//0526. 영수증에 날짜 포함시키는 기능 추가
						Calendar cal = Calendar.getInstance();
						int year = cal.get(Calendar.YEAR); //해
						int month = cal.get(Calendar.MONTH)+1; //달
						int day = cal.get(Calendar.DAY_OF_MONTH); //일
						int hour = cal.get(Calendar.HOUR_OF_DAY); //시간
						int min = cal.get(Calendar.MINUTE); //분
						int sec = cal.get(Calendar.SECOND); //초
						String time = year + "년 " + month + "월 "+ day+"일 "+hour+"시"+min+"분"+sec+"초";
						
						FileWriter filew = new FileWriter("d:/cash.txt");
						filew.write(str+"\r\n총 결제금액 "+total+" 원"+"\r\n"+time);
						
						filew.close();
						dispose();
						setVisible(false);
						//0526. 결제 완료시 로그인 창으로 돌아가는 부분 삭제
					} catch (IOException e1) {
						e1.printStackTrace();
						}
				}else {
					JOptionPane.showMessageDialog(null, "결제 완료");  //결제 완료 팝업
					dispose();
					setVisible(false);
					//결제 종료 후 따로 창을 열지 않음
				}
				dispose();
				setVisible(false);

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
		
		JPanel panel = new JPanel();
		panel.setBounds(59, 173, 294, 253);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(-6, -17, 340, 276);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFl = new JLabel("메뉴          |   갯수   |                 가격");
		lblFl.setBounds(6, 11, 328, 30);
		lblFl.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		panel_1.add(lblFl);
		
		textlist = new JTextArea();
		textlist.setBounds(6, 40, 328, 230);
		panel_1.add(textlist);
		textlist.append(str);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(317, 30, 17, 240);
		panel_1.add(scrollBar);
		
		JLabel lbltotal = new JLabel("100000");
		lbltotal.setBounds(213, 145, 65, 15);
		lbltotal.setFont(new Font("굴림", Font.PLAIN, 13));
		lbltotal.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbltotal);
		String total1=String.valueOf(total);
		lbltotal.setText(total1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBounds(24, 89, 720, 356);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(360, 36, 11, 292);
		panel_2.add(separator_3);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblPayment_local = new JLabel("JAVA coffee 종로점");
		lblPayment_local.setBounds(29, 10, 167, 28);
		panel_2.add(lblPayment_local);
		lblPayment_local.setFont(new Font("맑은 고딕", Font.BOLD, 14));
	}

	public Payment2() {
		// TODO Auto-generated constructor stub
	}
}