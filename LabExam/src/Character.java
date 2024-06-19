
abstract class Character {
	public static final int MAXIMUM_HEALTH = 100;
    private double health = MAXIMUM_HEALTH;
    private final String name;
    public final Inventory inventory = new Inventory();

    public Character(String name) {
        this.name = name;
    }

    public abstract boolean attack(Character enemy, Weapon item);

    public abstract boolean heal(Character usedOn, Herb item); 
    
    // heal yourself
    public boolean heal(Herb item) {
    	return heal(this, item);
    }
    
    public abstract double attackFactor();

    public abstract double healingFactor();
    
    public void buy(Item item) {
    	
    }
    
    public String getName() {
    	return name;
    }
    
    public boolean isAlive() {
    	return (health > 0);
    }

    public void takeDamage(double damage) {
        health = Math.max(health - damage, 0.0);
    }

    public void heal(double amount) {
    	if (isAlive()) {
    		health = Math.min(health + amount, MAXIMUM_HEALTH);
    	}
    }

    public double getHealthLevel() {
    	return health;
    }
    
    @Override
    public String toString() {
    	return getName() 
    			+ ",  Health = " + getHealthLevel()
    			+ ",  Character type is " + this.getClass().getName(); 
    }
}
