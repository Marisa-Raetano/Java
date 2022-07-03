/*
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.util.*;
/* FrameDemo.java requires no other files. */
public class FrameDemo implements Runnable, ActionListener{

  private JLabel emptyLabel = null;
  private OrangePanel rightSide = null;
  private JFrame frame;
  /**
   * Create the GUI and show it.  For thread safety,
   * this method should be invoked from the
   * event-dispatching thread.
   */
  //private JLabel emptyLabel = null;
  public void run(){
    //Create and set up the window.
    JFrame frame = new JFrame("Marisa");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    GridLayout layout = new GridLayout(1,2);
    frame.getContentPane().setLayout(layout);

    JPanel leftSide = new JPanel();
    leftSide.setLayout(new GridLayout(3,1));

    OrangePanel rightSide = new OrangePanel();
    rightSide.addMouseListener(rightSide);

    emptyLabel = new JLabel("Do I take a lancer day tmmw?");
    emptyLabel.setPreferredSize(new Dimension(2000,1000));
    emptyLabel.setForeground(Color.MAGENTA);
    emptyLabel.setFont(Font.decode("Arial-BOLD-42"));
    leftSide.add(emptyLabel);


    JButton button = new JButton("Press here");
    button.addActionListener(this);
    button.setActionCommand("btnB");
    leftSide.add(button);

    JButton btnA = new JButton("Click here");
    btnA.setActionCommand("btnA");
    btnA.addActionListener(this);
    leftSide.add(btnA);

    frame.getContentPane().add(leftSide);
    frame.getContentPane().add(rightSide);

    JMenuBar theMenuBar = new JMenuBar();
    JMenu mnuColors = new JMenu("Colors");
    JMenuItem jo = mnuColors.add("Orange");
    JMenuItem jm = mnuColors.add("Magenta");
    jo.setActionCommand("orange");
    jm.setActionCommand("magenta");
    jo.addActionListener(this);
    jm.addActionListener(this);

    theMenuBar.add(mnuColors);

    frame.setJMenuBar(theMenuBar);

    frame.pack();
    frame.setVisible(true);


  }
  public void actionPerformed(ActionEvent e){
    String cmd = e.getActionCommand();
    if(cmd == "btnB"){
      emptyLabel.setText("Yes, Skip all classes");
    }else if(cmd=="btnA"){
      JFileChooser chooser = new JFileChooser();
      //FileNameExtensionFilter filter = new FileNameExtensionFilter("Textfiles", ".txt");
      //chooser.setFileFilter(filter);
      int returnVal = chooser.showOpenDialog(frame);
      if(returnVal == JFileChooser.APPROVE_OPTION){
	try{
	  Scanner fileIn = new Scanner(chooser.getSelectedFile());
	}catch(Exception x){
	}
      }

      //System.out.println("Yu coose to open this file: " + chooser.getSelectedFile().getName());
   // }
    //emptyLabel.setText("Click the other one");
  }else if(cmd == "orange"){
    rightSide.rectColor = new Color(230,127,10);
  }else if(cmd == "magenta"){
    rightSide.rectColor = new Color(230,10,127);
  }

}

/*
   ActionListener actionListener = new ActionListener() {
   public void actionPerformed(ActionEvent event) {
   String str = event.getActionCommand();
   System.out.println("Clicked = " + str);
   }
   };

   button.setActionCommand("Button");
   button.addActionListener(actionListener);
 */


//Display the window.


public static void main(String[] args) {
  //Schedule a job for the event-dispatching thread:
  //creating and showing this application's GUI.
  // javax.swing.SwingUtilities.invokeLater(new Runnable() {
  FrameDemo demo = new FrameDemo();
  javax.swing.SwingUtilities.invokeLater(demo);
}

}

