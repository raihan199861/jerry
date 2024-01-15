import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CircleScaler {
    public static void main(String[] args) {
        // Create a frame to display the circles
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a panel to draw the circles
        JPanel panel = new JPanel() {
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

                // Scale and draw the scaled circle
                double scale = 2.0;
                int scaledX = 200;
                int scaledY = 200;
                int scaledRadius = (int) (originalRadius * scale);
                Ellipse2D scaledCircle = new Ellipse2D.Double(scaledX - scaledRadius, scaledY - scaledRadius, 2 * scaledRadius, 2 * scaledRadius);
                g2d.setColor(Color.RED);
                g2d.draw(scaledCircle);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
