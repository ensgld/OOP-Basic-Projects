
public class MagicHerb extends Herb {

	@Override
	public void use(Character user, Character usedOn) {
		double healingAmount = user.healingFactor() * getStrength(); 
		usedOn.heal(healingAmount);
	}

	@Override
	public boolean isConsumable() {
		return true;
	}

	@Override
	public String getDescription() {
		return "Magic herb can be used to heal yourself or a friend";
	}

	@Override
	public double getStrength() {
		return 50.0;
	}

}
