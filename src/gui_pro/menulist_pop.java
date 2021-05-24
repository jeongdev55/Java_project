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
import java.awt.SystemColor;
import javax.swing.ImageIcon;

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
		setBounds(900,280, 437, 541);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC8FC\uBB38 \uBAA9\uB85D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("µ¸¿ò", Font.BOLD, 36));
		lblNewLabel.setBounds(129, 39, 174, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnok = new JButton("");
		btnok.setIcon(new ImageIcon(menulist_pop.class.getResource("/images/\uD655\uC778.png")));
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnok) {
					setVisible(false);
				}
			}
		});
		btnok.setBounds(118, 427, 188, 44);
		contentPane.add(btnok);
		
		JLabel lbltotal = new JLabel("");
		lbltotal.setFont(new Font("µ¸¿ò", Font.BOLD, 45));
		lbltotal.setBounds(101, 373, 191, 44);
		contentPane.add(lbltotal);
		String total1=String.valueOf(total);
		lbltotal.setText(total1);
		
		JLabel lblNewLabel_1 = new JLabel("\uD569\uACC4 \uAE08\uC561");
		lblNewLabel_1.setFont(new Font("µ¸¿ò", Font.BOLD, 18));
		lblNewLabel_1.setBounds(83, 333, 106, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC6D0");
		lblNewLabel_1_1.setFont(new Font("µ¸¿ò", Font.PLAIN, 43));
		lblNewLabel_1_1.setBounds(297, 373, 52, 54);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 134, 255, 189);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(83, 108, 255, 215);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uC0C1\uD488\uBA85");
		lblNewLabel_2.setBounds(0, 0, 73, 30);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uAC00\uACA9");
		lblNewLabel_2_1.setBounds(116, 3, 66, 22);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		textmenuprice.append(price);
		
			
	}
	private String toString(int total) {
		// TODO Auto-generated method stub
		return null;
	}

	public menulist_pop() {} 
}
