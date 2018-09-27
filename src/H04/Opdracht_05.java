package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_05 extends Applet {


    public void init() {
setBackground(Color.blue);
    }

    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(100,100,250,250,0,360);
    }
}
