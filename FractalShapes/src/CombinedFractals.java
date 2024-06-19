    import java.awt.Color;
    import java.awt.Graphics;
    import javax.swing.JFrame;
    import javax.swing.JPanel;

    public class CombinedFractals extends JFrame {

        private final int WIDTH = 800;
        private final int HEIGHT = 800;

        public CombinedFractals() {
            setTitle("Combined Fractals Example");
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

                // Mandelbrot Fraktalı çizimi
                drawMandelbrot(g, WIDTH / 2, HEIGHT / 2, WIDTH / 4, HEIGHT / 4);

                // Ağaç Fraktalı çizimi
                drawTree(g, WIDTH / 2, HEIGHT, 90, 10);
            }

            // Mandelbrot Fraktalını çizen metod
            private void drawMandelbrot(Graphics g, int x, int y, int width, int height) {
                // Mandelbrot parametreleri
                double minRe = -2.0;
                double maxRe = 1.0;
                double minIm = -1.5;
                double maxIm = 1.5;

                // Çizimdeki piksel sayıları
                int maxIteration = 1000;

                // Piksel boyutları
                double reFactor = (maxRe - minRe) / width;
                double imFactor = (maxIm - minIm) / height;

                // Renk skalası
                int[] colors = new int[maxIteration];
                for (int i = 0; i < maxIteration; i++) {
                    colors[i] = Color.HSBtoRGB(i / 256f, 1, i / (i + 8f));
                }

                // Her pikseli kontrol et
                for (int px = 0; px < width; px++) {
                    for (int py = 0; py < height; py++) {
                        // Mandelbrot koordinatları
                        double cRe = minRe + (x - width / 2 + px) * reFactor;
                        double cIm = maxIm - (y - height / 2 + py) * imFactor;

                        // Mandelbrot algoritması
                        double xRe = cRe;
                        double xIm = cIm;
                        int iteration = 0;
                        while (iteration < maxIteration && (xRe * xRe + xIm * xIm) < 4) {
                            double xReNew = xRe * xRe - xIm * xIm + cRe;
                            double xImNew = 2 * xRe * xIm + cIm;
                            xRe = xReNew;
                            xIm = xImNew;
                            iteration++;
                        }

                        // Pikselin rengini belirle
                        Color color = (iteration == maxIteration) ? Color.BLACK : new Color(colors[iteration]);

                        // Pikseli çiz
                        g.setColor(color);
                        g.fillRect(px + x - width / 2, py + y - height / 2, 1, 1);
                    }
                }
            }

            // Ağaç Fraktalını çizen özyinelemeli metod
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
            new CombinedFractals();
        }
    }
