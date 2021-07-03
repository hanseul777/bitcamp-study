package net.hb.day0628;


import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Memo extends Frame implements WindowListener,ActionListener {
  private Button btnExit = new Button(" exit ");
  private Button btnSend = new Button(" send ");
  private TextField tf = new TextField(30); //한줄입력
  private TextArea  ta = new TextArea(); //가로row*세로column
  private Font ff = new Font("consolas", Font.BOLD, 20);
  private Panel pan = new Panel(); //레이아웃받침대 = 쟁반역할 

  public Memo() {
    //초간단메모장
    pan.add(tf); pan.add(btnSend); pan.add(btnExit);//작은쟁반

    ta.setFont(ff);
    add("Center", ta);
    add("South", pan); //작은판넬pan=Panel판넬 

    //이벤트연결 리스너추가
    Memo mm = new Memo();

    addWindowListener(mm);
    addWindowListener(this); //괄호안매개인(WindowListener)


    tf.addActionListener(this);
    btnSend.addActionListener(this);

    btnExit.addActionListener(this);
    btnExit.addActionListener(mm);

    //프레임의 메소드값변경 
    ta.setBackground(Color.YELLOW);
    this.setSize(450, 500);
    setTitle("초간단메모장");
    this.setVisible(true);
  }//end

  @Override public void windowClosing(WindowEvent e){myExit();}
  @Override public void windowOpened(WindowEvent e) {  }
  @Override public void windowClosed(WindowEvent e) {  }
  @Override public void windowIconified(WindowEvent e) {   }
  @Override public void windowDeiconified(WindowEvent e) {  }
  @Override public void windowActivated(WindowEvent e) {   }
  @Override public void windowDeactivated(WindowEvent e) {   }

  @Override
  public void actionPerformed(ActionEvent ae) {
    //actionPerformed메소드는 버튼클릭,이미지클릭, 입력란enter
    if(ae.getSource()==tf) { //tf한줄입력란 
      myText( );
    }else if(ae.getSource()==btnSend) {
      myText( );
    }else if(ae.getSource()==btnExit) {
      myExit( );
    }else{}
  }//end

  public void  myText( ) {
    String data = tf.getText();
    ta.append(data+"\n");
    tf.setText(""); //내용삭제
    tf.requestFocus();
  }//end

  public   void  myExit( ) {
    System.out.println("메모장 프로그램을 종료 1:16 2:38");
    //System.exit(0);
  }//end

  public static void main(String[] args) {
    Memo pad = new Memo();  //생성자호출 
  }//end

}//class END




