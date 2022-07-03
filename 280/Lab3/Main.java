import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements Runnable, ActionListener{

  private StudentPanel ani = new StudentPanel();
  
  public void actionPerformed(ActionEvent e){
    ani.repaint();
  }

  public void run(){
    JFrame frame = new JFrame("JAVA...");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setPreferredSize(new Dimension(750,500));
    frame.getContentPane().add(ani);
    Timer t = new Timer(500,this);
    t.setActionCommand("timer");
    t.start();
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args){
    Main m = new Main();
    javax.swing.SwingUtilities.invokeLater(m);
  }
}
