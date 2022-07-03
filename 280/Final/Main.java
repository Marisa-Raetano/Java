import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.util.*;
import java.awt.TextField.*;
import java.awt.TextComponent.*;
import java.util.Vector;
import java.util.Arrays;


public class Main implements Runnable, ActionListener{

  private JFrame frame;
  private JTextField field;
  private JLabel emptyLabel = null;


  private String toKey(String a){
    a = a.toUpperCase();
    char[] q = a.toCharArray();
    Arrays.sort(q);

    a = new String(q);
    if(a.indexOf('*') != -1){
      a = a.substring(1);
    }
    return a;
  }


  public void run(){
    //Create and set up the window.
    JFrame frame = new JFrame("Marisa");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(200,200));

   // JFormattedTextField tf1 = new JFormattedTextField();
   
    TextField tf1, tf2, tf3;
    // a blank text field
    tf1 = new TextField();
    tf1.setPreferredSize(new Dimension(10, 10));
    tf2 = new TextField();
    tf3 = new TextField();

    GridLayout layout = new GridLayout(8,2);
    frame.getContentPane().setLayout(layout);

    JPanel leftside =  new JPanel();
    leftside.setLayout(new GridLayout(4,2));
    leftside.add(tf1);
    leftside.add(tf2);
    leftside.add(tf3);


    JButton button = new JButton("Rotate");
    JButton decrypt = new JButton("Decrypt");
    JButton encrypt = new JButton("Encrypt");
    leftside.add(button);
    leftside.add(decrypt);
    leftside.add(encrypt);



    field = new JTextField();
    frame.getContentPane().add(field);

    frame.getContentPane().add(leftside);
   // frame.getContentPane().add(tf2);
   // frame.getContentPane().add(tf3);

    frame.pack();
    frame.setVisible(true);


  }


  public void actionPerformed(ActionEvent e){ 
    String cmd = e.getActionCommand();
    //int n;
    if(cmd=="Rotate"){
      String text = field.getText();
      System.out.println(text);
      String key = toKey(text);
}
}

  public static void main(String[] args) {
    Main demo = new Main();
    javax.swing.SwingUtilities.invokeLater(demo);
  }

}



