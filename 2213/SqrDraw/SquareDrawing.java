import java.awt.*;
import javax.swing.*;

public class SquareDrawing extends JPanel {

    public void translateLine(int[] P, int[] T) {
        // Implement the translation logic here
        P[0] += T[0];
        P[1] += T[1];
        P[2] += T[0];
        P[3] += T[1];
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the square
        int[] line1 = {150, 150, 250, 150}; // (x1, y1), (x2, y2)
        int[] line2 = {250, 150, 250, 250}; // (x1, y1), (x2, y2)
        int[] line3 = {250, 250, 150, 250}; // (x1, y1), (x2, y2)
        int[] line4 = {150, 250, 150, 150}; // (x1, y1), (x2, y2)

        g.drawLine(line1[0], line1[1], line1[2], line1[3]);
        g.drawLine(line2[0], line2[1], line2[2], line2[3]);
        g.drawLine(line3[0], line3[1], line3[2], line3[3]);
        g.drawLine(line4[0], line4[1], line4[2], line4[3]);

        // Translate the square
        int[] translation = {100, 100};
        translateLine(line1, translation);
        translateLine(line2, translation);
        translateLine(line3, translation);
        translateLine(line4, translation);

        // Draw the translated square
        g.setColor(Color.RED);
        g.drawLine(line1[0], line1[1], line1[2], line1[3]);
        g.drawLine(line2[0], line2[1], line2[2], line2[3]);
        g.drawLine(line3[0], line3[1], line3[2], line3[3]);
        g.drawLine(line4[0], line4[1], line4[2], line4[3]);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square Drawing");
        SquareDrawing drawing = new SquareDrawing();

        frame.add(drawing);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
