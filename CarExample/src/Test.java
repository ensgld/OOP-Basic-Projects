
public class Test {

	public static void main(String[] args) {	

		CarKeyPackage purchasedCar = CarFactory.produce();
		
		Car car = purchasedCar.car;
		Key key = purchasedCar.key;
	
		//ownerTest(car, key);
		
		thiefTest(car);
	}

	static public void ownerTest(Car car, Key key) {
		
		System.out.println(car);
			
		car.startCar();
		System.out.println(car);
		
		car.openDoor(key);		
		System.out.println(car);
		
		car.startCar();
		for (int i=0; i<5; i++) {
			car.increaseSpeed(50);
			System.out.println(car);
		}
	}
	
	static public void thiefTest(Car car) {
		System.out.println(car);
		
		car.startCar();
		System.out.println(car);
		
		//Door thiefDoor = new Door(10);
		//car.door = thiefDoor;
		
		Key thiefKey = new Key(10);
		
		car.openDoor(thiefKey);		
		System.out.println(car);
		
		car.startCar();
		for (int i=0; i<5; i++) {
			car.increaseSpeed(50);
			System.out.println(car);
		}		
	}
	
}
