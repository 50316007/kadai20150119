package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener, WindowListener {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private TextField text1 = new TextField("",10);
  private TextField text2 = new TextField("",10);
  private TextField text3 = new TextField("",10);
  private Button button1 = new Button("ë´ÇµéZ");
  
  // For M/M/1
  private TextField m1 = new TextField("",10);
  private TextField m2 = new TextField("",10);
  private TextField m3 = new TextField("",10);
  private Button bm = new Button("M/M/1");
  
  // For M/M/S
  private TextField mms1 = new TextField("",10);
  private TextField mms2 = new TextField("",10);
  private TextField mms3 = new TextField("",10);
  private TextField mms4 = new TextField("",10);
  private Button bmms = new Button("M/M/1");
  
  public FrameSystemView(FrameSystemController controller) {
    // TODO Auto-generated constructor stub
    setTitle("FrameSystem");
    setLayout(new FlowLayout(FlowLayout.CENTER));
    add(text1);
    add(text2);
    add(button1);
    add(new Label("ìöÇ¶"));
    add(text3);
    add(new Label("É…"));
    add(m1);
    add(new Label("É "));
    add(m2);
    add(bm);
    add(new Label("ïΩãœånì‡êlêî"));
    add(m3);
    add(new Label("É…"));
    add(mms1);
    add(new Label("É "));
    add(mms2);
    add(new Label("ëãå˚êî"));
    add(mms3);
    add(bmms);
    add(new Label("ïΩãœånì‡êlêî"));
    add(mms4);
    button1.addActionListener(this);
    bm.addActionListener(this);
    bmms.addActionListener(this);
    addWindowListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    if(arg0.getSource() == button1){
      int val1 = Integer.parseInt(text1.getText());
      int val2 = Integer.parseInt(text2.getText());
      
      Calculation_lib clib = new Calculation_lib(val1, val2);
      text3.setText(String.valueOf(clib.getPlus()));
      // text3.setText(String.valueOf(val1 + val2));
    }else if(arg0.getSource() == bm){
      double lambda  = Double.parseDouble(m1.getText());
      double mu = Double.parseDouble(m2.getText());
      
      MM1_lib mm1 = new MM1_lib(lambda, mu);
      m3.setText(String.valueOf(mm1.getLength()));
    }else if(arg0.getSource() == bmms){
      double lambda  = Double.parseDouble(mms1.getText());
      double mu = Double.parseDouble(mms2.getText());
      int s = Integer.parseInt(mms3.getText());
      
      MMS_lib mm1 = new MMS_lib(lambda, mu,s);
      mms4.setText(String.valueOf(mm1.getL()));
    }
    
  }

  @Override
  public void windowActivated(WindowEvent arg0) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowClosed(WindowEvent arg0) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowClosing(WindowEvent arg0) {
    // TODO Auto-generated method stub
    System.exit(0);
  }

  @Override
  public void windowDeactivated(WindowEvent arg0) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowDeiconified(WindowEvent arg0) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowIconified(WindowEvent arg0) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void windowOpened(WindowEvent arg0) {
    // TODO Auto-generated method stub
    
  }
}

