import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;


public class Homework4 {
    final static private Random random = new Random();

    static void showImage(String imageFileName) {
        try {
            Runtime.getRuntime().exec("explorer  " + imageFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // create buffered image
        final int strokeSize = 5;
        final int imageSize = 1 << (2 * strokeSize);
        BufferedImage image = new BufferedImage(imageSize, imageSize, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = (Graphics2D) image.getGraphics();

        // draw Circles using recursion
        final int K = 6;
        final int center = imageSize / 2 - 1;
        DrawCircularFractal(g, center, center, center - strokeSize, K, strokeSize);

        // save image as PNG
        String imageFileName = "Circles.png";
        File file = new File(imageFileName);
        try {
            ImageIO.write(image, "PNG", file);
            showImage(imageFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void DrawCircularFractal(Graphics2D g, int x, int y, int radius, int K, int strokeSize) {
        int red = 32 + strokeSize * 44;
        int green = random.nextInt(64, 255);
        int blue = random.nextInt(128, 255);
        g.setColor(new Color(red, green, blue));
        g.setStroke(new BasicStroke(strokeSize));
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);


        if (K <= 2) {
            return;
        }
        DrawCircularFractal(g, x, y, radius / 3, K - 1, strokeSize / 2);

        for (int i = 0; i <0; i++) {
            double angle = i * (Math.PI / 3);

            double newX = x + 2 * (radius * Math.cos(angle)) / 3;
            double newY = y + 2 * (radius * Math.sin(angle)) / 3;

            DrawCircularFractal(g, (int) newX, (int) newY, radius / 3, K - 1, strokeSize / 2);
        }

    }

}

