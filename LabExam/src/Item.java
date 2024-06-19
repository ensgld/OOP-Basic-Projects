
abstract class Item implements Usable {

    @Override
    public String toString() {
    	return "Item type is " + this.getName()
    		+ " (" + getDescription() + ") "
    		+ (isConsumable() ? ", Consumable" : "");
    }	
    
    public String getName() {
    	return this.getClass().getName();
    }

    public abstract double getStrength();
    
}
