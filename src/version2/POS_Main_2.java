package version2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class POS_Main_2 extends JFrame implements ActionListener {
   private static final long serialVersionUID = 1L;

   
   //����Ʈ����
   JButton deleteBtn = new JButton("");

   //����â
   JButton paymentBtn = new JButton("");

   //��꼭
   JTextArea payList;
   //user â
   JButton btnuser = new JButton();

   //�迭
   String[] menu = {"�Ƹ޸�ī��","ī���","�����ƶ�","ī���ī","����","������","�� ����","�����","����","��Ű","����ũ","����"};
   int[] price = {2000,2500,2500,2500,1500,1500,1500,1500,1500,1000,2500,2500};
   JButton[] btn = new JButton[menu.length];
   int[] cnt = new int[btn.length];
   //���������� �ѱ� �迭
   String []str = new String[btn.length];
   int total = 0;
   int[] cost = new int[menu.length];
   String [] priceList = new String[btn.length];
   //total�� ���� ���� �ִ� cnt�� ã��
   int cntt[] = new int[cnt.length];
   ImageIcon icon[]= new ImageIcon[menu.length];
   
   String list;
   //cnt str
   
   
   //���
   boolean flag = true;

   
  // String userName
   public POS_Main_2(String userName) {
      //������
      //������ ����
      
     /* btnuser.setBounds(694, 145, 97, 95);
      btnuser.set*/
      
      
      setTitle("Ŀ������");
	  setBounds(500,250, 450, 300);
	  setTitle("ī�� POS �ý��� - 2��");
	  setSize(999,612);
	  setVisible(true);	
      setBackground(Color.black);
      getContentPane().setLayout(null);
      setVisible(true);

      //�޴� �г�
      Panel menuPanel = new Panel();
      menuPanel.setLocation(0, 0);
      menuPanel.setBackground(Color.WHITE);
      menuPanel.setLayout(null);
      menuPanel.setSize(998, 600);
      getContentPane().add(menuPanel);
      
	  JLabel lblNewLabel_1 = new JLabel("New label");
	  lblNewLabel_1.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/LOGO.png")));
	  lblNewLabel_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	  lblNewLabel_1.setBounds(717, 21, 194, 27);
	  menuPanel.add(lblNewLabel_1);

	  JLabel lblNewLabel3 = new JLabel("MENU");
	  lblNewLabel3.setBounds(55, 65, 179, 58);
	  lblNewLabel3.setFont(new Font("HGPGothicE", Font.BOLD, 58));
	  menuPanel.add(lblNewLabel3);

      

      //��ư ����
      for(int i=0; i<menu.length; i++) {
         btn[i] = new JButton(menu[i]);
         btn[i].setText(null);
         btn[i].setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/"+(i+1)+".png")));
         menuPanel.add(btn[i], BorderLayout.CENTER);

         
         if(i<4) {
             btn[i].setBounds(57+(149*(i)),159,126, 95);
          } else if(i>3 && i<8) { // 4 5 6 7
             btn[i].setBounds(57+(149*(i-4)),290,126, 95);  
          } else if(i>7 && i<12) { // 8 9 10 11
             btn[i].setBounds(57+(149*(i-8)),418,126, 95);
          }
         


         //��ư �߰�
         menuPanel.add(btn[i]);
         

         //��ư�� �̺�Ʈ ���
         btn[i].addActionListener(this);
         

          }

      
      
      deleteBtn.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/\uC8FC\uBB38 \uCDE8\uC18C.png")));

      deleteBtn.addActionListener(this);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBackground(SystemColor.text);
      panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2.setBounds(671, 82, 240, 247);
      menuPanel.add(panel_2);
      panel_2.setLayout(null);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(0, 0, 240, 31);
      panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2.add(panel_1);
      panel_1.setBackground(SystemColor.text);
      panel_1.setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel.setBounds(0, 0, 240, 31);
      panel_1.add(panel);
      panel.setBackground(SystemColor.inactiveCaption);
      panel.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uC0C1\uD488 \uBA85          \uC218\uB7C9           \uAC00\uACA9");
      lblNewLabel.setFont(new Font("����", Font.PLAIN, 15));
      lblNewLabel.setBounds(8, 6, 216, 20);
      panel.add(lblNewLabel);
      lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
      
      payList = new JTextArea();
      payList.setBounds(6, 41, 230, 196);
      panel_2.add(payList);
      payList.setEnabled(false);
      payList.setBackground(SystemColor.text);
      payList.setForeground(Color.black);
      payList.setFont(new Font("����", Font.BOLD, 13));
  
      
      menuPanel.add(deleteBtn);
      deleteBtn.setBounds(694,415,188,44);
      paymentBtn.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/\uACB0\uC81C.png")));

      paymentBtn.addActionListener(this);
      menuPanel.add(paymentBtn);
      paymentBtn.setBounds(694,469,188,44);
      
      JButton deleteBtn_1 = new JButton("\uC120\uD0DD \uCDE8\uC18C");
      deleteBtn_1.setBounds(694, 361, 188, 44);
      menuPanel.add(deleteBtn_1);
   }

   @Override
   public void actionPerformed(ActionEvent e) {

      if(e.getSource() == deleteBtn) { //��ҹ�ư
         payList.setText("");
         for(int i=0; i<cnt.length; i++) {
            cnt[i] = 0;
           cntt[i]=0;}
         JOptionPane.showMessageDialog(null, "�ֹ� ���");
         total=0;
         
         
      } else if(e.getSource() == paymentBtn) { //����Ȯ�� ��ư
         JOptionPane.showMessageDialog(null, "�ֹ� ����");
         //total�� �����
            for(int i=0;i<cnt.length;i++) {//cntt = total���� ã������ ���� �ִ� cnt�� �������
               if(cnt[i]>0) {
                  cntt[i]=cnt[i]*price[i];
               }
               
            }
            for(int i=0;i<cntt.length;i++) {total+=cntt[i];}

         list=payList.getText();
         // payList�� �Էµ� ��� text�� �����ͼ� list�� ����

         new Payment2(list,total).setVisible(true);
         
         //���� �� ����
         payList.setText("");
         for(int i=0; i<cnt.length; i++) {
            cnt[i] = 0;
           cntt[i]=0;}
         total=0;
 
         
      } else {
         for(int i=0; i<btn.length; i++) {
            payList.setText("");

            if(e.getSource() == btn[i]) {
               cnt[i]++;
               for(int j=0; j<cnt.length; j++) {
                  if(cnt[j] > 0) {
                    //for(int k=0;k<10;k++) cost[k]=cnt[j]*price[j];
                     payList.append(menu[j]+"\t  "+cnt[j]+"�� \t"+cnt[j]*price[j]+"��"+"\n");
                  }
               }
               break;
               
            }
          
         }

      }
   }
   
   public static void main(String[] args) {
      new POS_Main_2();
   }
   public POS_Main_2() {}  //����Ʈ ������ �߰�
}
