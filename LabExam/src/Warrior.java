
class Warrior extends Character {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public boolean attack(Character enemy, Weapon item) {
    	item.use(this, enemy);
    	
    	return true;
    }

    @Override
    public boolean heal(Character usedOn, Herb item) {
    	return false;
    } 
    
    @Override
    public double attackFactor() {
    	return 1.0;
    }

    @Override
    public double healingFactor() {
    	return 0.0;
    }
    
    public String getClanName() {
    	return "Warrior Clan";
    }
}
