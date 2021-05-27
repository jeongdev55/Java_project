package version2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class POS_Main_2 extends JFrame implements ActionListener {

   //버튼 전역 변수 선언
   private JButton BtnAlldelete = new JButton("");         //리스트 전체삭제 버튼 
   private JButton Btnchosedelete = new JButton("");    //리스트 부분삭제 버튼
   private JButton Btncntchange = new JButton("");       //수량 변경 버튼
   private JButton BtnPayment = new JButton("");         //결제창 넘기는 버튼
   private JButton btnuser = new JButton();               //user 창

   private JTextField texttotal;
   private JTable listtable;
   JLabel userWho;
   // 메뉴 가격 배열 선언
   String[] menu = {"아메리카노","카페라떼","마끼아또","카페모카","녹차","유자차","핫 초코","허브차","도넛","쿠키","케이크","머핀"};
    int[] price = {2000,2500,2500,2500,1500,1500,1500,1500,1500,1000,2500,2500};  
    JButton[] btn = new JButton[menu.length];   //메뉴 배열의 길이만큼 버튼 새로운 버튼 생성
    int[] cnt2 = new int[menu.length];                 //메뉴가 호출된 횟수를 저장하기 위한 배열
    int totalsum=0;                                  //주문서에 총 합을 보여주는 변수
    int totalcnt=0;                                  //주문서에 총 수량으 보여주는 변수
    String list= "";                                        //결제 창에 보낼 테이블 데이터
    private JTextField textField;
   

  // String userName  >> 로그인 창에서 받은 인자 값
   public POS_Main_2(String userName) {    
      setTitle("커피포스");
      setBounds(500,250, 450, 300);
      setTitle("카페 POS 시스템 - 2조");
      setSize(999,612);
      setVisible(true);
      setBackground(Color.black);
      getContentPane().setLayout(null);
      setVisible(true);

      //메뉴 패널
      Panel menuPanel = new Panel();
      
      menuPanel.setLocation(0, 0);
      menuPanel.setBackground(Color.WHITE);
      menuPanel.setLayout(null);
      menuPanel.setSize(998, 600);
      getContentPane().add(menuPanel);
      //로고 라벨
      JLabel lblNewLabel_1 = new JLabel("New label");
      lblNewLabel_1.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/LOGO.png")));
      lblNewLabel_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      lblNewLabel_1.setBounds(717, 21, 194, 27);
      menuPanel.add(lblNewLabel_1);
      //메뉴 라벨
      JLabel lblNewLabel3 = new JLabel("MENU");
      lblNewLabel3.setBounds(55, 65, 179, 58);
      lblNewLabel3.setFont(new Font("HGPGothicE", Font.BOLD, 58));
      menuPanel.add(lblNewLabel3);
      
      //버튼 이벤트 구성 및 이벤트 등록
      BtnAlldelete.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/그림6.png")));
      BtnAlldelete.addActionListener(this);
      menuPanel.add(BtnAlldelete);
      BtnAlldelete.setBounds(799,406,128,44);
      
      Btnchosedelete.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/그림5.png")));
      Btnchosedelete.addActionListener(this);
      Btnchosedelete.setBounds(670, 406, 128, 44);
      menuPanel.add(Btnchosedelete);
      
      BtnPayment.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/그림8.png")));
      BtnPayment.addActionListener(this);
      menuPanel.add(BtnPayment);
      BtnPayment.setBounds(799,460,128,44);
      
      Btncntchange.addActionListener(this);
      Btncntchange.setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/그림7.png")));
      Btncntchange.setBounds(670, 460, 128, 44);
      menuPanel.add(Btncntchange);
      
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(671, 95, 258, 251);
      menuPanel.add(scrollPane);
      

      // 테이블 생성
      listtable = new JTable(new DefaultTableModel(
         new Object[][] { },
         new String[] {"\uBA54\uB274", "\uC218\uB7C9", "\uAC00\uACA9" } ));
      scrollPane.setViewportView(listtable);
      listtable.setShowGrid(false);
      listtable.setFont(new Font("돋움", Font.BOLD, 12));
      listtable.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 11));
      DefaultTableModel m = (DefaultTableModel)listtable.getModel();
      listtable.setRowHeight(25);
      
      // 총 수량, 총 가격을 나타내는 textField 생성
      texttotal = new JTextField();
      texttotal.setBounds(670, 356, 258, 31);
      menuPanel.add(texttotal);
      texttotal.setBackground(SystemColor.inactiveCaptionBorder);
      texttotal.setHorizontalAlignment(SwingConstants.RIGHT);
      texttotal.setColumns(10);
      
      JLabel lblId = new JLabel("        ID:");
      lblId.setBounds(757, 65, 62, 18);
      lblId.setFont(new Font("HGPGothicE", Font.BOLD, 15));
      menuPanel.add(lblId);
      lblId.setEnabled(false);
      
      
      textField = new JTextField(userName);
      textField.setBounds(815, 60, 116, 24);
      menuPanel.add(textField);
      textField.setColumns(10);
      textField.setEnabled(false);
      

      
      //버튼 설정
      for(int i=0; i<menu.length; i++) {    //반복문을 통해 메뉴 만큼의 버튼 생성
         btn[i] = new JButton(menu[i]);
         btn[i].setText(null);
         btn[i].setIcon(new ImageIcon(POS_Main_2.class.getResource("/images/"+(i+1)+".png")));    //메뉴 이미지 삽입
         menuPanel.add(btn[i], BorderLayout.CENTER);
         //버튼 위치 설정
         if(i<4) {
             btn[i].setBounds(57+(149*(i)),159,126, 95);
          } else if(i>3 && i<8) { // 4 5 6 7
             btn[i].setBounds(57+(149*(i-4)),290,126, 95);  
          } else if(i>7 && i<12) { // 8 9 10 11
             btn[i].setBounds(57+(149*(i-8)),418,126, 95);
          } 
         //버튼 추가
         menuPanel.add(btn[i]);
         //버튼에 이벤트 등록
         btn[i].addActionListener(this);
          }
      
   }
   
   
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
      DefaultTableModel m = (DefaultTableModel)listtable.getModel();   //테이블 사용 선언

      //=====전체 취소 버튼 이벤트=======
      if(e.getSource() == BtnAlldelete) { 
         JOptionPane.showMessageDialog(null, "주문 전체 취소");
         
        for(int j=0;j<m.getRowCount();j++) {
           for(int t=0;t<btn.length;t++) {
               if(m.getValueAt(j,0).equals(menu[t]))
                  cnt2[t]=0;  //모든 행에 적용되어있던 cnt2값을 삭제 
                 }
           }      
        clear();  //저장된 모든 데이터를 지우는 함수 호출     
      } 
      
      
      //=====부분 취소 버튼 이벤트=======
      if(e.getSource()==Btnchosedelete) {  
         if(listtable.getSelectedRow()<0) {     //취소할 테이블 행이 선택되지 않을 경우
            JOptionPane.showMessageDialog(null, "취소 할 메뉴를 선택해주세요.");
         }else {         //선택된 행에 대한 행,열의 값 저장
            int rowindex=listtable.getSelectedRow();
            int column=listtable.getSelectedColumn();
            
            for(int i=0;i<listtable.getRowCount();i++) {    //테이블 행만큼의 반복 진행
               for(int j=0;j<menu.length;j++) {             //메뉴배열의 길이만큼 반복 진행
                  if(listtable.getValueAt(rowindex, column).equals(menu[j]) || listtable.getValueAt(rowindex, column).equals(cnt2[j]) || listtable.getValueAt(rowindex, column).equals(cnt2[j]*price[j]))  //선택된 행의 행과 열의 값이 메뉴 이름과 같을 경우
                     cnt2[j]=0;                                                   // 메뉴의 cnt2의 값을 초기화 시킴
               }    
            }
            m.removeRow(rowindex);    //선택된 행 삭제     - >>이후 메뉴 선택 시 수량 1로 다시 테이블에 등록됨.
            JOptionPane.showMessageDialog(null, "부분 취소 완료 ");
         }
         result(); //선택 취소 후 결과를 리셋하기 위해 함수 호출
       }
      
      
      
      //=====수량 변경 버튼 이벤트=======
      if(e.getSource()==Btncntchange) {  
          if(listtable.getSelectedRow()<0) {     //수량을 변경할 행이 선택되지 않을 경우
             JOptionPane.showMessageDialog(null, "수량을 변경 할 메뉴를 선택해주세요.");
          }else {       //선택된 행에 대한 행,열의 값 저장
             int rowindex=listtable.getSelectedRow();
             int column=listtable.getSelectedColumn();
             int newprice=0;
             int newcnt=Integer.parseInt(JOptionPane.showInputDialog("변경할 수량을 입력해주세요"));    //사용자로부터 변경할 수량을 입력 받음
             
             for(int i=0;i<listtable.getRowCount();i++) { //테이블 행만큼의 반복 진행
                for(int j=0;j<menu.length;j++) {             //메뉴배열의 길이만큼 반복 진행
                   if(listtable.getValueAt(rowindex, column).equals(menu[j]) || listtable.getValueAt(rowindex, column).equals(cnt2[j]) || listtable.getValueAt(rowindex, column).equals(cnt2[j]*price[j])) {  //선택된 행의 행과 열의 값이 메뉴 이름과 같을 경우
                      newprice=newcnt*price[j];
                      cnt2[j]=newcnt;                                             // 메뉴의 사용자가 입력한 데이터를 cnt2의에 넣음
                        listtable.setValueAt(newcnt, rowindex, 1);
                        listtable.setValueAt(newprice, rowindex, 2);
                        break;
                }}
                
             }
             JOptionPane.showMessageDialog(null, "수량변경 완료");
             }
          result();
          }
      
         
          // 결제 확인 버튼
       if(e.getSource() == BtnPayment) { 
         JOptionPane.showMessageDialog(null, "주문 결제");

         for(int i=0;i<listtable.getRowCount();i++) {   //테이블의 행만큼
            for(int j=0;j<listtable.getColumnCount();j++) { //테이블의 열만큼
               //결제창에 넘기기 전 list 문자열에 간격을 설정
               if(j>=1) {
                  list+="\t "+listtable.getValueAt(i,j)+"  ";
               }else
                  list+="     "+listtable.getValueAt(i,j);   
            }
            list+="\n";
         }
         new Payment2(list,totalsum).setVisible(true);
         // 테이블의 값을 저장한 list와 totalsum을 결제창에 보냄
         
        clear(); //저장된 모든 데이터를 지우는 함수 호출     
 
     
      } else {
         for(int i=0; i<btn.length; i++) {
              // 메뉴 클릭 이벤트
              if(e.getSource() == btn[i]) {
                 cnt2[i]++;
                 if(cnt2[i]>=1) {
                 for(int j=0;j<listtable.getRowCount();j++) {
                    if(listtable.getValueAt(j, 0).equals(menu[i])) {
                       m.removeRow(j);}}}
               m.addRow(new Object[]{menu[i],cnt2[i],price[i]*cnt2[i]});
                 
               result();

                 break;
              }//if 종료
            } //for 종료
         } //else 종료
       } //actionPerformed 종료
  
   
   
  // 전체 취소, 결제 후 데이터 지우기-------------------------------------------------------------------------------------
   private void clear() {
      DefaultTableModel m = (DefaultTableModel)listtable.getModel();
       //데이터를 보낸 후 이전 값 비우기
      m.setRowCount(0);   //모든 테이블 지우기
      totalsum=0;            //저장되어있던 총 합 삭제
      totalcnt=0;
      texttotal.setText("");
}



   //수량,가격 출력---------------------------------------------------------------------------------------------------------------
   private void result() {
      DefaultTableModel m = (DefaultTableModel)listtable.getModel();
      
         totalsum=0;                
         for(int z=0;z<m.getRowCount();z++) {
            for(int q=0;q<m.getColumnCount();q++) {
               if(q==2) {   
                  totalsum+=(int) m.getValueAt(z, q);   }}}
         
         
         totalcnt=0;
         for(int z=0;z<m.getRowCount();z++) {
            for(int q=0;q<m.getColumnCount();q++) {
               if(q==1) {   
                  totalcnt+=(int) m.getValueAt(z, q);    }}}
         
         texttotal.setText("수량: "+totalcnt+"개       가격: "+totalsum+"원");
   
}



public static void main(String[] args) {
      new POS_Main_2();
   }
public POS_Main_2(){};
}