package gui_pro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class menulist_pop extends JFrame {

	private JPanel contentPane;
	private JTextArea textlist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menulist_pop frame = new menulist_pop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param menu 
	 */
	//String str,String price,int total
	public menulist_pop(String str,String price,int total) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uBAA9\uB85D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("³ª´®¹Ù¸¥°íµñ ¿¾ÇÑ±Û", Font.PLAIN, 36));
		lblNewLabel.setBounds(129, 30, 174, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnok = new JButton("\uD655\uC778");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnok) {
					setVisible(false);
				}
			}
		});
		btnok.setBounds(162, 508, 106, 51);
		contentPane.add(btnok);
		
		JLabel lbltotal = new JLabel("");
		lbltotal.setFont(new Font("±¼¸²", Font.BOLD, 55));
		lbltotal.setBounds(175, 433, 191, 61);
		contentPane.add(lbltotal);
		String total1=String.valueOf(total);
		lbltotal.setText(total1);
		
		JLabel lblNewLabel_1 = new JLabel("\uD569\uACC4 \uAE08\uC561");
		lblNewLabel_1.setFont(new Font("µ¸¿ò", Font.BOLD, 21));
		lblNewLabel_1.setBounds(72, 403, 106, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC6D0");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 52));
		lblNewLabel_1_1.setBounds(354, 437, 52, 54);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 172, 255, 189);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JTextArea textmenulist = new JTextArea();
		panel.add(textmenulist);
		textmenulist.append(str);
		
		
		JTextArea textmenuprice = new JTextArea();
		panel.add(textmenuprice);
		
		JLabel lblNewLabel_2 = new JLabel("\uC0C1\uD488\uBA85");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(105, 146, 73, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uAC00\uACA9");
		lblNewLabel_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(237, 149, 66, 22);
		contentPane.add(lblNewLabel_2_1);
		textmenuprice.append(price);
		
			
	}
	private String toString(int total) {
		// TODO Auto-generated method stub
		return null;
	}

	public menulist_pop() {} 
}
