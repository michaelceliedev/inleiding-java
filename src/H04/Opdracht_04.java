package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_04 extends Applet {
    public void init() {
        setBackground(Color.decode("#FFFFFF"));
        setSize(1600, 900); // Zet de grote van de app naar 1600x900
    }

    public void paint(Graphics g) {
        /*
         * 3 Kinderen
         * Valerie 40 KG
         * Jeroen 100 KG
         * Hans    80 KG
         *
         * Elke kolom heeft een eigen kleur
         * Namen staan onder de diagram
         * Gewicht met 20kg verdeling links
         */

        g.setColor(Color.BLACK);
        g.drawLine(500, 100, 500, 600); // Left border
        g.drawLine(500, 600, 850, 600); // Lower border

        g.drawString("Personen", 855, 607);
        g.drawString("Gewicht (KG)", 425, 80);

        g.drawString("100kg", 462, 100);
        g.drawString("  80kg", 462, 200);
        g.drawString("  60kg", 462, 300);
        g.drawString("  40kg", 462, 400);
        g.drawString("  20kg", 462, 500);
        g.drawString("    0kg", 462, 600);

        g.drawString("Valerie", 550, 615);
        g.drawString("Jeroen", 655, 615);
        g.drawString("Hans", 760, 615);

        // 100px = 20kg
        g.setColor(Color.RED);
        g.fillRect(550, 400, 50, 200);

        g.setColor(Color.BLUE);
        g.fillRect(650, 100, 50, 500);

        g.setColor(Color.ORANGE);
        g.fillRect(750, 200, 50, 400);

        g.setColor(Color.decode("#BBBBBB"));
        for (int i = 0; i < 5; i++)
            g.drawLine(500, 100 + 100 * i, 850, 100 + 100 * i); // Teken een grijze lijn

        /* Alt - Hardcoding
        g.drawLine(500, 100, 1200, 100); // 100 KG
        g.drawLine(500, 200, 1200, 200); //  80 KG
        g.drawLine(500, 300, 1200, 300); //  60 KG
        g.drawLine(500, 400, 1200, 400); //  40 KG
        g.drawLine(500, 500, 1200, 500); //  20 KG
        */
    }
}