
public class Car {

	final Door door;
	private boolean isOpened = false;
	private boolean isRunning = false;
	private double speed;
	static public final double MAXIMUM_SPEED = 200.0;

	Car(Door door) {
		this.door = door;
	}
	
	public void openDoor(Key key) {
		if (door.isCompatibleKey(key)) {
			isOpened = true;
		}
	}
	
	public void closeDoor() {
		isOpened = false;
	}
	
	public void startCar() {
		if (isOpened) {
			isRunning = true;
		}
	}
	
	public void stopCar() {
		if (isOpened && speed == 0) {
			isRunning = false;
		}
	}
	
	public double getSpeed() {
		return speed;
	}
	
	void increaseSpeed(double amount) {
		if (isOpened && isRunning) {
			speed = Math.min(speed + amount, MAXIMUM_SPEED);
		}
	}
	
	void decraseSpeed(double amount) {
		if (isOpened && isRunning) {
			speed = Math.max(speed - amount, 0);
		}
	}
	
	public String toString() {
		return "Door is opened: " + isOpened + "\n"
				+ "Car is running: " + isRunning + "\n"
				+ "Speed of the car is " + speed + "\n";
	}
}
