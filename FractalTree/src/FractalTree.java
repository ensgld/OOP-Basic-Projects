import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FractalTree extends JFrame {

    private final int WIDTH = 800;
    private final int HEIGHT = 800;

    public FractalTree() {
        setTitle("Fractal Tree Example");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FractalPanel panel = new FractalPanel();
        add(panel);

        setVisible(true);
    }

    private class FractalPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawTree(g, WIDTH / 2, HEIGHT, 90, 10);
        }

        private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
            if (depth == 0) {
                return;
            }

            int length = 50;

            int x2 = x1 + (int) (length * Math.cos(Math.toRadians(angle)));
            int y2 = y1 - (int) (length * Math.sin(Math.toRadians(angle)));

            g.drawLine(x1, y1, x2, y2);

            drawTree(g, x2, y2, angle - 30, depth - 1);
            drawTree(g, x2, y2, angle + 30, depth - 1);
        }
    }

    public static void main(String[] args) {
        new FractalTree();
    }
}
