package H02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_01_02 extends Applet {


    public void init() {
 setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Michael Celie", 50, 60 );
        g.fillRect(50,70,50,100);
        g.drawRect(50,70,50,100);
            g.setColor(Color.blue);
            g.drawString("michael", 50, 80 );
            g.setColor(Color.red);
            g.drawString("celie", 50, 100 );
    }
}