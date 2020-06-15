
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;
import javax.imageio.ImageIO;
// How to scale an image- https://stackoverflow.com/questions/5895829/resizing-image-in-java
// https://stackoverflow.com/questions/24397178/how-can-it-save-the-previous-graphics-using-repaint-in-java
/**
 * @author Ben Zeng, Oscar Han Ms. Krasteva 08/03/2020 This program creates a
 * card for International Women's Day
 */
public class Main {

    public Main() {
        JFrame frame = new JFrame("International Women's Day!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        Drawing d = new Drawing();
        frame.add(d);
        JButton b = new JButton("FLIP PAGE");
        b.addActionListener(e -> d.switchScreen());
        frame.add(b, BorderLayout.SOUTH);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

    class Drawing extends JComponent {

        private int screen = 2;
        private final Color LIGHT_PINK = new Color(255, 95, 191, 222);
        private final Color PINK = new Color(245, 0, 147, 10);
        private final Color DARK_PINK = new Color(175, 0, 105, 10);
        private final Color LIGHTCORAL = new Color(240, 128, 128);
        private final Color SALMON = new Color(250, 128, 114);
        private final Color INDIANRED = new Color(205, 92, 92);
        private final Color CRIMSON = new Color(220, 20, 60);
        private final Color FIREBRICK = new Color(178, 34, 34);
        private final Color MAROON = new Color(128, 0, 0);
        private final Color PALEGOLDEN = new Color(238, 232, 170);
        private final Color PEACHPUFF = new Color(255, 218, 185);
        private final Color DARKSALMON = new Color(233, 150, 122);
        private final Color BURLYWOOD = new Color(222, 184, 135);
        private final Color ROSYBROWN = new Color(188, 143, 143);
        private final Color CHOCOLATE = new Color(210, 105, 30);
        private final Color SADDLEBROWN = new Color(139, 69, 19);
        private final Color LIGHTSALMON = new Color(255, 160, 122);
        private final Color SIENNA = new Color(160, 82, 45);
        private final Color PERU = new Color(205, 133, 63);
        private final Color ORANGE = new Color(255, 165, 0);
        private final Color NAVAJOWHITE = new Color(255, 222, 173);
        // Colors used for graphics
        private Graphics g;
        public void switchScreen() {
            screen = 3 - screen;
            repaint();
        }
        public void paint(Graphics g)
        {
            this.g = g;
            try {
                g.drawImage(ImageIO.read(new File("bg.png")).getScaledInstance(800, 500, Image.SCALE_DEFAULT), 0, 0, this);
            } catch (IOException e) {
                e.printStackTrace();
            }

            g.setColor(LIGHT_PINK);
            for (int i = 0; i <= 775; i += 25) {
                g.fillArc(2 + i, 3, 25, 21, 180, 180);
                g.fillArc(2 + i, 456, 25, 21, 0, 180);
            }
            g.setColor(new Color(255, 228, 225));
            g.fillRect(0, 0, 800, 15);
            g.fillRect(0, 465, 800, 15);
            for (int i = 0; i <= 775; i += 25) {
                g.fillArc(0 + i, 5, 25, 17, 180, 180);
                g.fillArc(0 + i, 458, 25, 17, 0, 180);
            }
            g.setColor(new Color(175, 0, 105, 200));
            for (int i = 0; i <= 775; i += 25) {
                g.fillOval(9 + i, 17, 10, 4);
                g.fillOval(9 + i, 459, 10, 4);
            }
            // Draws "The world wouldn't be the same without you!"
            if(screen == 1) screen1();
            else screen2();
        }
        private void screen1()
        {
            g.setColor(new Color(255, 255, 240));
            g.fillOval(430, 215, 70, 70);
            g.fillOval(505, 255, 50, 50);
            g.fillOval(570, 290, 30, 30);
            g.fillOval(625, 305, 20, 20);
            g.fillOval(660, 315, 10, 10);
            g.fillOval(700, 320, 5, 5);
            g.fillOval(740, 323, 3, 3);

            int hX = 165; // base x coordinate of heart
            int hY = 40; // base y coordinate of heart
            g.setColor(LIGHTCORAL);
            int h1X[] = {hX, hX + 10, hX + 10};
            int h1Y[] = {hY + 30, hY + 10, hY + 60};
            g.fillPolygon(h1X, h1Y, 3);
            g.setColor(FIREBRICK);
            int h2X[] = {hX + 10, hX + 30, hX + 40, hX + 10};
            int h2Y[] = {hY + 10, hY + 40, hY + 70, hY + 60};
            g.fillPolygon(h2X, h2Y, 4);
            g.setColor(INDIANRED);
            int h3X[] = {hX + 10, hX + 30, hX + 50, hX + 55};
            int h3Y[] = {hY + 10, hY, hY + 10, hY + 20};
            g.fillPolygon(h3X, h3Y, 4);
            g.setColor(SALMON);
            int h4X[] = {hX + 10, hX + 55, hX + 60, hX + 30};
            int h4Y[] = {hY + 10, hY + 20, hY + 30, hY + 40};
            g.fillPolygon(h4X, h4Y, 4);
            g.setColor(CRIMSON);
            int h5X[] = {hX + 30, hX + 60, hX + 40};
            int h5Y[] = {hY + 40, hY + 30, hY + 70};
            g.fillPolygon(h5X, h5Y, 3);
            g.setColor(INDIANRED);
            int h6X[] = {hX + 10, hX + 40, hX + 60};
            int h6Y[] = {hY + 60, hY + 70, hY + 110};
            g.fillPolygon(h6X, h6Y, 3);
            int h7X[] = {hX + 60, hX + 80, hX + 40};
            int h7Y[] = {hY + 30, hY + 60, hY + 70};
            g.fillPolygon(h7X, h7Y, 3);
            int h8X[] = {hX + 60, hX + 70, hX + 90, hX + 95};
            int h8Y[] = {hY + 30, hY + 10, hY, hY + 35};
            g.fillPolygon(h8X, h8Y, 4);
            g.setColor(MAROON);
            int h9X[] = {hX + 40, hX + 80, hX + 65};
            int h9Y[] = {hY + 70, hY + 60, hY + 80};
            g.fillPolygon(h9X, h9Y, 3);
            g.setColor(CRIMSON);
            int h10X[] = {hX + 60, hX + 95, hX + 80};
            int h10Y[] = {hY + 30, hY + 35, hY + 60};
            g.fillPolygon(h10X, h10Y, 3);
            int h11X[] = {hX + 40, hX + 65, hX + 60};
            int h11Y[] = {hY + 70, hY + 80, hY + 110};
            g.fillPolygon(h11X, h11Y, 3);
            g.setColor(LIGHTCORAL);
            int h12X[] = {hX + 90, hX + 120, hX + 95};
            int h12Y[] = {hY, hY + 30, hY + 35};
            g.fillPolygon(h12X, h12Y, 3);
            g.setColor(CRIMSON);
            int h13X[] = {hX + 90, hX + 110, hX + 120};
            int h13Y[] = {hY, hY + 10, hY + 30};
            g.fillPolygon(h13X, h13Y, 3);
            g.setColor(SALMON);
            int h14X[] = {hX + 95, hX + 120, hX + 110, hX + 65};
            int h14Y[] = {hY + 35, hY + 30, hY + 60, hY + 80};
            g.fillPolygon(h14X, h14Y, 4);
            g.setColor(FIREBRICK);
            int h15X[] = {hX + 65, hX + 110, hX + 60};
            int h15Y[] = {hY + 80, hY + 60, hY + 110};
            g.fillPolygon(h15X, h15Y, 3);
            // heart is drawn using polygons
            int fX = 85; // base x coordinate of fingers
            int fY = 100; // base y coordinate of fingers
            g.setColor(PALEGOLDEN);
            int f1X[] = {fX + 60, fX + 80, fX + 40};
            int f1Y[] = {fY + 10, fY + 30, fY + 45};
            g.fillPolygon(f1X, f1Y, 3);
            int f2X[] = {fX + 90, fX + 100, fX + 80};
            int f2Y[] = {fY + 45, fY + 50, fY + 70};
            g.fillPolygon(f2X, f2Y, 3);
            int f3X[] = {fX + 190, fX + 195, fX + 180};
            int f3Y[] = {fY + 55, fY + 60, fY + 75};
            g.fillPolygon(f3X, f3Y, 3);
            g.setColor(PEACHPUFF);
            int f4X[] = {fX + 20, fX + 55, fX + 60, fX + 40};
            int f4Y[] = {fY + 20, fY + 5, fY + 10, fY + 45};
            g.fillPolygon(f4X, f4Y, 4);
            int f5X[] = {fX + 40, fX + 60, fX + 30};
            int f5Y[] = {fY + 45, fY + 75, fY + 60};
            g.fillPolygon(f5X, f5Y, 3);
            int f6X[] = {fX + 80, fX + 90, fX + 70};
            int f6Y[] = {fY + 30, fY + 45, fY + 50};
            g.fillPolygon(f6X, f6Y, 3);
            int f7X[] = {fX + 100, fX + 105, fX + 90};
            int f7Y[] = {fY + 50, fY + 70, fY + 60};
            g.fillPolygon(f7X, f7Y, 3);
            int f8X[] = {fX + 120, fX + 140, fX + 120};
            int f8Y[] = {fY + 60, fY + 70, fY + 75};
            g.fillPolygon(f8X, f8Y, 3);
            g.setColor(DARKSALMON);
            int f9X[] = {fX + 20, fX + 40, fX + 10};
            int f9Y[] = {fY + 20, fY + 45, fY + 40};
            g.fillPolygon(f9X, f9Y, 3);
            int f10X[] = {fX + 40, fX + 80, fX + 60};
            int f10Y[] = {fY + 45, fY + 30, fY + 75};
            g.fillPolygon(f10X, f10Y, 3);
            int f11X[] = {fX + 120, fX + 140, fX + 130};
            int f11Y[] = {fY + 75, fY + 70, fY + 90};
            g.fillPolygon(f11X, f11Y, 3);
            g.setColor(SIENNA);
            int f12X[] = {fX + 140, fX + 180, fX + 160};
            int f12Y[] = {fY + 70, fY + 55, fY + 70};
            g.fillPolygon(f12X, f12Y, 3);
            g.setColor(LIGHTSALMON);
            int f13X[] = {fX + 100, fX + 120, fX + 120, fX + 110, fX + 105};
            int f13Y[] = {fY + 50, fY + 60, fY + 75, fY + 80, fY + 70};
            g.fillPolygon(f13X, f13Y, 5);
            int f14X[] = {fX + 160, fX + 180, fX + 190, fX + 180};
            int f14Y[] = {fY + 70, fY + 55, fY + 55, fY + 75};
            g.fillPolygon(f14X, f14Y, 4);
            g.setColor(BURLYWOOD);
            int f15X[] = {fX + 70, fX + 90, fX + 80, fX + 60};
            int f15Y[] = {fY + 50, fY + 45, fY + 70, fY + 75};
            g.fillPolygon(f15X, f15Y, 4);
            g.setColor(ROSYBROWN);
            int f16X[] = {fX + 10, fX + 40, fX + 30, fX};
            int f16Y[] = {fY + 40, fY + 45, fY + 60, fY + 60};
            g.fillPolygon(f16X, f16Y, 4);
            int f17X[] = {fX + 110, fX + 120, fX + 130};
            int f17Y[] = {fY + 80, fY + 75, fY + 90};
            g.fillPolygon(f17X, f17Y, 3);
            g.setColor(CHOCOLATE);
            int f18X[] = {fX + 80, fX + 90, fX + 105, fX + 110};
            int f18Y[] = {fY + 70, fY + 60, fY + 70, fY + 80};
            g.fillPolygon(f18X, f18Y, 4);
            int f19X[] = {fX + 140, fX + 160, fX + 160, fX + 150, fX + 130};
            int f19Y[] = {fY + 70, fY + 70, fY + 75, fY + 90, fY + 90};
            g.fillPolygon(f19X, f19Y, 5);
            g.setColor(SADDLEBROWN);
            int f20X[] = {fX + 160, fX + 180, fX + 150, fX + 160};
            int f20Y[] = {fY + 70, fY + 75, fY + 90, fY + 75};
            g.fillPolygon(f20X, f20Y, 4);
            g.setColor(PERU);
            int f21X[] = {fX, fX + 30, fX + 40};
            int f21Y[] = {fY + 60, fY + 60, fY + 80};
            g.fillPolygon(f21X, f21Y, 3);
            int f22X[] = {fX + 60, fX + 70, fX + 70, fX + 60};
            int f22Y[] = {fY + 75, fY + 90, fY + 110, fY + 95};
            g.fillPolygon(f22X, f22Y, 4);
            int f23X[] = {fX + 70, fX + 90, fX + 100, fX + 110, fX + 130};
            int f23Y[] = {fY + 110, fY + 100, fY + 90, fY + 100, fY + 115};
            g.fillPolygon(f23X, f23Y, 5);
            g.setColor(SADDLEBROWN);
            int f24X[] = {fX + 30, fX + 60, fX + 60, fX + 40};
            int f24Y[] = {fY + 60, fY + 75, fY + 95, fY + 80};
            g.fillPolygon(f24X, f24Y, 4);
            int f25X[] = {fX + 70, fX + 80, fX + 100, fX + 90};
            int f25Y[] = {fY + 100, fY + 70, fY + 90, fY + 100};
            g.fillPolygon(f25X, f25Y, 4);
            int f26X[] = {fX + 140, fX + 160, fX + 150, fX + 130};
            int f26Y[] = {fY + 90, fY + 105, fY + 115, fY + 115};
            g.fillPolygon(f26X, f26Y, 4);
            g.setColor(ROSYBROWN);
            int f27X[] = {fX + 60, fX + 80, fX + 70, fX + 70};
            int f27Y[] = {fY + 75, fY + 70, fY + 100, fY + 90};
            g.fillPolygon(f27X, f27Y, 4);
            int f28X[] = {fX + 80, fX + 110, fX + 100};
            int f28Y[] = {fY + 70, fY + 80, fY + 90};
            g.fillPolygon(f28X, f28Y, 3);
            int f29X[] = {fX + 150, fX + 180, fX + 180};
            int f29Y[] = {fY + 90, fY + 75, fY + 90};
            g.fillPolygon(f29X, f29Y, 3);
            int f30X[] = {fX + 140, fX + 150, fX + 160};
            int f30Y[] = {fY + 90, fY + 90, fY + 105};
            g.fillPolygon(f30X, f30Y, 3);
            g.setColor(DARKSALMON);
            int f31X[] = {fX + 150, fX + 180, fX + 160};
            int f31Y[] = {fY + 90, fY + 90, fY + 105};
            g.fillPolygon(f31X, f31Y, 3);
            g.setColor(LIGHTSALMON);
            int f32X[] = {fX + 195, fX + 210, fX + 225};
            int f32Y[] = {fY + 60, fY + 55, fY + 60};
            g.fillPolygon(f32X, f32Y, 3);
            g.setColor(SIENNA);
            int f33X[] = {fX + 180, fX + 195, fX + 190, fX + 180};
            int f33Y[] = {fY + 75, fY + 60, fY + 80, fY + 90};
            g.fillPolygon(f33X, f33Y, 4);
            g.setColor(CHOCOLATE);
            int f34X[] = {fX + 110, fX + 120, fX + 130};
            int f34Y[] = {fY + 100, fY + 100, fY + 115};
            g.fillPolygon(f34X, f34Y, 3);
            int f35X[] = {fX + 195, fX + 210, fX + 190};
            int f35Y[] = {fY + 60, fY + 70, fY + 80};
            g.fillPolygon(f35X, f35Y, 3);
            g.setColor(ORANGE);
            int f36X[] = {fX + 70, fX + 90, fX + 70};
            int f36Y[] = {fY + 100, fY + 100, fY + 110};
            g.fillPolygon(f36X, f36Y, 3);
            int f37X[] = {fX + 195, fX + 225, fX + 220, fX + 210};
            int f37Y[] = {fY + 60, fY + 60, fY + 70, fY + 70};
            g.fillPolygon(f37X, f37Y, 4);
            int f38X[] = {fX + 100, fX + 110, fX + 130, fX + 120, fX + 110};
            int f38Y[] = {fY + 90, fY + 80, fY + 90, fY + 100, fY + 100};
            g.fillPolygon(f38X, f38Y, 5);
            g.setColor(NAVAJOWHITE);
            int f39X[] = {fX + 70, fX + 90, fX + 130};
            int f39Y[] = {fY + 110, fY + 125, fY + 115};
            g.fillPolygon(f39X, f39Y, 3);
            int f40X[] = {fX + 120, fX + 130, fX + 140, fX + 130};
            int f40Y[] = {fY + 100, fY + 90, fY + 90, fY + 115};
            g.fillPolygon(f40X, f40Y, 4);
            // hand is drawn using polygons
            g.setColor(Color.black);
            g.drawLine(fX + 0, fY + 60, fX + 30, fY + 60);
            g.drawLine(fX + 30, fY + 60, fX + 60, fY + 75);
            g.drawLine(fX + 60, fY + 75, fX + 80, fY + 70);
            g.drawLine(fX + 80, fY + 70, fX + 110, fY + 80);
            g.drawLine(fX + 110, fY + 80, fX + 130, fY + 90);
            g.drawLine(fX + 130, fY + 90, fX + 150, fY + 90);
            g.drawLine(fX + 150, fY + 90, fX + 180, fY + 75);
            g.drawLine(fX + 180, fY + 75, fX + 195, fY + 60);
            // lines are drawn to separate fingers of the hand
            g.setColor(LIGHT_PINK);
            for (int i = 0; i <= 775; i += 25) {
                g.fillArc(2 + i, 3, 25, 21, 180, 180);
            }
            g.setColor(new Color(255, 228, 225));
            g.fillRect(0, 0, 800, 15);
            g.fillRect(0, 465, 800, 15);
            for (int i = 0; i <= 775; i += 25) {
                g.fillArc(0 + i, 5, 25, 17, 180, 180);
            }
            g.setColor(new Color(175, 0, 105, 200));
            for (int i = 0; i <= 775; i += 25) {
                g.fillOval(9 + i, 17, 10, 4);
            }
            // borders are drawn

            // Draws ovals as part of the background
            Font monoFont3 = new Font("Monospaced", Font.ITALIC, 30);
            g.setFont(monoFont3);
            g.setColor(new Color(128, 0, 128));
            g.drawString("The world wouldn't", 37, 262);
            g.drawString("   be the same", 37, 302);
            g.drawString("   without you!", 37, 342);
            g.setColor(Color.white);
            g.drawString("The world wouldn't", 35, 260);
            g.drawString("   be the same", 35, 300);
            g.drawString("   without you!", 35, 340);

            try {
                g.drawImage(ImageIO.read(new File("women.png")).getScaledInstance(387, 310, Image.SCALE_SMOOTH), 10, 325, this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        private void screen2()
        {
            // borders are drawn
            // draws the shape which contains "International Women's Day"
            g.setColor(new Color(75, 0, 130, 150));
            g.drawArc(75, 200, 250, 70, 180, 180);
            Font monoFont1 = new Font("Monospaced", Font.BOLD, 45);
            g.setFont(monoFont1);
            g.setColor(Color.red);
            g.drawString("H", 132, 302);
            g.setColor(Color.yellow);
            g.drawString("A", 162, 307);
            g.setColor(Color.green);
            g.drawString("P", 192, 310);
            g.setColor(Color.blue);
            g.drawString("P", 222, 307);
            g.setColor(Color.magenta);
            g.drawString("Y", 252, 302);
            g.setColor(Color.white);
            g.drawString("H", 130, 300);
            g.drawString("A", 160, 305);
            g.drawString("P", 190, 308);
            g.drawString("P", 220, 305);
            g.drawString("Y", 250, 300);
            // Draws "HAPPY"

            g.setColor(new Color(75, 0, 130, 150));
            g.fillRect(75, 315, 250, 90);
            int[] tLX = {75, 15, 45, 15, 75};
            int[] tLY = {290, 290, 325, 360, 360};
            g.fillPolygon(tLX, tLY, 5);
            int[] tRX = {325, 385, 355, 385, 325};
            int[] tRY = {290, 290, 325, 360, 360};
            g.fillPolygon(tRX, tRY, 5);
            g.setColor(new Color(0, 0, 0, 150));
            g.drawRect(75, 315, 250, 90);
            g.drawPolygon(tLX, tLY, 5);
            g.drawPolygon(tRX, tRY, 5);

            Font monoFont2 = new Font("Monospaced", Font.PLAIN, 30);
            g.setFont(monoFont2);
            g.setColor(Color.black);
            g.drawString("International", 87, 352);
            g.drawString(" Women's Day", 87, 392);
            g.setColor(Color.white);
            g.drawString("International", 85, 350);
            g.drawString(" Women's Day", 85, 390);

            // Draws "International Women's Day"
            pinkEllipse(215, 221, 88, 88);
            backgroundEllipse(174, 186, 160, 120);
            pinkEllipse(146, 208, 56, 56);
            backgroundEllipse(158, 196, 56, 56);
            pinkEllipse(184, 79, 88, 60);
            pinkEllipse(142, 137, 88, 88);
            pinkEllipse(251, 121, 96, 96);
            backgroundEllipse(194, 134, 148, 129);
            pinkEllipse(183, 91, 41, 25);
            backgroundEllipse(192, 134, 83, 96);
            pinkEllipse(159, 194, 32, 32);
            backgroundEllipse(170, 186, 38, 38);
            pinkEllipse(222, 131, 76, 76);
            pinkEllipse(167, 138, 60, 67);
            pinkEllipse(202, 190, 64, 83);
            backgroundEllipse(196, 157, 83, 99);
            pinkEllipse(196, 157, 64, 76);
            pinkEllipse(88, 191, 44, 44);
            pinkEllipse(290, 198, 48, 48);
            // Methods are used to draw the flower
        }
        private void backgroundEllipse(int a, int b, int c, int d) {
            g.setColor(Color.white);
            centeredOval(a, b, c, d);
        }

        private void pinkEllipse(int a, int b, int c, int d) {
            g.setColor(LIGHT_PINK);
            centeredOval(a, b, c, d);
            g.setColor(PINK);
            for (double sc = 0.8; sc >= 0.6; sc -= 0.03) {
                centeredOval(a, b, (int) (c * sc), (int) (d * sc));
            }
            g.setColor(DARK_PINK);
            for (double sc = 0.6; sc >= 0; sc -= 0.05) {
                centeredOval(a, b, (int) (c * sc), (int) (d * sc));
            }
        }

        private void centeredOval(int a, int b, int c, int d) {
            g.fillOval(a - c / 2, b - d / 2, c, d);
        }
    }
}
