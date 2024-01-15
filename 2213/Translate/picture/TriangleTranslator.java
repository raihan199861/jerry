import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class TriangleTranslator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Triangle Translator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    // Draw the original triangle
                    int[] originalXPoints = {50, 150, 100};
                    int[] originalYPoints = {50, 50, 150};
                    int nPoints = 3;
                    Path2D originalTriangle = new Path2D.Double();
                    originalTriangle.moveTo(originalXPoints[0], originalYPoints[0]);
                    for (int i = 1; i < nPoints; i++) {
                        originalTriangle.lineTo(originalXPoints[i], originalYPoints[i]);
                    }
                    originalTriangle.closePath();
                    g2d.setColor(Color.BLUE);
                    g2d.draw(originalTriangle);

                    // Translate the triangle and draw the translated triangle
                    int dx = 100; // Translation along x-axis
                    int dy = 50;  // Translation along y-axis
                    int[] translatedXPoints = new int[nPoints];
                    int[] translatedYPoints = new int[nPoints];
                    for (int i = 0; i < nPoints; i++) {
                        translatedXPoints[i] = originalXPoints[i] + dx;
                        translatedYPoints[i] = originalYPoints[i] + dy;
                    }
                    Path2D translatedTriangle = new Path2D.Double();
                    translatedTriangle.moveTo(translatedXPoints[0], translatedYPoints[0]);
                    for (int i = 1; i < nPoints; i++) {
                        translatedTriangle.lineTo(translatedXPoints[i], translatedYPoints[i]);
                    }
                    translatedTriangle.closePath();
                    g2d.setColor(Color.RED);
                    g2d.draw(translatedTriangle);
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
