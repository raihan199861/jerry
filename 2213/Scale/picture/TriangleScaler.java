import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

public class TriangleScaler {
    public static void main(String[] args) {
        // Create a frame to display the triangles
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a panel to draw the triangles
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Draw the original triangle
                int[] xPoints = {50, 150, 100};
                int[] yPoints = {50, 50, 150};
                int nPoints = 3;
                Path2D originalTriangle = new Path2D.Double();
                originalTriangle.moveTo(xPoints[0], yPoints[0]);
                for (int i = 1; i < nPoints; i++) {
                    originalTriangle.lineTo(xPoints[i], yPoints[i]);
                }
                originalTriangle.closePath();
                g2d.setColor(Color.BLUE);
                g2d.draw(originalTriangle);

                // Scale and draw the scaled triangle
                double scale = 2.0;
                AffineTransform transform = AffineTransform.getScaleInstance(scale, scale);
                Path2D scaledTriangle = (Path2D) originalTriangle.clone();
                scaledTriangle.transform(transform);
                g2d.setColor(Color.RED);
                g2d.draw(scaledTriangle);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
