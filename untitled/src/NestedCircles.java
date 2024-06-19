import java.awt.*;
import javax.swing.*;

public class NestedCircles extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public NestedCircles() {
        super("Nested Circles");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        int radius = 200;
        drawNestedCircles(g, centerX, centerY, radius, 5);
    }

    private void drawNestedCircles(Graphics g, int x, int y, int radius, int numCircles) {
        if (numCircles > 0) {
            drawCircle(g, x, y, radius);
            drawNestedCircles(g, x, y - radius / 2, radius / 2, numCircles - 1); // Üst daire
            drawNestedCircles(g, x, y + radius / 2, radius / 2, numCircles - 1); // Alt daire
            drawNestedCircles(g, x - radius / 2, y, radius / 2, numCircles - 1); // Sol daire
            drawNestedCircles(g, x + radius / 2, y, radius / 2, numCircles - 1); // Sağ daire
        }
    }

    private void drawCircle(Graphics g, int x, int y, int radius) {
        g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NestedCircles circles = new NestedCircles();
            circles.setVisible(true);
        });
    }
}

