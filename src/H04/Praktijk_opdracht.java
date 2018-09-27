package H04;

import java.applet.Applet;
import java.awt.*;

public class Praktijk_opdracht extends Applet {

    public void init() {
        setSize(1000,1000);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        //Tekeningen

        //lijn
        g.setColor(Color.black);
        g.drawLine(10,10,505,10);
        g.drawString("Lijn",250,25);

        //rechthoek
        g.drawRect(10,40,500,250);
        g.drawString("Rechthoek",240,310);


        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(10,320,500,250);

        g.setColor(Color.black);
        g.drawOval(10,320,500,250);
        g.drawString("Gevulde Rechthoek met Ovaal",200,590);


        //taartpunt met ovaal eromheen
        g.setColor(Color.black);
        g.drawOval(550,40,500,250);

        g.setColor(Color.magenta);
        g.fillArc(550,40,500,250,0,45);

        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",700,310);


        //afgeronde driehoek
        g.setColor(Color.black);
        g.drawRoundRect(550,320,500,250,30,30);
        g.drawString("Afgeronde driekhoek",750,590);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(1200,0,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal",60,115);

        //ovaal
        g.drawOval(1200,320,100,100);
        g.drawString("Ovaal",285, 115);



    }



}
