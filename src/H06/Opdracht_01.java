package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_01 extends Applet
{
    int answer;
    int money;
    int amount;

    public void init()
    {
        money = 113;
        amount = 4;

        answer = money / amount;
    }

    public void paint(Graphics g)
    {
        g.drawString("Wie krijgt hoeveel geld?", 30, 20);
        g.drawString("Jan = €" + answer + ",-", 30, 40);
        g.drawString("Ali = €" + answer + ",-", 30, 60 );
        g.drawString("Jeannette = €" + answer + ",-", 30, 80);
        g.drawString("Luuk = €" + answer + ",-", 30, 100);
    }
}