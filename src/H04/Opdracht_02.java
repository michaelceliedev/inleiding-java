package H04;


import java.applet.Applet;
import java.awt.*;

public class Opdracht_02 extends Applet{



    public void init() {

    }

    public void paint(Graphics g)
    {
        g.drawPolygon(new int[]{100, 200, 300}, new int[] {200, 20, 200}, 3);
        g.drawRect(100,200,200,250);
        g.drawRect(150,400,25,50);
        g.drawRect(200,350,25,25);
    }
}