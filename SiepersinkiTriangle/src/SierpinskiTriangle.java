import java.io.*;
import java.util.Random;
import java.awt.image.*;
import javax.imageio.*;

public class SierpinskiTriangle {

	static void showImage(String imageFileName) {
		try {
			Runtime.getRuntime().exec("explorer  " + imageFileName);    
		} 
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		// create buffered image
		final int level = 5;
		final int width = (int)Math.pow(2.0, 2.0 * level);		
		BufferedImage image = new BufferedImage(width+1, width+1, BufferedImage.TYPE_INT_RGB );

		// draw Sierpinski Triangle using recursion
		final int x = width / 2 + 1;
		final int y = 0;		
		DrawSierpinskiTriangle(image, x, y, width);
		
		// save image as PNG	
		String imageFileName = "SierpinskiTriangle.png"; 
		File file = new File(imageFileName);
		try {
			ImageIO.write(image, "PNG", file);
			showImage(imageFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sierpinski triangle is created and saved as PNG file");
	}

	private static void drawTriangle(BufferedImage image, int x, int y, int width) {
		Random rnd = new Random();		
		final int r = 128 + rnd.nextInt() % 128;
		final int g = 128 + rnd.nextInt() % 128;
		final int b = 128 + rnd.nextInt() % 128;
		final int color = (r << 16) | (g << 8) | b;
		
		for (int i = 0; i < width; i++) {
			image.setRGB(x-i/2, y+i, color);
			image.setRGB(x+i/2, y+i, color);
			image.setRGB(x-i/2, y+width-1, color);
			image.setRGB(x+i/2, y+width-1, color);
		}
	}
	
	// recursive function
	static void DrawSierpinskiTriangle(BufferedImage image, int x, int y, int width)
	{
		final int minimumWidth = 3;
		if (width > minimumWidth) {
			drawTriangle(image, x, y, width);	
			
			DrawSierpinskiTriangle(image, x, y, width/2);
			DrawSierpinskiTriangle(image, x-width/4, y+width/2, width/2);
			DrawSierpinskiTriangle(image, x+width/4, y+width/2, width/2);
		}
	}
	
}
