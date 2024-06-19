
public class Rogue extends Character {

    public Rogue(String name) {
        super(name);
    }
    
	@Override
	public boolean attack(Character enemy, Weapon item) {
		return false;
	}

	@Override
	public boolean heal(Character usedOn, Herb item) {
		return false;
	}

	@Override
	public double attackFactor() {
		return 0.0;
	}

	@Override
	public double healingFactor() {
		return 0.0;
	}
	
	public String myMotto() {
		return "I do not heal, I do not hit, I just steal";
	}

}
