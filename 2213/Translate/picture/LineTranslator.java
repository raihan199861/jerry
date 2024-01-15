import javax.swing.*;
import java.awt.*;

public class LineTranslator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Line Translator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    // Draw the original line
                    int originalX1 = 50;
                    int originalY1 = 50;
                    int originalX2 = 150;
                    int originalY2 = 100;
                    g2d.setColor(Color.BLUE);
                    g2d.drawLine(originalX1, originalY1, originalX2, originalY2);

                    // Translate the line and draw the translated line
                    int dx = 100; // Translation along x-axis
                    int dy = 50;  // Translation along y-axis
                    int translatedX1 = originalX1 + dx;
                    int translatedY1 = originalY1 + dy;
                    int translatedX2 = originalX2 + dx;
                    int translatedY2 = originalY2 + dy;
                    g2d.setColor(Color.RED);
                    g2d.drawLine(translatedX1, translatedY1, translatedX2, translatedY2);
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
