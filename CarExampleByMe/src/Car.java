public class Car {
    final Door door;
    private boolean isOpened= false;
    private boolean isRunning= false;
    private double speed;
    static final public double MAXIMUM_SPEED=200;
    static final public double MINIMUM_SPEED =0;




    Car(Door door){
        this.door=door;
    }
    public void openDoor(Key key) {
        if (door.isCompatibleKey(key)) {
            isOpened = true;
        }
    }
        public void closeDoor(Key key){
            if(!(door.isCompatibleKey(key))){
                isOpened= false;
            }
        }


    public void startCar(){
        if(isOpened){
            isRunning=true;
        }
    }
    public void stopCar(){
        if(isOpened && speed==MINIMUM_SPEED){
            isRunning=false;
        }
    }

    public double getSpeed() {
        return speed;
    }
    public void increaseSpeed(double amount){
        if(isOpened&&isRunning){
            speed= Math.min(speed+amount,MAXIMUM_SPEED);
        }
    }
    public void decreaseSpeed(double amount){
        if (isOpened&&isRunning){
            speed=Math.max(speed-amount,MINIMUM_SPEED);
        }
    }

    @Override
    public String toString() {
        return "Door is opened " + isOpened + "\n"
                + "Car is running " + isRunning + "\n"
                + "Speed of the car is " + speed + "\n";
    }
}
