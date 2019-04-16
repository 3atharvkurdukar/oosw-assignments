
/*
<APPLET CODE=BouncingBall.java WIDTH=600 HEIGHT=600></APPLET>
*/
import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class BouncingBall extends Applet implements Runnable {
  Thread t;
  int x, y;
  Graphics g;

  public BouncingBall() {
    t = new Thread(this);
    x = 250;
    y = 0;
    t.start();
  }

  public void run() {
    while (true) {
      while (y < 530) {
        y += 5;
        try {
          Thread.sleep(10);
        } catch (Exception e) {
          t.stop();
        }
        repaint();
      }
      while (y > 20) {
        y -= 5;
        try {
          Thread.sleep(10);
        } catch (Exception e) {
          t.stop();
        }
        repaint();
      }
    }
  }

  public void paint(Graphics g) {
    g.setColor(new Color(157, 195, 230));
    g.fillRect(0, 0, 600, 600);
    g.setColor(new Color(255, 240, 183));
    g.fillRect(20, 20, 560, 560);
    g.setColor(new Color(0, 32, 96));
    g.fillOval(x, y, 50, 50);
  }
}
