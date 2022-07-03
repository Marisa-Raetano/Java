import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.util.*;
public class Main implements Runnable, ActionListener{

  private JLabel elabel = null;
  private CirclePanel rightSide = null;
  private JFrame frame;
  
  
  public void run(){
    //Create and set up the window.
    JFrame frame = new JFrame("Marisa");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GridLayout layout = new GridLayout(1,1);
    frame.getContentPane().setLayout(layout);


    CirclePanel rightSide = new CirclePanel();
    rightSide.addMouseListener(rightSide);
    JLabel label = new JLabel("What are you drawing?");
    rightSide.add(label);


    frame.getContentPane().add(rightSide);


    frame.pack();
    frame.setVisible(true);


  }
  public void actionPerformed(ActionEvent e){ 
    String cmd = e.getActionCommand();
    //if(cmd == "btnB"){
     // elabel.setText("You just drew a circle");
//}
}


//Display the window.


public static void main(String[] args) {
  //Schedule a job for the event-dispatching thread:
  //creating and showing this application's GUI.
  // javax.swing.SwingUtilities.invokeLater(new Runnable() {
  Main m = new Main();
  javax.swing.SwingUtilities.invokeLater(m);
}

}

