// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void ownerTest(Car car,Key key){
        System.out.println(car);
        car.openDoor(key);
        car.startCar();

        for(int i=0;i<5;i++){
            car.increaseSpeed(50);
            System.out.println(car);
        }
        for(int i=0;i<2;i++){
            car.decreaseSpeed(20);
            System.out.println(car);
        }
    }

    public static void thiefTest(Car car){
        System.out.println(car);


        car.startCar();

        for(int i=0;i<5;i++){
            car.increaseSpeed(50);
            System.out.println(car);
        }
        for(int i=0;i<2;i++){
            car.decreaseSpeed(20);
            System.out.println(car);
        }

    }
    public static void main(String[] args) {
        CarKeyPackage purchasedCar= CarFactory.produce();
        Car car = purchasedCar.car;
        Key key = purchasedCar.key;
        ownerTest(car,key);
        thiefTest(car);

        }

    }
