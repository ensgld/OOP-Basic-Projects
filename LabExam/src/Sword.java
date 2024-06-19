
public class Sword extends Weapon {

	@Override
	public void use(Character user, Character usedOn) {
		double damage = user.attackFactor() * getStrength(); 
		usedOn.takeDamage( damage );
	}
	
	@Override
	public boolean isConsumable() {
		return false;
	}
	
	@Override
	public String getDescription() {
		return "Sword can be used to attack enemy";
	}

	@Override
	public double getStrength() {
		return 15.0;
	}

}
