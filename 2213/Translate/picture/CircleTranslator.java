import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleTranslator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Circle Translator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    // Draw the original circle
                    int originalX = 50;
                    int originalY = 50;
                    int originalRadius = 30;
                    Ellipse2D originalCircle = new Ellipse2D.Double(originalX - originalRadius, originalY - originalRadius, 2 * originalRadius, 2 * originalRadius);
                    g2d.setColor(Color.BLUE);
                    g2d.draw(originalCircle);

                    // Translate the circle and draw the translated circle
                    int dx = 100; // Translation along x-axis
                    int dy = 50;  // Translation along y-axis
                    int translatedX = originalX + dx;
                    int translatedY = originalY + dy;
                    Ellipse2D translatedCircle = new Ellipse2D.Double(translatedX - originalRadius, translatedY - originalRadius, 2 * originalRadius, 2 * originalRadius);
                    g2d.setColor(Color.RED);
                    g2d.draw(translatedCircle);
                }

                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(400, 400);
                }
            });
            frame.pack();
            frame.setVisible(true);
        });
    }
}
