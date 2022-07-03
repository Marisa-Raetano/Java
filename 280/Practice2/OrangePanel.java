import java.awt. *;
import java.awt.event.*;
import javax.swing.*;

public class OrangePanel extends JPanel implements MouseListener{

  public int startX = 10;
  public int startY = 10;

  public Color rectColor = new Color(230,127,10);

  protected void paintComponent(Graphics g){
    //Color o = new Color(230,127,10);
    g.setColor(rectColor);
    g.fillRect(startX,startY, 100, 100);

  }

  public void mouseClicked(MouseEvent e){
    startX = e.getX();
    startY = e.getY();

    repaint();
}

public void mouseEntered(MouseEvent e){
}

public void mouseExited(MouseEvent e){
}

public void mousePressed(MouseEvent e){
}

public void mouseReleased(MouseEvent e){
}

}
