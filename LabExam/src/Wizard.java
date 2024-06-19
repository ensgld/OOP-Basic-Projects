
public class Wizard extends Character {

    public Wizard(String name) {
        super(name);
    }
    
	@Override
	public boolean attack(Character enemy, Weapon item) {
		item.use(this, enemy);
		
		return true;
	}

	@Override
	public boolean heal(Character usedOn, Herb item) {
		item.use(this, usedOn);
		
		return true;
	}

	@Override
	public double attackFactor() {
		return 0.6;
	}

	@Override
	public double healingFactor() {
		return 0.4;
	}

	public String attackMagicSpell() {
		return "In the name of it, die";
	}
	
	public String healingMagicSpell() {
		return "In the name of it, be good";
	}
	
}
