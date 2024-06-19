// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,-2);
        Point p2 = new Point(5,7);
        Point p3 = new Point(3,-2);
        ExtendedPoint p4 = new ExtendedPoint(3,-2,"bla bla");
        ExtendedPoint p5 = new ExtendedPoint(3,-2,"bla bla say it");
        String s1 = "Java";
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(s1));
        System.out.println(p1.equals(p4));
        System.out.println(p4.equals(p5));


    }
}