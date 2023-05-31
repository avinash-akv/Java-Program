java
import java.applet.*;
import java.awt.*;

public class KiteApplet extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {100, 150, 200, 150};
        int[] yPoints = {100, 50, 100, 150};
        g.setColor(Color.red);
        g.fillPolygon(xPoints, yPoints, 4);
        g.setColor(Color.black);
        g.drawLine(125, 75, 125, 125);
        g.drawLine(125, 125, 175, 125);
    }
}
