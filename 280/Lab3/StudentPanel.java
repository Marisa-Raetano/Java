import java.awt.*;
import javax.swing.*;
import java.util.*;

public class StudentPanel extends JPanel{
  
  private int blocks = 21;
  private int locX = 10;
  private int locY = 10;



  protected void paintComponent(Graphics g){
    g.setColor(new Color(255,255,255));
    Dimension panelDim = new Dimension();
    panelDim = this.getSize(panelDim);
    int width = (int)panelDim.getWidth();
    int height = (int)panelDim.getHeight();
    int xWidth = width/blocks;
    int yHeight = height/blocks;


    g.fillRect(0,0,width,height);
    //g.fillRect(0,0,(int)panelDim.getWidth(), (int)panelDim.getHeight());
    g.setColor(new Color(0,0,0));

    int xCenter = (width%blocks)/2;
    int yCenter = (height%blocks)/2;
    for(int i = 0; i < blocks +1; ++i){
      g.drawLine(i*xWidth+xCenter, yCenter, i*xWidth + xCenter, blocks*yHeight + yCenter);
      g.drawLine(xCenter, i*yHeight+yCenter, blocks*xWidth+xCenter, i*yHeight+yCenter);


    }

    g.setColor(new Color(50,230,100));
    g.fillOval(locX*xWidth+xCenter +2, locY*yHeight+yCenter +2, xWidth -4, yHeight -4);

    int dir = (int)(Math.random()*4);
    if(dir == 0){
      locX += 1;
    }else if(dir == 1){
      locY += 1;
    }else if(dir == 2){
      locX -= 1;
    }else{
      locY -= 1;
    }
  
  locX = Math.max(0,Math.min(blocks-1,locX));
  locY = Math.max(0,Math.min(blocks -1, locY));
  
  }



}

