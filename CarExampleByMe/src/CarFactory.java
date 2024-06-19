import java.util.*;

public class CarFactory {
    static private int carCount=0;
    private static Random random = new Random();

    static CarKeyPackage produce(){
        carCount++;
        int code= carCount*1000+random.nextInt(999);
        Key key= new Key(code);
        Door door= new Door(code);
        Car car= new Car(door);

        return new CarKeyPackage(car,key) ;

    }
}
