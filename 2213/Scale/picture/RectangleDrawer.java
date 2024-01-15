import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class RectangleDrawer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rectangle Scaler");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    // Draw the original rectangle
                    int originalX = 50;
                    int originalY = 50;
                    int originalWidth = 100;
                    int originalHeight = 50;
                    Rectangle2D originalRect = new Rectangle2D.Double(originalX, originalY, originalWidth, originalHeight);
                    g2d.setColor(Color.BLUE);
                    g2d.draw(originalRect);

                    // Scale the rectangle and draw the scaled rectangle
                    double scaleFactor = 1.5;
                    int scaledWidth = (int) (originalWidth * scaleFactor);
                    int scaledHeight = (int) (originalHeight * scaleFactor);
                    int scaledX = 200;
                    int scaledY = 50;
                    Rectangle2D scaledRect = new Rectangle2D.Double(scaledX, scaledY, scaledWidth, scaledHeight);
                    g2d.setColor(Color.RED);
                    g2d.draw(scaledRect);
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
