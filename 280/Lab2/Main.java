import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.util.HashMap;
import java.util.Vector;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.util.*;
/* FrameDemo.java requires no other files. */
 class Main implements Runnable, ActionListener{

  private HashMap<String, Vector<String>> mapping = new HashMap();
  private Vector<String> data = new Vector();

  private JFrame frame;
  private JTextField field;
  private JList listy;

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

  private void initMap(){
    Scanner inFile = null;
    try{
      inFile = new Scanner(new File("TWL06.txt"));
    }catch(Exception e){}
    while(inFile.hasNext()){
      String value = inFile.next();
      data.add(value);
      String key = toKey(value);
      Vector<String> vec = new Vector<String>();
      if(mapping.containsKey(key)){
	vec = mapping.get(key);
      }
      vec.add(value);
      mapping.put(key,vec);
    }
  }


  public void run(){
  //Create and set up the window.
    initMap();
    JFrame frame = new JFrame("Marisa");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(200,200));

    GridLayout layout = new GridLayout(1,2);
    frame.getContentPane().setLayout(layout);

    JButton button = new JButton("Button");
    button.setActionCommand("btn");
    button.addActionListener(this);
    frame.getContentPane().add(button);

    field = new JTextField();
    frame.getContentPane().add(field);

    listy = new JList();
    frame.getContentPane().add(listy);

    frame.pack();
    frame.setVisible(true);


  }

  public void actionPerformed(ActionEvent e){
    String cmd = e.getActionCommand();
    if(cmd=="btn"){
      String text = field.getText();
      String key = toKey(text);
      Vector<String> results = new Vector();

      if(mapping.containsKey(key)){
	results.addAll( mapping.get(key));
      }
      if(text.indexOf('*') != -1){
	for(char ch = 'A'; ch <= 'Z'; ch += 1){
	  String newKey = toKey(key +ch);
	  if(mapping.containsKey(newKey)){
	    results.addAll(mapping.get(newKey));

        }
      }

  }
      listy.setListData(results);
      System.out.println(results);

}
}

public static void main(String[] args) {
  Main demo = new Main();
  javax.swing.SwingUtilities.invokeLater(demo);
}

}

