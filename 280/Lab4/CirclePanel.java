import java.awt. *;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Path2D;


public class CirclePanel extends JPanel implements MouseListener{

  public int startX = 10;
  public int startY = 10;


  public Color circleColor = new Color(230,127,10);

  protected void paintComponent(Graphics g){
    //Color o = new Color(230,127,10);
    g.setColor(Color.BLUE);
    g.fillOval(startX, startY, 100, 100);
    String myString = "It's almost Christmas";
    g.drawString(myString, startX, startY);

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

