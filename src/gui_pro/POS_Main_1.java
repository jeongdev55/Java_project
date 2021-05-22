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
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */

	public POS_Main_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
		JButton btn3 = new JButton("\uCE74\uB77C\uBA5C\uB9C8\uB07C\uC544\uB610");
		btn3.setBounds(329, 145, 127, 95);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn3) {
					str+=btn3.getText()+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btn3);
		
		JButton btn1=new JButton("\uC544\uBA54\uB9AC\uCE74\uB178");
		btn1.setBounds(34, 145, 127, 95);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1) {
					str+=btn1.getText()+"\n";
					price+="2000"+"\n";
					total+=2000;
				}
			}
		});
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("\uCE74\uD398\uB77C\uB5BC");
		btn2.setBounds(181, 145, 127, 95);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2) {
					str+=btn2.getText()+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.add(btn2);
		
		JButton btn4 = new JButton("\uCE74\uD398\uBAA8\uCE74");
		btn4.setBounds(478, 145, 127, 95);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn4) {
					str+=btn4.getText()+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("\uC544\uC774\uC2A4\uD2F0");
		btn5.setBounds(34, 276, 127, 95);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn5) {
					str+=btn5.getText()+"\n";
					price+="2000"+"\n";
					total+=2000;
				}
			}
		});
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("\uC720\uC790\uCC28");
		btn6.setBounds(181, 276, 127, 95);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn6) {
					str+=btn6.getText()+"\n";
					price+="1500"+"\n";
					total+=1500;
				}
			}
		});
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("\uD56B\uCD08\uCF54");
		btn7.setBounds(329, 276, 127, 95);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn7) {
					str+=btn7.getText()+"\n";
					price+="1500"+"\n";
					total+=1500;
				}
			}
		});
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("\uC790\uBABD\uC5D0\uC774\uB4DC");
		btn8.setBounds(478, 276, 127, 95);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn8) {
					str+=btn8.getText()+"\n";
					price+="3000"+"\n";
					total+=3000;
				}
			}
		});
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("\uC640\uD50C");
		btn9.setBounds(34, 404, 127, 95);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn9) {
					str+=btn9.getText()+"\n";
					price+="2500"+"\n";
					total+=2500;
				}
			}
		});
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("\uCFE0\uD0A4");
		btn10.setBounds(181, 404, 127, 95);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn10) {
					str+=btn10.getText()+"\n";
					price+="2000"+"\n";
					total+=2000;
				}
			}
		});
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("\uCF00\uC774\uD06C");
		btn11.setBounds(329, 404, 127, 95);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn11) {
					str+=btn11.getText()+"\n";
					price+="4500"+"\n";
					total+=4500;
				}
			}
		});
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("\uC2A4\uCF58");
		btn12.setBounds(478, 404, 127, 95);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn11) {
					str+=btn12.getText()+"\n";
					price+="3500"+"\n";
					total+=3500;
				}
			}
		});
		contentPane.add(btn12);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBounds(34, 59, 265, 58);
		lblNewLabel.setFont(new Font("나눔바른고딕 옛한글", Font.PLAIN, 58));
		contentPane.add(lblNewLabel);
		
		JButton btnuser = new JButton("user");
		btnuser.setBounds(694, 145, 97, 95);
		contentPane.add(btnuser);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(803, 157, 116, 21);
		txtUsername.setText("username");
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnmenulist_pop = new JButton("\uC8FC\uBB38 \uBAA9\uB85D \uD655\uC778");
		btnmenulist_pop.setBounds(694, 278, 223, 58);
		btnmenulist_pop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==btnmenulist_pop) {
					new menulist_pop(str,price,total).setVisible(true);

				}
			}
		});
		contentPane.add(btnmenulist_pop);
		
		JButton btndelete = new JButton("\uC8FC\uBB38 \uCDE8\uC18C");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btndelete) {
					JOptionPane.showConfirmDialog(btndelete,"취소했습니다.");
					str="";
					price="";
					total=0;
				}	
			}
		});
		btndelete.setBounds(694, 363, 223, 58);
		contentPane.add(btndelete);
		
		JButton btnpayment_go = new JButton("\uACB0\uC81C");
		btnpayment_go.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==btnpayment_go) {
					new Payment(str,price,total).setVisible(true);

				}
			}
		});
		btnpayment_go.setBounds(694, 441, 223, 58);
		contentPane.add(btnpayment_go);
		
	
		setTitle("카페 POS 시스템 - 2조");
		setSize(983,599);
		setVisible(true);		
	
	}

	public static void main(String[] args) {
		new POS_Main_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
