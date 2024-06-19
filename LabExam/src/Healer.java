
public class Healer extends Character {

    public Healer(String name) {
        super(name);
    }
    
	@Override
	public boolean attack(Character enemy, Weapon item) {
		return false;
	}

	@Override
	public boolean heal(Character usedOn, Herb item) {
		if (!item.isConsumed()) {
			item.use(this, usedOn);
			item.setAsConsumed();
		}
		
		return true;
	}

	@Override
	public double attackFactor() {
		return 0.0;
	}

	@Override
	public double healingFactor() {
		return 1.0;
	}
	
	public String healingMagicSpell() {
		return "In the name of it, be good";
	}

}
