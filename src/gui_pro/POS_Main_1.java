package gui_pro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

class POS_Main_1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn7;
	public JButton btn8;
	public JButton btn9;
	public JButton btn10;
	public JButton btn11;
	public JButton btn12;
	public JButton btnmenulist_pop;
	public JButton btnpricelist_pop;
	public JButton btnpayment_go;
	public JTextArea menupan;
	public String str="";
	public String price="";

	public int total=0;

	/**
	 * Launch the application.
	 * @param userName 
	 */

	public POS_Main_1(String userName) {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,250, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		

		
		JButton btn1=new JButton("");
		btn1.setForeground(Color.BLACK);
		btn1.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uC544\uBA54\uB9AC\uCE74\uB1781.png")));
		btn1.setBounds(55, 159, 127, 95);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1) {
					str+="아메리카노"+"\n";
					price+="2000"+"\n";
					total+=2000;
				}
			}
		});
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uCE74\uD398\uB77C\uB5BC.png")));
		btn2.setBounds(202, 159, 127, 95);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2) {
					str+="카페라떼"+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uCE74\uB77C\uBA5C\uB9C8\uB07C\uC544\uB610.png")));
		btn3.setBounds(350, 159, 127, 95);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn3) {
					str+="카라멜 마끼아또"+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uCE74\uD398\uBAA8\uCE74.png")));
		btn4.setBounds(499, 159, 127, 95);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn4) {
					str+="카페모카"+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uB179\uCC28.png")));
		btn5.setBounds(55, 290, 127, 95);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn5) {
					str+="녹차"+"\n";
					price+="1500"+"\n";
					total+=1500;
				}
			}
		});
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uC720\uC790\uCC28.png")));
		btn6.setBounds(202, 290, 127, 95);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn6) {
					str+="유자차"+"\n";
					price+="1500"+"\n";
					total+=1500;
				}
			}
		});
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uD56B\uCD08\uCF54.png")));
		btn7.setBounds(350, 290, 127, 95);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn7) {
					str+="핫초코"+"\n";
					price+="1500"+"\n";
					total+=1500;
				}
			}
		});
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uD5C8\uBE0C\uCC28.png")));
		btn8.setBounds(499, 290, 127, 95);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn8) {
					str+="허브 차"+"\n";
					price+="1500"+"\n";
					total+=1500;
				}
			}
		});
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uB3C4\uB11B.png")));
		btn9.setBounds(55, 418, 127, 95);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn9) {
					str+="도넛"+"\n";
					price+="1500"+"\n";
					total+=1500;
				}
			}
		});
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("");
		btn10.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uCFE0\uD0A4.png")));
		btn10.setBounds(202, 418, 127, 95);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn10) {
					str+="쿠키"+"\n";
					price+="1000"+"\n";
					total+=1000;
				}
			}
		});
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uCF00\uC774\uD06C.png")));
		btn11.setBounds(350, 418, 127, 95);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn11) {
					str+="케이크"+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uBA38\uD540.png")));
		btn12.setBounds(499, 418, 127, 95);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn11) {
					str+="머핀"+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.add(btn12);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBounds(35, 43, 179, 58);
		lblNewLabel.setFont(new Font("HGPGothicE", Font.BOLD, 58));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(33, 130, 619, 403);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(664, 130, 275, 403);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnuser = new JButton("");
		btnuser.setBounds(90, 34, 103, 85);
		panel_1.add(btnuser);
		btnuser.setBorderPainted(false);
		btnuser.setBackground(SystemColor.control);
		btnuser.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnuser.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/iconmonstr-user-5-64.png")));
		
		JButton btnpayment_go_1 = new JButton("");
		btnpayment_go_1.setBounds(49, 305, 188, 44);
		panel_1.add(btnpayment_go_1);
		btnpayment_go_1.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uACB0\uC81C.png")));
		btnpayment_go_1.setBackground(SystemColor.text);
		
		JButton btndelete = new JButton("");
		btndelete.setBounds(49, 251, 188, 44);
		panel_1.add(btndelete);
		btndelete.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uC8FC\uBB38 \uCDE8\uC18C.png")));
		btndelete.setBackground(SystemColor.text);
		
		JButton btnmenulist_pop = new JButton("");
		btnmenulist_pop.setBounds(49, 197, 188, 44);
		panel_1.add(btnmenulist_pop);
		btnmenulist_pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmenulist_pop.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/\uC8FC\uBB38 \uBAA9\uB85D \uD655\uC778.png")));
		btnmenulist_pop.setBackground(SystemColor.text);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(100, 129, 80, 15);
		panel_1.add(lblUsername);
		lblUsername.setText(userName);
		

		
		btnmenulist_pop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==btnmenulist_pop) {
					new menulist_pop(str,price,total).setVisible(true);

				}
			}
		});
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btndelete) {
					int result=JOptionPane.showConfirmDialog(btnmenulist_pop,"주문을 취소하시겠습니까?","Confirm",JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.YES_OPTION) {  //사용자가 "예"라고 클릭한 경우 입력된 변수 초기화
						str="";
						price="";
						total=0;
					}
				}	
			}
		});
		btnpayment_go_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==btnpayment_go_1) {
					new Payment(str,price,total).setVisible(true);

				}
			}
		});
		btnuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnuser) {
					JOptionPane.showConfirmDialog(btnuser,"userName:"+userName+"\n"+"직급:"+"관리자","Message",JOptionPane.OK_OPTION);
					
				}
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(POS_Main_1.class.getResource("/images/LOGO.png")));
		lblNewLabel_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		lblNewLabel_1.setBounds(762, 21, 194, 27);
		contentPane.add(lblNewLabel_1);
		
	
		setTitle("카페 POS 시스템 - 2조");
		setSize(997,611);
		setVisible(true);		
	
	}

	public static void main(String[] args) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
