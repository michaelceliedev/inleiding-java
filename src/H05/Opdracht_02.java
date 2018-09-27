package H05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_02 extends Applet {
    Color han, jer, val;
    int hans;
    int jeroen;
    int valerie;
    int som;

    public void init() {
        han= Color.blue;
        jer = Color.yellow;
        val = Color.pink;
        hans = 200;
        jeroen = 150;
        valerie = 40;
        som=(hans+jeroen+valerie)/3+40;
    }

    public void paint(Graphics g) {
        //hans
        g.setColor(han);
        g.fillRect(20,50-hans+som, 20, hans);
        //jeroen
        g.setColor(jer);
        g.fillRect(50,50-jeroen+som, 20, jeroen);
        //valerie
        g.setColor(val);
        g.fillRect(80,50-valerie+som, 20, valerie);

    }
}
