import javax.swing.*;
import java.awt.*;

public class LineScaler {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Line Scaler");
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

                    // Scale the line and draw the scaled line
                    double scaleFactor = 2.0;
                    int scaledX1 = 200;
                    int scaledY1 = 50;
                    int scaledX2 = 300;
                    int scaledY2 = 100;
                    g2d.setColor(Color.RED);
                    g2d.drawLine(scaledX1, scaledY1, scaledX2, scaledY2);
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
